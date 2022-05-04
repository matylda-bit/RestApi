package com.holiday.tripsdirectory;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository

public interface TripRepository extends CrudRepository<Trip, UUID> {

}
