package com.versilistyson.javazoo.model;

import javax.persistence.*;

@Entity
@Table(name = "PHONE")
public class Phone {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    @ManyToOne
    @JoinColumn(name = "phone_type", referencedColumnName = "name")
    Phone phoneType;

    String number;

    @ManyToOne
    @JoinColumn(name = "zoo_id", referencedColumnName = "id")
    long zooId;
}
