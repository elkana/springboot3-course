package com.example.coursejpa.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.example.coursejpa.model.Office;

@RepositoryRestResource(collectionResourceRel = "offices", path = "v1-offices")
public interface IOfficeRepository extends JpaRepository<Office, String> {
    
}
