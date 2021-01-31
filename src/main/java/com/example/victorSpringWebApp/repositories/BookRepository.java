package com.example.victorSpringWebApp.repositories;

import com.example.victorSpringWebApp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
