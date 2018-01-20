package py.edu.uca.lp3.domain;

import javax.persistence.Entity;

@Entity
public class MEC extends Institute {
	private String titulo;
//	private long idPerson;
	
	/*public long getIdPerson() {
		return idPerson;
	}
	public void setIdPerson(long idPerson) {
		this.idPerson = idPerson;
	}*/
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

}
