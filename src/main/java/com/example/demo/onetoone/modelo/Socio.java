package com.example.demo.onetoone.modelo;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name ="Socio")
public class Socio {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seq_soc")
	@SequenceGenerator(name="seq_soc",sequenceName = "seq_soc",allocationSize = 1)
	@Column(name="soc_id")
	private Integer id;
	
	@Column(name="soc_cedula")
	private String cedula;
	
	@Column(name="soc_nombre")
	private String nombre;
	
	@Column(name="soc_apellido")
	private String apellido;
	
	@Column(name="soc_direccion")
	private String direccion;
	
	@Column(name="soc_telefono")
	private String telefono;

	//indico que la tarjeta se mapea con socio
	@OneToOne(mappedBy = "socio",cascade = CascadeType.ALL)
	private Tarjeta tarjeta;
	
	
	//SET y GET
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Tarjeta getTarjeta() {
		return tarjeta;
	}

	public void setTarjeta(Tarjeta tarjeta) {
		this.tarjeta = tarjeta;
	}

	@Override
	public String toString() {
		return "Socio [id=" + id + ", cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", direccion=" + direccion + ", telefono=" + telefono + ", tarjeta=" + tarjeta + "]";
	}
	
	
	



}
