package com.abc.weather.entity;

public class WeatherReportEntity {
	
	private String description;
    private String temperature;
    private String humidity;
    private String windInformation;
    
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getTemprature() {
		return temperature;
	}
	public void setTemperature(String temprature) {
		this.temperature = temprature;
	}
	public String getHumidity() {
		return humidity;
	}
	public void setHumidity(String humidity) {
		this.humidity = humidity;
	}
	public String getWindInformation() {
		return windInformation;
	}
	public void setWindInformation(String windInformation) {
		this.windInformation = windInformation;
	}

}
