package com.workshop.entities;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name="user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
    @Column(name="print")
    private String name;
    private String email;
    private Integer ebbinghausDay;
    private Integer lastWordId;
    private Boolean showWord;

}
