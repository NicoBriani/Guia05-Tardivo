package Guia05Tardivo;

import java.time.Duration;
import java.time.Instant;
import java.util.Calendar;

public class Alquiler {

	private Herramienta herramienta;
	private Instant diaInicio;
	private Instant diaFin;
	private Instant diaReal;
	private double costoTotal;
	private Duration dias;
	
public Alquiler(Herramienta her, Instant diaInicio, Instant diaFin) {
	this.herramienta = her;
	this.diaInicio = diaInicio;
	this.diaFin = diaFin;
}

public double CalcularCostoAlquiler() {
	Calendar hoy = Calendar.getInstance();

	if(diaReal == null) {
		this.costoTotal = this.herramienta.getCostoxDia() * (Duration.between(diaInicio, diaFin).toDays());
	}
	else this.costoTotal = this.herramienta.getCostoxDia() * (Duration.between(diaInicio, hoy.toInstant()).toDays());
	
	return this.costoTotal;
}



public String enMora() {
	
	if(((int)(this.dias.between(this.diaFin, Instant.now())).toDays()) > 0){
		return "VERDADERO";
	}
	if(diaReal == null) {
		return "VERDADERO";
	}
	else return "FALSO";
}



public String Finalizado() {
	String mensaje;
	if(diaReal != null) {
		mensaje = "VERDADERO";
	}
	else mensaje = "FALSE";
	return mensaje;
}

public Herramienta getHerramienta() {
	return herramienta;
}

public void setHerramienta(Herramienta herramienta) {
	this.herramienta = herramienta;
}

public Instant getDiaInicio() {
	return diaInicio;
}

public void setDiaInicio(Instant diaInicio) {
	this.diaInicio = diaInicio;
}

public Instant getDiaFin() {
	return diaFin;
}

public void setDiaFin(Instant diaFin) {
	this.diaFin = diaFin;
}

public Instant getDiaReal() {
	return diaReal;
}

public void setDiaReal(Instant diaReal) {
	this.diaReal = diaReal;
}

public double getCostoTotal() {
	return costoTotal;
}

public void setCostoTotal(double costoTotal) {
	this.costoTotal = costoTotal;
}



}
