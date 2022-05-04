package com.holiday.tripsdirectory;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;


@Getter
@Setter
@Entity

public class Trip {


    public Trip() {

    }
    public Trip(String location) {
        this.id = UUID.randomUUID();
        this.location = location;
    }

@Id
    private UUID id;
    private String location;
    private double price;

    public Trip createTrip(Trip trip){
        return trip;
    }
}
