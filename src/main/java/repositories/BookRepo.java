package repositories;

import org.springframework.data.repository.CrudRepository;

import domain.Book;

public interface BookRepo extends CrudRepository<Book, Long> {

}
