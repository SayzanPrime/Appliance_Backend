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
@Table(name="POV_TB")
public class Pov {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private Long id;
	
	@Column(name = "DATE_DEBUT")
	private Date dateDebut;

	@Column(name = "DATE_FIN")
	private Date dateFin;

	@Column(name = "DESCRIPTION")
	private String description;

	@Column(name = "COMPTE_MANAGER")
	private String compteManager;

	@Column(name = "INGENIEUR_CYBERSECURITE")
	private String ingenieurCybersecurite;

	@Column(name = "ANALYSE_CYBERSECURITE")
	private String analyseCybersecurite;

	@Column(name = "LIBELLE_POV")
	private String libellePov;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="ID_CLIENT")
	private Client idClient;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="ID_APPLIANCE")
	private Appliance idAppliance;
}
