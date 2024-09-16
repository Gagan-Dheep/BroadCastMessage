package com.empowerDemo.demoProjectEmp.models;

import lombok.Data;


import javax.persistence.*;

@Data
@Entity
public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private String jobTitle;
    private String country;

//    @ManyToOne
//    @JoinColumn(name = "role_id")
//    private Role role;

    @ManyToOne
    private Team team;

}
