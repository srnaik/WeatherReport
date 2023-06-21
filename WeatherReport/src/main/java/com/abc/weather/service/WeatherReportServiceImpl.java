package com.abc.weather.service;

import org.springframework.stereotype.Service;

import com.abc.weather.dao.WeatherReportEclipseLink;
import com.abc.weather.entity.WeatherReportEntity;

@Service
public class WeatherReportServiceImpl implements WeatherReportService{

	@Override
	public WeatherReportEntity getWetaherReport(String zipCode) {
		return getWeatherEportDAO().findByZipCode(zipCode);
	}
	
	
    public WeatherReportEclipseLink getWeatherEportDAO() {
        return new WeatherReportEclipseLink();
    }

}
