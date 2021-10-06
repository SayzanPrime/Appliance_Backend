package com.example.appliance.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApplianceDto {
	
	private Long id;
	
	private String libelle;
	
	private String dbid;
	
	private Boolean disponibilite;
	
	private String references;
	
	private Long type;
}
