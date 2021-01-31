package com.example.victorSpringWebApp.repositories;

import com.example.victorSpringWebApp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
