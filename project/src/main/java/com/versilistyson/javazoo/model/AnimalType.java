package com.versilistyson.javazoo.model;

import javax.persistence.*;

@Entity
@Table(name = "ANIMAL_TYPE")
public class AnimalType {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    @Column(unique = true)
    String name;
}
