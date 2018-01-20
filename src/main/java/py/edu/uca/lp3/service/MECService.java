package py.edu.uca.lp3.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import py.edu.uca.lp3.domain.MEC;
import py.edu.uca.lp3.repository.MECRepository;

@Service
public class MECService {

	@Autowired
	private MECRepository mecRepository;
	
	public MEC findById(Long id) {
		MEC mec = mecRepository.findOne(id);
		return mec;
	}

	public List<MEC> findAll() {
		List<MEC> mecs = new ArrayList<>();
		Iterator<MEC> iteratormecs = mecRepository.findAll().iterator();
		while(iteratormecs.hasNext()) {
			mecs.add(iteratormecs.next());
		}
		return mecs;
	}

	public void save(MEC mec) {
		mecRepository.save(mec);
	}

	public void delete(Long id) {
		mecRepository.delete(id);
	}
	
	public String consultaTitulo(long idPerson) {
		MEC mec = mecRepository.findOne(idPerson);
		mec.getTitulo();
		return mec.getTitulo();
	}

}
