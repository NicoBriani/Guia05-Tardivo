package Guia05Tardivo;

public class Servicio {
	
	private Oficio oficio;
	private TipoServicio tipo;
	private double montoFijo;
	private Trabajador trabajador;
	private double valorPresupuestado;
	private double costoMateriales;
	private double costoTransporte;
	private boolean urgente;
	private double costoTotal;

	
public Servicio (Oficio of, TipoServicio type, double monto, Trabajador traba, boolean urgente) {
	this.oficio = of;
	this.tipo = type;
	this.montoFijo = monto;
	this.trabajador = traba;
	this.valorPresupuestado = 0;
	this.costoMateriales = 0;
	this.costoTransporte = 0;
	this.urgente = urgente;
}

public Servicio (Oficio of, TipoServicio type, Trabajador traba, double valor, double costoM, double costoT, boolean urgente) {
	this.oficio = of;
	this.tipo = type;
	this.trabajador = traba;
	this.montoFijo = 0;
	this.valorPresupuestado = valor;
	this.costoMateriales = costoM;
	this.costoTransporte = costoT;
	this.urgente = urgente;
}

public double CalcularCostoDelServicio() {
	if(tipo == TipoServicio.estandar) {
		if(urgente) {
			double adicional = ((montoFijo + trabajador.getComision()) * 50) / 100;
		this.costoTotal = (montoFijo + trabajador.getComision()) + adicional;
		}
		else this.costoTotal = (montoFijo + trabajador.getComision());
	}
	if(tipo == TipoServicio.personalizado) {
		if(urgente) {
			double adicional = ((valorPresupuestado + costoMateriales + costoTransporte) * 50) / 100;
		this.costoTotal = ((valorPresupuestado + costoMateriales + costoTransporte) + adicional);
		}
		else this.costoTotal = (valorPresupuestado + costoMateriales + costoTransporte);
	}
	return this.costoTotal;
}


public Oficio getOficio() {
	return oficio;
}
public void setOficio(Oficio oficio) {
	this.oficio = oficio;
}
public TipoServicio getTipo() {
	return tipo;
}
public void setTipo(TipoServicio tipo) {
	this.tipo = tipo;
}
public double getMontoFijo() {
	return montoFijo;
}
public void setMontoFijo(double montoFijo) {
	this.montoFijo = montoFijo;
}
public Trabajador getTrabajador() {
	return trabajador;
}
public void setTrabajador(Trabajador trabajador) {
	this.trabajador = trabajador;
}
public double getValorPresupuestado() {
	return valorPresupuestado;
}
public void setValorPresupuestado(double valorPresupuestado) {
	this.valorPresupuestado = valorPresupuestado;
}
public double getCostoMateriales() {
	return costoMateriales;
}
public void setCostoMateriales(double costoMateriales) {
	this.costoMateriales = costoMateriales;
}
public double getCostoTransporte() {
	return costoTransporte;
}
public void setCostoTransporte(double costoTransporte) {
	this.costoTransporte = costoTransporte;
}
public String isUrgente() {
	String mensaje;
	if(urgente == true) {
		mensaje = "Urgente";
	}
	else mensaje = "No Urgente";
	return mensaje;
}
public void setUrgente(boolean urgente) {
	this.urgente = urgente;
}
public double getCostoTotal() {
	return costoTotal;
}
public void setCostoTotal(double costoTotal) {
	this.costoTotal = costoTotal;
}

}
