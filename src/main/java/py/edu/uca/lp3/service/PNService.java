package py.edu.uca.lp3.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import py.edu.uca.lp3.domain.PN;
import py.edu.uca.lp3.repository.PNRepository;

@Service
public class PNService {

	@Autowired
	private PNRepository pnRepository;
	
	public PN findById(long id) {
		PN persona = pnRepository.findOne(id);
		if (persona == null) {
			System. out. println("\nNo hay datos del alumno.");
			return null;
		}
		return persona;
	}
	
		public List<PN> findAll() {
		List<PN> pns = new ArrayList<>();
		Iterator<PN> iteratorPns = pnRepository.findAll().iterator();
		while(iteratorPns.hasNext()) {
			pns.add(iteratorPns.next());
		}
		return pns;
	}

	public PN findByci(int ci) {
		PN persona = pnRepository.findByci(ci);
		if (persona==null) {
			System. out. println("\nNo hay datos de la persona en la policia nacional.");
	    	return null;
		}
		return persona;
	}
	
	public void save(PN pn) {
		pnRepository.save(pn);
	}

	public void delete(Long id) {
		if (pnRepository.findOne(id) != null)
			pnRepository.delete(id);
	}
}
