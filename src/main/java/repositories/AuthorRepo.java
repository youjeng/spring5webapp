package repositories;

import org.springframework.data.repository.CrudRepository;

import domain.Author;

public interface AuthorRepo extends CrudRepository<Author, Long>{

}
