package py.edu.uca.lp3.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import py.edu.uca.lp3.domain.Alumno;
import py.edu.uca.lp3.domain.PN;
import py.edu.uca.lp3.domain.MEC;
import py.edu.uca.lp3.repository.MECRepository;
import py.edu.uca.lp3.repository.AlumnoRepository;
import py.edu.uca.lp3.repository.PNRepository;

@Service
public class AlumnoService {

	@Autowired
	private AlumnoRepository alumnoRepository;
	
	@Autowired
	private PNRepository pnrepository;
	
	@Autowired
	private MECRepository mecrepository;
	
	
	public Alumno findById(Long id) {
		Alumno alumno = alumnoRepository.findOne(id);
		if (alumno == null) {
			System. out. println("\nNo hay datos del alumno.");
			return null;
		}
		return alumno;
	}
	
	public Alumno findByci(int ci) {
	    Alumno alumno = alumnoRepository.findByci(ci);
	    
	    PN pn;
	    pn=pnrepository.findByci(ci);
	    if (pn==null) {
			System. out. println("\nNo hay datos del alumno en la policia nacional.");
	    	return null;
		}
	    alumno.setFirstName(pn.getNombre());
		alumno.setLastName(pn.getApellido());
		return alumno;
	}
	
	public Alumno findBytitulo(String titulo) {
	    Alumno alumno = alumnoRepository.findBytitulo(titulo);
	  
	    MEC mec = mecrepository.findBytitulo(titulo);
	    if (mec==null) {
			System. out. println("\nNo hay datos del titutlo del alumno en el MEC.");
	    	return null;
		}

	    alumno.setFirstName(mec.getTitulo());
		return alumno;
	}
	
	public List<Alumno> findAll() {
		List<Alumno> alumnos = new ArrayList<>();
		Iterator<Alumno> iteratorAlumnos = alumnoRepository.findAll().iterator();
		while(iteratorAlumnos.hasNext()) {
			alumnos.add(iteratorAlumnos.next());
		}
		return alumnos;
	}

	public void save(Alumno alumno) {
		Alumno alumno2 = alumnoRepository.findByci(alumno.getCi());
		if (alumno2!=null) {
			String firstName = alumno2.getFirstName();
			String lastName = alumno2.getLastName();
			if ( alumno.getFirstName().compareTo(firstName) != 0 
					&& alumno.getLastName().compareTo(lastName) != 0 ) {
				alumnoRepository.save(alumno);
			}
		}else {
			alumnoRepository.save(alumno);
		}  
	}

	public void delete(Long id) {
		if (alumnoRepository.findOne(id) != null)
			alumnoRepository.delete(id);
	}

}
