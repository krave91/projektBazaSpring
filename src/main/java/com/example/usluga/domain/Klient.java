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
@Table(name = "klient2")
public class Klient {

	@Id
	@Column(name = "id", unique = true, nullable = false)
	private Long id;

	@Column(name = "imie", length = 45)
	private String imie;

	@Column(name = "nazwisko", length = 45)
	private String nazwisko;
}
