package com.example.demo;

import com.google.cloud.spring.data.spanner.core.mapping.PrimaryKey;

import com.google.cloud.spring.data.spanner.core.mapping.Table;

@Table(name = "Passenger")
public class Passenger {

    @PrimaryKey
    private String passengerId;

    private String name;
    private Long age;

    public Passenger() {}  // default constructor

public String getPassengerId() { return passengerId; }
public void setPassengerId(String passengerId) { this.passengerId = passengerId; }

    public String getName() { return name; }
public void setName(String name) { this.name = name; }

    public Long getAge() { return age; }
public void setAge(Long age) { this.age = age; }

    // getters, setters
}
