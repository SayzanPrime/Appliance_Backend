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
@Table(name="SUIVI_TB")
public class Suivi {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private Long id;
	
	@Column(name = "OFFRE_COMMERCIAL")
	private Boolean offreCommercial;
	
	@Column(name = "MONTANT")
	private Double montant;
	
	@Column(name = "COMPTE_RENDU")
	private String compteRendu;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="ID_TYPE_PRESTATION")
	private TypePrestation idTypePrestation;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="ID_POV")
	private Pov idPov;

}
