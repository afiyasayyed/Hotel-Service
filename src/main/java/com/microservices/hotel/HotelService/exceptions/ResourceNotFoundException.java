package com.microservices.hotel.HotelService.exceptions;

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String idNotFound) {
        super(idNotFound);
    }
}
