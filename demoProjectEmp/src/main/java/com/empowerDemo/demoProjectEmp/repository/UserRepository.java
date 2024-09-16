package com.empowerDemo.demoProjectEmp.repository;

import com.empowerDemo.demoProjectEmp.models.LoginCredentials;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Optional;

@RepositoryRestResource
public interface UserRepository extends JpaRepository<LoginCredentials, Long> {
    Optional<LoginCredentials> findByUsername(String username);
    boolean existsByUsername(String username);
}
