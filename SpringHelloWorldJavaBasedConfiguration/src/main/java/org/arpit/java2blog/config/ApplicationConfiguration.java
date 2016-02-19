package org.arpit.java2blog.config;
import org.arpit.java2blog.model.Country;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfiguration {

	@Bean(name="countryObj")
	public Country getCountry()
	{
		return new Country("India");
	}
	
}
