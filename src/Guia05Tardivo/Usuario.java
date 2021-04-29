package Guia05Tardivo;

public class Usuario {

	private String username;
	private String password;
	private Servicio[] serviciosContratados;
	private Alquiler[] alquileresContratados;
	private double saldoTarjeta;
	
	
public Usuario(String user, String pass, double saldo) {
	this.username = user;
	this.password = pass;
	this.saldoTarjeta = saldo;
	this.serviciosContratados = new Servicio[5000];
	this.alquileresContratados = new Alquiler[5000];
}

public void Contratar(Object x) throws Exception {
	if(x instanceof Servicio) {
		for(int i=0; i<5000; i++) {
			if(this.serviciosContratados[i] == null) {
				this.serviciosContratados[i] = (Servicio) x;
				saldoTarjeta = saldoTarjeta - ((Servicio) x).getCostoTotal();
			}
		}
	}
	else {
		int contador = 0;
		for(int i=0; i<5000; i++) {
			if(this.alquileresContratados[i].getDiaReal() == null) {
				contador++;
				if(contador >= 2) {
					throw new AlquilerNoEntregadoException("Posee más de dos alquileres sin devolver"); 
				}
			}
		}
		if(contador < 2) {
			for(int i=0; i<5000; i++) {
				if(this.alquileresContratados[i] == null) {
					this.alquileresContratados[i] = (Alquiler) x;
					saldoTarjeta = saldoTarjeta - ((Alquiler) x).getCostoTotal();
				}
			}
		}
	}
}

}
