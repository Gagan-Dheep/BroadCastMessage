package com.empowerDemo.demoProjectEmp.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@Data
@Entity
public class Broadcast {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private UserModel admin;

    @ManyToOne
    private Team team;

    private String broadcastType;  // Should be 'text' or 'image'
    private String message;
    private byte[] imageData;
    private LocalDateTime postDate;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
