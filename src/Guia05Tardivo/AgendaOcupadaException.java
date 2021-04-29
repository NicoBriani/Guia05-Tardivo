package Guia05Tardivo;

public class AgendaOcupadaException extends Exception {
	
	private String mensaje;

public AgendaOcupadaException(String mensaje) {
	this.mensaje = mensaje;
}


}
