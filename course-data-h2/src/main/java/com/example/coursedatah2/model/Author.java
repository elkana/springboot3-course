package com.example.coursedatah2.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Author {
    @Id
    Long id;

    @Column
    String name;
}
