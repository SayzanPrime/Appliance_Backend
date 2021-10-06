package com.example.appliance.mapper;

import org.apache.catalina.mapper.Mapper;
import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.appliance.dto.ApplianceDto;
import com.example.appliance.model.Appliance;
import com.example.appliance.repository.ApplianceRepository;



@Component
public class ApplianceMapper {
	
	private Mapper mapper = new DozerBeanMapper();
	
	
	public ApplianceDto ApplianceToApplianceDto(Appliance appliance) {
		ApplianceDto dto = mapper.map(appliance, ApplianceDto.class);
		
		return dto;
	}

}

