package py.edu.uca.lp3.domain;

import javax.persistence.Entity;

@Entity
public class MensajeMultimedia extends Mensaje{
	
	private String contenidoAudio;
	private String contenidoImagen;
	private String contenidoVideo;
	
	public String getContenidoAudio() {
		return contenidoAudio;
	}
	public void setContenidoAudio(String contenidoAudio) {
		this.contenidoAudio = contenidoAudio;
	}
	public String getContenidoImagen() {
		return contenidoImagen;
	}
	public void setContenidoImagen(String contenidoImagen) {
		this.contenidoImagen = contenidoImagen;
	}
	public String getContenidoVideo() {
		return contenidoVideo;
	}
	public void setContenidoVideo(String contenidoVideo) {
		this.contenidoVideo = contenidoVideo;
	}
	
}