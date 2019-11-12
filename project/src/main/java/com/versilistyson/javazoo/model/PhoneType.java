package com.versilistyson.javazoo.model;

import javax.persistence.*;

@Entity
@Table(name = "PHONE_TYPE")
public class PhoneType {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    @Column(unique = true)
    String name;
}
