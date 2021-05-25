package com.example.mapentitytotwotables.mapentitytotwotables;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@SecondaryTable(name = "cardDetails")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String carName;

    @Column(table = "cardDetails")
    private String model;

    @Column(table = "cardDetails")
    private Integer year;

    @Column(table = "cardDetails")
    private String color;

    @Column(table = "cardDetails")
    private String manufacturer;




}
