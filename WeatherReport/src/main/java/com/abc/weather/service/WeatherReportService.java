package com.abc.weather.service;

import com.abc.weather.entity.WeatherReportEntity;

public interface WeatherReportService {
	
	public WeatherReportEntity getWetaherReport(String zipCode);

}
