package py.edu.uca.lp3.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import py.edu.uca.lp3.domain.Alumno;

@RepositoryRestResource(collectionResourceRel = "alumno", path = "alumno")
public interface AlumnoRepository extends PagingAndSortingRepository<Alumno, Long> {
	
	Alumno findByci(@Param("ci") int ci);
	
	Alumno findBytitulo(String titulo);

	Alumno findByLastName(@Param("name") String name);
}	
