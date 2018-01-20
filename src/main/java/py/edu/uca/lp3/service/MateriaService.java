package py.edu.uca.lp3.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import py.edu.uca.lp3.domain.Materia;
import py.edu.uca.lp3.repository.MateriaRepository;

@Service
public class MateriaService {

	@Autowired
	private MateriaRepository materiaRepository;
	
	public Materia findById(Long id) {
		Materia materia = materiaRepository.findOne(id);
		return materia;
	}

	public List<Materia> findAll() {
		List<Materia> materias = new ArrayList<>();
		Iterator<Materia> iteratorMaterias = materiaRepository.findAll().iterator();
		while(iteratorMaterias.hasNext()) {
			materias.add(iteratorMaterias.next());
		}
		return materias;
	}

	public void save(Materia materia) {
		materiaRepository.save(materia);
	}

	public void delete(Long id) {
		if (materiaRepository.findOne(id) != null)
			materiaRepository.delete(id);
	}
}
