package py.edu.uca.lp3.domain;

import javax.persistence.Entity;


@Entity
public class Alumno extends Person{
	
	private int nro_matricula;
	private String titulo;

	public int getnro_matricula() {
		return nro_matricula;
	}
	
	public void setnro_matricula(int nro_matricula) {
		this.nro_matricula = nro_matricula;
	}
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
}
