package Guia05Tardivo;

public class Trabajador {
	
	private Oficio oficio;
	private Trabajo[] trabajos;
	private String nombre;
	private String correo;
	private double costoxHs;
	private double comision;
	private int id;

public Trabajador(Oficio oficio, String nombre, String correo, double costoxHs, double comision, int id) {
	this.oficio = oficio;
	this.nombre = nombre;
	this.correo = correo;
	this.costoxHs = costoxHs;
	this.comision = comision;
	this.id = id;
	this.trabajos = new Trabajo[5000];
}

public void nuevoTrabajo(Trabajo t1) throws Exception {
	
	boolean bandera = false;
	if(this.getOficio() == t1.getOficio()) {
		for(int i=0; i<5000; i++) {
			if(this.trabajos[i].getFechaInicio() == t1.getFechaInicio()) {
				throw new AgendaOcupadaException("Agenda ocupada");
			}
			else bandera = true;
		}
		if(bandera) {
				for(int j=0; j<5000; j++) {
					if(this.trabajos[j] == null) {
						this.trabajos[j] = t1;
					}
				}
		}
			
	}
	else throw new OficioNoCoincideException("El oficio no coincide");
}


public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public Oficio getOficio() {
	return oficio;
}
public void setOficio(Oficio oficio) {
	this.oficio = oficio;
}
public Trabajo[] getTrabajos() {
	return trabajos;
}
public void setTrabajos(Trabajo[] trabajos) {
	this.trabajos = trabajos;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getCorreo() {
	return correo;
}
public void setCorreo(String correo) {
	this.correo = correo;
}
public double getCostoxHs() {
	return costoxHs;
}
public void setCostoxHs(double costoxHs) {
	this.costoxHs = costoxHs;
}
public double getComision() {
	return comision;
}
public void setComision(double comision) {
	this.comision = comision;
}


}
