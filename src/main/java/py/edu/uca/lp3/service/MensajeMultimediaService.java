package py.edu.uca.lp3.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import py.edu.uca.lp3.domain.MensajeMultimedia;
import py.edu.uca.lp3.repository.MensajeMultimediaRepository;

@Service
public class MensajeMultimediaService {

	@Autowired
	private MensajeMultimediaRepository mensajemultimediaRepository;
	
	public MensajeMultimedia findById(Long id) {
		MensajeMultimedia mensajemultimedia = mensajemultimediaRepository.findOne(id);
		return mensajemultimedia;
	}

	public List<MensajeMultimedia> findAll() {
		List<MensajeMultimedia> mensajemultimedias = new ArrayList<>();
		Iterator<MensajeMultimedia> iteratorMensajemultimedias = mensajemultimediaRepository.findAll().iterator();
		while(iteratorMensajemultimedias.hasNext()) {
			mensajemultimedias.add(iteratorMensajemultimedias.next());
		}
		return mensajemultimedias;
	}

	public void save(MensajeMultimedia mensajemultimedia) {
		mensajemultimediaRepository.save(mensajemultimedia);
	}

	public void delete(Long id) {
		mensajemultimediaRepository.delete(id);
	}

}
