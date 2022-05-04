package com.holiday.tripsdirectory;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class TripService {

    private final TripRepository tripRepository;

    public Iterable<Trip> getTrips(){
        return tripRepository.findAll();
    }

    public Trip getTrip(UUID id){
        return tripRepository.findById(id)
                .orElseThrow();
    }

    public Trip createTrip(Trip trip) {
        trip.setId(UUID.randomUUID());

        return tripRepository.save(trip);}

    public Trip updateTrip(UUID id, Trip tripToUpdate) {
        Trip trip = tripRepository.findById(id).orElseThrow();
        trip.setLocation(tripToUpdate.getLocation());

        return tripRepository.save(trip);

    }

    public void deleteTrip(UUID id) {
        tripRepository.deleteById(id);
    }
}

