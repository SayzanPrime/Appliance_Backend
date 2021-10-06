package com.example.appliance.service;

import java.util.List;

import com.example.appliance.dto.ApplianceDto;

public interface IApplianceService {
	
	List<ApplianceDto> getListAppliance();
	
	ApplianceDto getOneAppliance(Long id);
	
	ApplianceDto createAppliance(ApplianceDto dto);
	
	ApplianceDto updateAppliance(Long id);
	
	ApplianceDto deleteAppliance(Long id);

}
