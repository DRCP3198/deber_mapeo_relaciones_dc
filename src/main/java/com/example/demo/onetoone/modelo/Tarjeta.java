package com.example.demo.onetoone.modelo;

import java.time.LocalDateTime;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name= "tarjeta")
public class Tarjeta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seq_tar")
	@SequenceGenerator(name = "seq_tar",sequenceName = "seq_tar",allocationSize = 1)
	@Column(name="tar_id")
	private Integer id;
	
	@Column(name="tar_numero")
	private String numero;
	
	@Column(name="tar_emision")
	private LocalDateTime emision;
	
	@Column(name="tar_caducidad")
	private LocalDateTime caducidad;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name= "tarj_id_socio")
	private Socio socio;

	
	
	//SET y GET
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public LocalDateTime getEmision() {
		return emision;
	}

	public void setEmision(LocalDateTime emision) {
		this.emision = emision;
	}

	public LocalDateTime getCaducidad() {
		return caducidad;
	}

	public void setCaducidad(LocalDateTime caducidad) {
		this.caducidad = caducidad;
	}

	public Socio getSocio() {
		return socio;
	}

	public void setSocio(Socio socio) {
		this.socio = socio;
	}

	@Override
	public String toString() {
		return "Tarjeta [id=" + id + ", numero=" + numero + ", emision=" + emision + ", caducidad=" + caducidad
				+ ", socio=" + socio + "]";
	}
	
	
	
	
	
	
	

}
