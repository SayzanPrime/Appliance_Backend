package com.example.appliance.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.appliance.dto.ApplianceDto;
import com.example.appliance.mapper.ApplianceMapper;
import com.example.appliance.repository.ApplianceRepository;
import com.example.appliance.service.IApplianceService;

@Service
public class ApplianceServiceImpl implements IApplianceService{
	
	@Autowired
	ApplianceRepository repository;
	
	@Autowired
	ApplianceMapper mapper;
	
	
	@Override
	public List<ApplianceDto> getListAppliance() {
		return mapper.ApplianceToApplianceDto(repository.findAll());
	}

}
