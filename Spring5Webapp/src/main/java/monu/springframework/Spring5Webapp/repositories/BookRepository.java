package monu.springframework.Spring5Webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import monu.springframework.Spring5Webapp.domain.Book;

public interface BookRepository extends CrudRepository<Book, Long> {

}
