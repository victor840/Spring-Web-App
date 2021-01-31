package com.example.victorSpringWebApp.repositories;

import com.example.victorSpringWebApp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
