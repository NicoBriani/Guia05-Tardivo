package Guia05Tardivo;

import java.time.Instant;

public class Trabajo {

	private Oficio oficio;
	private Trabajador trabajador;
	private Instant fechaInicio;
	private Instant fechaFin;
	private Servicio servicio;
	
public Trabajo(Oficio ofi, Trabajador traba, Instant fechaInicio, Instant fechaFin, Servicio servicio) {
	this.oficio = ofi;
	this.trabajador = traba;
	this.fechaInicio = fechaInicio;
	this.fechaFin = fechaFin;
	this.servicio = servicio;
}

public String Finalizado() {
	String mensaje;
	if(fechaFin != null) {
		mensaje = "VERDADERO";
	}
	else mensaje = "FALSE";
	return mensaje;
}


public Trabajador getTrabajador() {
	return trabajador;
}
public void setTrabajador(Trabajador trabajador) {
	this.trabajador = trabajador;
}
public Instant getFechaInicio() {
	return fechaInicio;
}
public void setFechaInicio(Instant fechaInicio) {
	this.fechaInicio = fechaInicio;
}
public Instant getFechaFin() {
	return fechaFin;
}
public void setFechaFin(Instant fechaFin) {
	this.fechaFin = fechaFin;
}
public Servicio getServicio() {
	return servicio;
}
public void setServicio(Servicio servicio) {
	this.servicio = servicio;
}

public Oficio getOficio() {
	return oficio;
}

public void setOficio(Oficio oficio) {
	this.oficio = oficio;
}


}
