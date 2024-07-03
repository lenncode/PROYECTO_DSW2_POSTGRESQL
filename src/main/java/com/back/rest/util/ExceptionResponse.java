package com.back.rest.util;

public class ExceptionResponse {

	private String mensaje;
	private String detalles;
	
	public ExceptionResponse() {
	}

	public ExceptionResponse(String mensaje, String detalles) {	
		this.mensaje = mensaje;
		this.detalles = detalles;
	}



	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public String getDetalles() {
		return detalles;
	}

	public void setDetalles(String detalles) {
		this.detalles = detalles;
	}

}
