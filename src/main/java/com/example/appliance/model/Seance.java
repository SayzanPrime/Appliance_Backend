package com.example.appliance.model;

import java.util.Date;

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
@Table(name="SEANCE_TB")
public class Seance {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private Long id;
	
	@Column(name = "DATE_SEANCE")
	private Date dateSeance;
	
	@Column(name = "RESUMER")
	private String resumer;
	
	@Column(name = "PARTICIPANT")
	private String participant;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="ID_POV")
	private Pov idPov;
	
}
