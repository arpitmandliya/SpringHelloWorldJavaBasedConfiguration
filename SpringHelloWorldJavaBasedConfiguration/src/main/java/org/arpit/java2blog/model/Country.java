package org.arpit.java2blog.model;

public class Country {

    String countryName;
    
    public Country(String countryName) {
		this.countryName=countryName;
	}
	public String getCountryName() {
        return countryName;
    }
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

}