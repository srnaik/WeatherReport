package com.abc.weather.dao;

import com.abc.weather.entity.WeatherReportEntity;

public class WeatherReportEclipseLink {
	
	
	 public WeatherReportEntity findByZipCode(String zipCode){
	        //return Database.readObject(WeatherReportEntity.class, zipCode, true);
	        return getWeatherReport(zipCode);
	    }


	    private WeatherReportEntity getWeatherReport(String zipCode){
	        if(zipCode.equals("95051")){
	            WeatherReportEntity weatherReportEntity = new WeatherReportEntity();
	            weatherReportEntity.setDescription("Mostly Sunny");
	            weatherReportEntity.setHumidity("61%");
	            weatherReportEntity.setTemperature("60F");
	            weatherReportEntity.setWindInformation("12 miles/h");
	            return weatherReportEntity;
	        }
	        return new WeatherReportEntity();
	    }
	}
