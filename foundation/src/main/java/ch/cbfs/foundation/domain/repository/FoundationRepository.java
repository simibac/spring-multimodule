package ch.cbfs.foundation.domain.repository;

import ch.cbfs.foundation.domain.model.Foundation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoundationRepository extends CrudRepository<Foundation, Long> {
}
