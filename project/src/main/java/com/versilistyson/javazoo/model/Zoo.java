package com.versilistyson.javazoo.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "ZOO")
public class Zoo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    @Column(unique = true)
    String name;

    @OneToMany(mappedBy = "zoo_id")
    public Set<Animal> animals;

    @Column(name = "phone_numbers")
    @OneToMany(mappedBy = "zoo_id")
    public Set<Phone> phoneNumbers;
}
