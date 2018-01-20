package py.edu.uca.lp3.domain;

import javax.persistence.Entity;

@Entity
public class MensajeTexto extends Mensaje{
	
	private String contenidoTexto;
	
	public String getContenido() {
		return contenidoTexto;
	}
	public void setContenido(String contenido) {
		this.contenidoTexto = contenido;
	}
}