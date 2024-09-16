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
public class BroadcastLike {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Broadcast broadcast;

    @ManyToOne
    private UserModel user;

    private LocalDateTime likedAt;

}
