package com.microservices.hotel.HotelService.services;

import com.microservices.hotel.HotelService.entities.Hotel;

import java.util.List;

public interface HotelService {

    Hotel create(Hotel hotel);
    List<Hotel> getAll();
    Hotel getById(String id);
}
