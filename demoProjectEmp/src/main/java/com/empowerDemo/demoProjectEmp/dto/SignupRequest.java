package com.empowerDemo.demoProjectEmp.dto;

import com.empowerDemo.demoProjectEmp.config.RoleDeserializer;
import com.empowerDemo.demoProjectEmp.models.Role;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Data;

@Data
public class SignupRequest {
    private String username;
    private String password;

    @JsonDeserialize(using = RoleDeserializer.class)
    private Role role;
}

