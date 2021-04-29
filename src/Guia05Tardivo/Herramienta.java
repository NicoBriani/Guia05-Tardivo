package Guia05Tardivo;

public class Herramienta {

	private String nombre;
	private Double costoxDia;
	
public Herramienta(String nombre, Double costoxDia) {
	this.nombre = nombre;
	this.costoxDia = costoxDia;
}


public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public Double getCostoxDia() {
	return costoxDia;
}
public void setCostoxDia(Double costoxDia) {
	this.costoxDia = costoxDia;
}

}
