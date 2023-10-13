package com.example.coursejpa.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.example.coursejpa.model.Department;

@RepositoryRestResource(collectionResourceRel = "departments", path = "v1-departments")
public interface IDepartmentRepository extends JpaRepository<Department, String> {
    
}
