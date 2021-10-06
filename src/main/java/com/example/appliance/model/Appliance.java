package com.example.appliance.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="APPLIANCE_TB")
public class Appliance {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private Long id;
	
	@Column(name="LIBELLE")
	private String libelle;
	
	@Column(name="DBID")
	private String dbid;
	
	@Column(name="DISPONIBILITE")
	private Boolean disponibilite;
	
	@Column(name="REFERENCES")
	private String references;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="TYPE")
	private Type type;
	
}
