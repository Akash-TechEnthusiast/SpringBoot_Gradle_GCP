package com.example.demo;

import com.google.cloud.spring.data.spanner.repository.SpannerRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PassengerRepository extends SpannerRepository<Passenger, String> {
}