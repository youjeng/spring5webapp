package repositories;

import org.springframework.data.repository.CrudRepository;

import domain.Book;

public interface bookRepo extends CrudRepository<Book, Long> {

}
