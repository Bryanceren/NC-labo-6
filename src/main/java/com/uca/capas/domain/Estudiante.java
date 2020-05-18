package com.uca.capas.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;


@Entity
@Table(schema="public", name="estudiante")
public class Estudiante {

	@Id
	@Column(name="c_usuario")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer cUsuario;
	
	@Column(name="nombre")
	@NotEmpty(message="El nombre no puede estar vacio")
	private String nombre;
	
	@Column(name="apellido")
	@NotEmpty(message="El apellido no puede estar vacio")
	private String apellido;
	
	@Column(name="carne")
	@NotEmpty(message="El carne no puede estar vacio")
	@Size(min=8, max=8, message="El carne es de 8 digitos")
	private String carne;
	
	@Column(name="carrera")
	@NotEmpty(message="La carrera no puede estar vacio")
	private String carrera;
	
	

	public Integer getcUsuario() {
		return cUsuario;
	}

	public void setcUsuario(Integer cUsuario) {
		this.cUsuario = cUsuario;
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

	public String getCarne() {
		return carne;
	}

	public void setCarne(String carne) {
		this.carne = carne;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	
	public Estudiante() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Estudiante(Integer cUsuario, @NotEmpty(message = "Este campo no puede estar vacio") String nombre,
			@NotEmpty(message = "Este campo no puede estar vacio") String apellido,
			@NotEmpty(message = "Este campo no puede estar vacio") @Size(min = 8, max = 8, message = "El carne es de 8 digitos") String carne,
			@NotEmpty(message = "Este campo no puede estar vacio") String carrera) {
		super();
		this.cUsuario = cUsuario;
		this.nombre = nombre;
		this.apellido = apellido;
		this.carne = carne;
		this.carrera = carrera;
	}
	
	

	
}
