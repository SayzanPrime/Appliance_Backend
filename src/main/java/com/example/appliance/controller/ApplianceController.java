package com.example.appliance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.appliance.dto.ApplianceDto;
import com.example.appliance.service.IApplianceService;

@RestController
@RequestMapping("/appliance")
public class ApplianceController {
	
	@Autowired
	private IApplianceService applianceService;
	
	
	
	@GetMapping(produces = "application/json")
	public  List<ApplianceDto> getAppliance() {

		List<ApplianceDto> appliances = applianceService.getListAppliance();

		return appliances;
	}

	
}
