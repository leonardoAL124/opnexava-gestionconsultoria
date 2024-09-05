package com.consultoriasa.gestionevaluacion.modelo;

import java.time.*;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity
@Getter
@Setter
public class Tarea {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Hidden
	private int idTarea;
	
	@Column(length = 45)
	private String titulo;
	
	@TextArea
	private String descripcion;
	
	@Required
	private LocalDate fechaVencimiento;
	
	@Embedded
	TiempoTarea tiempoTarea;
	
	private int prioridad;
	
	@Column(length = 10)
	private String estado;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@ReferenceView("vistaProyecto")
	private Proyecto proyecto;
	
}
