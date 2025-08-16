package com.example.controller;

import org.springframework.web.bind.annotation.*;

import com.example.demo.Passenger;
import com.example.demo.PassengerRepository;

import java.util.List;

@RestController
@RequestMapping("/passengers")
public class PassengerController {

    private final PassengerRepository repository;

    public PassengerController(PassengerRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public Passenger save(@RequestBody Passenger passenger) {
        return repository.save(passenger);
    }

    @GetMapping
    public List<Passenger> findAll() {
        return (List<Passenger>) repository.findAll();
    }
}
