package py.edu.uca.lp3.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import py.edu.uca.lp3.domain.MEC;

@RepositoryRestResource(collectionResourceRel = "MEC", path = "MEC")
public interface MECRepository extends PagingAndSortingRepository<MEC, Long> {

	MEC findBytitulo(String titulo);
	
}
