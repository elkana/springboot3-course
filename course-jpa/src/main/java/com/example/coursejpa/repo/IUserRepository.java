package com.example.coursejpa.repo;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import com.example.coursejpa.dto.UserDto;
import com.example.coursejpa.model.User;
@RepositoryRestResource(collectionResourceRel = "users", path = "v1-users", excerptProjection = UserDto.class)
public interface IUserRepository extends JpaRepository<User, String> {
    @RestResource(path = "all",rel = "all")
    List<User> findAll();
}
