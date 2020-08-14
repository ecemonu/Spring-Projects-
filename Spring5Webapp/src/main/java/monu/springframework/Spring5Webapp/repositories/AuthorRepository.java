package monu.springframework.Spring5Webapp.repositories;

import org.springframework.data.repository.CrudRepository;

import monu.springframework.Spring5Webapp.domain.Author;

public interface AuthorRepository extends CrudRepository<Author, Long>{

}
