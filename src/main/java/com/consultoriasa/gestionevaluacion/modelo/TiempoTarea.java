package com.consultoriasa.gestionevaluacion.modelo;

import java.time.*;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Embeddable
@Getter
@Setter
public class TiempoTarea {

	@Required
	private LocalDate FechaInicio;
	private int horasTrabajadas;
}
