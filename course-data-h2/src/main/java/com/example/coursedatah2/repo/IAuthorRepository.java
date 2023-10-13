package com.example.coursedatah2.repo;

import org.springframework.data.repository.CrudRepository;
import com.example.coursedatah2.model.Author;

public interface IAuthorRepository extends CrudRepository<Author, Long>{
    
}
