package com.workshop.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="gre3000")
public class Word {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private Integer id;
    @Column(name="print")
    private String print;
    @Column(name="description")
    private String description;
}
