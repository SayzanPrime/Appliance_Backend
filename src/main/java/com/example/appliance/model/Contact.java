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
@Table(name="CONTACT_TB")
public class Contact {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private Long id;
	
	@Column(name = "NOM")
	private String nom;
	
	@Column(name = "PRENOM")
	private String prenom;
	
	@Column(name = "TELEPHONE")
	private String telephone;
	
	@Column(name = "FONCTION")
	private String fonction;
	
	@Column(name = "EMAIL")
	private String email;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="ID_CLIENT")
	private Client idClient;
}
