package com.microservices.hotel.HotelService.services.impl;

import com.microservices.hotel.HotelService.entities.Hotel;
import com.microservices.hotel.HotelService.exceptions.ResourceNotFoundException;
import com.microservices.hotel.HotelService.repositories.HotelRepo;
import com.microservices.hotel.HotelService.services.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class HotelImpl implements HotelService {

    @Autowired
    private HotelRepo hotelRepo;
    @Override
    public Hotel create(Hotel hotel) {
        String hotelId = UUID.randomUUID().toString();
        hotel.setId(hotelId);
        return hotelRepo.save(hotel);
    }

    @Override
    public List<Hotel> getAll() {
        return hotelRepo.findAll();
    }

    @Override
    public Hotel getById(String id) {
        return hotelRepo.findById(id).orElseThrow(()->new ResourceNotFoundException("Id not found"));
    }
}
