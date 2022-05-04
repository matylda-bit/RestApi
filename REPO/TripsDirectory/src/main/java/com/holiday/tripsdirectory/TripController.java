package com.holiday.tripsdirectory;


import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("api/v1/trips")
@RequiredArgsConstructor
public class TripController {

   private final TripService tripService;

   @GetMapping
    Iterable<Trip> getTrips(){
       return tripService.getTrips();
   }

    @GetMapping({"id"})
    Trip getTrip(@PathVariable UUID id){

       return tripService.getTrip(id);
   }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    Trip createTrip(@RequestBody Trip trip) {
       return tripService.createTrip(trip);
}

    @PutMapping("{id}")
    Trip updateTrip(@PathVariable UUID id, @RequestBody Trip trip) {
        return tripService.updateTrip(id, trip);
    }

    @DeleteMapping("{id}")
    void deleteTrip(@PathVariable UUID id) {
        tripService.deleteTrip(id);
    }
}

    //CRUD CREATE READ UPDATE DELETE

    //C create
        //POST api/v1/movies

    //R read
        //GET api/v1/movies
        //GET api/v1/movies/{id}

    //U update
        // PUT api/v1/movies/{id}

    //D delete



