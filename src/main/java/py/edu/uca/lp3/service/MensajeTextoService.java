package py.edu.uca.lp3.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import py.edu.uca.lp3.domain.MensajeTexto;
import py.edu.uca.lp3.repository.MensajeTextoRepository;

@Service
public class MensajeTextoService {

	@Autowired
	private MensajeTextoRepository mensajetextoRepository;
	
	public MensajeTexto findById(Long id) {
		MensajeTexto mensajetexto = mensajetextoRepository.findOne(id);
		return mensajetexto;
	}

	public List<MensajeTexto> findAll() {
		List<MensajeTexto> mensajetextos = new ArrayList<>();
		Iterator<MensajeTexto> iteratorMensajetextos = mensajetextoRepository.findAll().iterator();
		while(iteratorMensajetextos.hasNext()) {
			mensajetextos.add(iteratorMensajetextos.next());
		}
		return mensajetextos;
	}

	public void save(MensajeTexto mensajetexto) {
		mensajetextoRepository.save(mensajetexto);
	}

	public void delete(Long id) {
		mensajetextoRepository.delete(id);
	}
}
