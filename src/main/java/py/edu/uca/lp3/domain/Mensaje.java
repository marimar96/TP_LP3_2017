package py.edu.uca.lp3.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Mensaje {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private long id;
	private String fechaenvio;
	private String origen;
	private String destino;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	public String getFechaenvio() {
		return fechaenvio;
	}
	public void setFechaenvio(String fechaenvio) {
		this.fechaenvio = fechaenvio;
	}
	public String getOrigen() {
		return origen;
	}
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}

}
