package py.edu.uca.lp3.repository;

//import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import py.edu.uca.lp3.domain.PN;

@RepositoryRestResource(collectionResourceRel = "PN", path = "PN")
public interface PNRepository extends PagingAndSortingRepository<PN, Long> {

	PN findById(@Param("id") long id);
	
	PN findByci(@Param("ci") int ci);

}
