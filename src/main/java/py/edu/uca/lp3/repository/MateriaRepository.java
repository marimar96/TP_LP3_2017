package py.edu.uca.lp3.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
//import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import py.edu.uca.lp3.domain.Materia;

@RepositoryRestResource(collectionResourceRel = "materia", path = "materia")
public interface MateriaRepository extends PagingAndSortingRepository<Materia, Long> {

	List<Materia> findByCodigo(String codigo);

}
