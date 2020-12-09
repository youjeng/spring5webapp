package repositories;

import org.springframework.data.repository.CrudRepository;

import domain.Author;

public interface authorRepo extends CrudRepository<Author, Long>{

}
