package Guia05Tardivo;

public class AlquilerNoEntregadoException extends Exception {

	private String mensaje;
	
	public AlquilerNoEntregadoException(String mensaje) {
		this.mensaje = mensaje;
	}
}
