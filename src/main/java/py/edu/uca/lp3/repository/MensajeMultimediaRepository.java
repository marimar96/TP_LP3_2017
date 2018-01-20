package py.edu.uca.lp3.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import py.edu.uca.lp3.domain.MensajeMultimedia;

@RepositoryRestResource(collectionResourceRel = "mensajemultimedia", path = "mensajemultimedia")
public interface MensajeMultimediaRepository extends PagingAndSortingRepository<MensajeMultimedia, Long> {

	List<MensajeMultimedia> findByid(@Param("id") long id);

}
