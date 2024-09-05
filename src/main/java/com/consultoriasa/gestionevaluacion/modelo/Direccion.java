package com.consultoriasa.gestionevaluacion.modelo;

import javax.persistence.*;

import lombok.*;

@Embeddable
@Getter
@Setter
public class Direccion {

	private String calle;
	private String ciudad;
	
	@Column(length = 5)
	private String codigoPostal;
	
}
