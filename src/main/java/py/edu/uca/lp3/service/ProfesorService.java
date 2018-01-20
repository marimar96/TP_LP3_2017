package py.edu.uca.lp3.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import py.edu.uca.lp3.domain.MEC;
import py.edu.uca.lp3.domain.PN;
import py.edu.uca.lp3.domain.Profesor;
import py.edu.uca.lp3.repository.MECRepository;
import py.edu.uca.lp3.repository.PNRepository;
import py.edu.uca.lp3.repository.ProfesorRepository;

@Service
public class ProfesorService {

	@Autowired
	private ProfesorRepository profesorRepository;
	
	@Autowired
	private PNRepository pnrepository;
	
	@Autowired
	private MECRepository mecrepository;
	
	public Profesor findById(Long id) {
		Profesor profesor = profesorRepository.findOne(id);
		return profesor;
	}
	
	public Profesor findByci(int ci) {
		Profesor profesor = profesorRepository.findByci(ci);
	    
	    PN pn;
	    pn=pnrepository.findByci(ci);
	    if (pn==null) {
			System. out. println("\nNo hay datos del profesor en la policia nacional.");
	    	return null;
		}
	    profesor.setFirstName(pn.getNombre());
	    profesor.setLastName(pn.getApellido());
		return profesor;
	}
	
	public Profesor findBytitulo(String titulo) {
		Profesor profesor = profesorRepository.findBytitulo(titulo);
	  
	    MEC mec = mecrepository.findBytitulo(titulo);
	    if (mec==null) {
			System. out. println("\nNo hay datos del titutlo del profesor en el MEC.");
	    	return null;
		}

	    profesor.setFirstName(mec.getTitulo());
		return profesor;
	}

	public List<Profesor> findAll() {
		List<Profesor> profesores = new ArrayList<>();
		Iterator<Profesor> iteratorProfesores = profesorRepository.findAll().iterator();
		while(iteratorProfesores.hasNext()) {
			profesores.add(iteratorProfesores.next());
		}
		return profesores;
	}

	public void save(Profesor profesor) {
		profesorRepository.save(profesor);
	}

	public void delete(Long id) {
		if (profesorRepository.findOne(id) != null)
			profesorRepository.delete(id);
	}

}
