package com.everis.latam.ACLCorreoProveedoresFlama.Entity;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
public class Request {
	String estatus;
	int montoTotal;
	int idResolucion;
	@JsonFormat(pattern="yyyy-MM-dd")
	Timestamp fechaResolucion;
	int idSolicitud;
	

}
