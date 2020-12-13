package repositories;

import org.springframework.data.repository.CrudRepository;
import domain.Publisher;

public interface PublisherRepo extends CrudRepository<Publisher, Long>{

}
