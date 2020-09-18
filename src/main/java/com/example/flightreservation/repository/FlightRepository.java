package com.example.flightreservation.repository;

import com.example.flightreservation.models.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightRepository  extends JpaRepository<Flight, Integer> {
}
