package com.empowerDemo.demoProjectEmp.repository;

import com.empowerDemo.demoProjectEmp.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface UserModelRepo extends JpaRepository<UserModel, Long> {
}
