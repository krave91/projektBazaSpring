package com.example.usluga.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "towar")
public class Towar {
	
	@Id
	@Column(name = "id", unique = true, nullable = false)
	private Long id;

	@Column(name = "nazwa", length = 45)
	private String nazwa;

	@Column(name = "cena", length = 45)
	private float cena;
}
