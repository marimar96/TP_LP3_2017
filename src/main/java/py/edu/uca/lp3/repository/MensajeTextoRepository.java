package py.edu.uca.lp3.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import py.edu.uca.lp3.domain.MensajeTexto;

@RepositoryRestResource(collectionResourceRel = "mensajetexto", path = "mensajetexto")
public interface MensajeTextoRepository extends PagingAndSortingRepository<MensajeTexto, Long> {

	List<MensajeTexto> findByid(@Param("id") long id);

}
