package py.edu.uca.lp3.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import py.edu.uca.lp3.domain.Profesor;

@RepositoryRestResource(collectionResourceRel = "profesor", path = "profesor")
public interface ProfesorRepository extends PagingAndSortingRepository<Profesor, Long> {

	Profesor findByci(@Param("ci") int ci);
	
	Profesor findBytitulo(String titulo);

}
