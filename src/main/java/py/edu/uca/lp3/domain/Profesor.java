package py.edu.uca.lp3.domain;

import javax.persistence.Entity;

@Entity
public class Profesor extends Person {
	private String titulo;

	public String getTitulo(){
		return titulo;
	}
	
	public void setTitulo(String titulo){
		this.titulo=titulo;
	}
	
}
