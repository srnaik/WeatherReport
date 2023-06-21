package com.abc.weather.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.abc.weather.entity.WeatherReportEntity;
import com.abc.weather.service.WeatherReportService;

@RestController
public class WeatherReportResource {
	
	@Autowired
	private WeatherReportService weatherReportService;
	
	
	@GetMapping(value = "weather/{zipCode}")
	public WeatherReportEntity getWeatherInformation(@PathVariable("zipCode") String zipCode) {
		return weatherReportService.getWetaherReport(zipCode);
	}

}
