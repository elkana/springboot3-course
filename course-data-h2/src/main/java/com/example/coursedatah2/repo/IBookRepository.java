package com.example.coursedatah2.repo;

import org.springframework.data.repository.CrudRepository;
import com.example.coursedatah2.model.Book;

public interface IBookRepository extends CrudRepository<Book, Long>{
    
}
