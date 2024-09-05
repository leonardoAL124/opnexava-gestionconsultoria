package com.consultoriasa.gestionevaluacion.modelo;

import javax.persistence.*;
import javax.validation.constraints.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity
@Getter
@Setter
@View(name = "vistaCliente",
	  members = "idCliente, nombre, email")
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Hidden
	private int idCliente;
	
	@Column(length = 20)
	private String nombre;
	
	@Column(length = 20)
	private String apellido;
	
	@Column(length = 45)
	@Email
	private String email;
	
	@Embedded
	Direccion direccion;
}
