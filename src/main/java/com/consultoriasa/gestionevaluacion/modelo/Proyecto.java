package com.consultoriasa.gestionevaluacion.modelo;

import java.time.*;

import javax.persistence.*;

import org.openxava.annotations.*;
import org.openxava.calculators.*;

import lombok.*;

@Entity
@Getter
@Setter
@View(name = "vistaProyecto",
	  members = "codigo, nombre, fechaInicio, fechaFin")
public class Proyecto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Hidden
	private int codigo;
	
	@Column(length = 20)
	private String nombre;
	
	@TextArea
	private String descripcion;
	
	@Required
	@DefaultValueCalculator(CurrentLocalDateCalculator.class)
	private LocalDate fechaInicio;
	
	@Required
	private LocalDate fechaFin;
	
	@Column(length = 10)
	private String estado;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@ReferenceView("vistaCliente")
	private Cliente cliente;
	
}
