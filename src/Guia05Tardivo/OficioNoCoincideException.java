package Guia05Tardivo;

public class OficioNoCoincideException extends Exception {

	private String mensaje;
	
	public OficioNoCoincideException(String mensaje) {
		this.mensaje = mensaje;
	}
	
}
