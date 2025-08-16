package com.example.demo;

import com.google.cloud.spring.data.spanner.core.mapping.PrimaryKey;

import com.google.cloud.spring.data.spanner.core.mapping.Table;

@Table(name = "Passenger")
public class Passenger {

    @PrimaryKey
    private String passengerId;

    private String name;
    private Long age;

    // getters, setters
}
