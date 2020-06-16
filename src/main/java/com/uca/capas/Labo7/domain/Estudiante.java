package com.uca.capas.Labo7.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(schema="public", name="estudiante")
public class Estudiante {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_estudiante")
	private Integer codigoEstudiante;

	@Size(message = "El campo no debe cotener mas de 30 caracteres", max = 30)
	@NotEmpty(message = "Este campo no puede estar vacio")
	@Column(name="nombre")
	private String nombre;

	@Size(message = "El campo no debe cotener mas de 30 caracteres", max = 30)
	@NotEmpty(message = "Este campo no puede estar vacio")
	@Column(name="apellido")
	private String apellido;

	@javax.validation.constraints.NotNull(message = "El campo no puede estar vacio")
	@Min(value = 18, message = "No puede ser menor a 18 años")
	@Column(name="edad")
	private Integer edad;

	@Column(name="estado")
	private Boolean estado;
	
	public Estudiante() {}
	
	public Integer getCodigoEstudiante() {
		return codigoEstudiante;
	}
	public void setCodigoEstudiante(Integer codigoEstudiante) {
		this.codigoEstudiante = codigoEstudiante;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		apellido = apellido;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		edad = edad;
	}
	public Boolean getEstado() {
		return estado;
	}
	public void setEstado(Boolean estado) {
		estado = estado;
	}
	
	public String getEstadoDelegate() {
		if(this.estado == null) {
			return "";
		}else {
			return estado == true ?"Activo":"Inactivo";
		}
	}
	
}
