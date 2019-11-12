package com.versilistyson.javazoo.model;

import javax.persistence.*;

@Entity
@Table(
        name = "ANIMAL",
        uniqueConstraints = {
                @UniqueConstraint(
                        columnNames = {
                                "id",
                                "name",
                                "animal_type",
                                "zoo_id"
                        }
                )
        }
)
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    String name;

    @ManyToOne()
    @JoinColumn(name = "animal_type", referencedColumnName = "name")
    private AnimalType animalType;

    @ManyToOne
    @JoinColumn(name = "zoo_id", referencedColumnName = "id")
    private Zoo zooId;
}
