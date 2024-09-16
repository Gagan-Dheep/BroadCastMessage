package com.empowerDemo.demoProjectEmp.config;

import com.empowerDemo.demoProjectEmp.models.Role;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

import java.io.IOException;

public class RoleDeserializer extends JsonDeserializer<Role> {

    @Override
    public Role deserialize(JsonParser p, DeserializationContext txt) throws IOException, JsonProcessingException {
        String roleId = p.getText();
        // Implement your logic to convert roleId into a Role instance
        // This example assumes Role can be instantiated with an ID
        if (roleId == null || roleId.isEmpty()) {
            throw new JsonProcessingException("Role ID is null or empty") {};
        }

        // Implement your logic to convert roleId into a Role instance
        switch (roleId.charAt(0)) {
            case '2':
                return new Role(2L, "admin");
            case '1':
                return new Role(1L, "user");
            default:
                throw new JsonProcessingException("Invalid Role ID: " + roleId) {};
        }
    }
}

