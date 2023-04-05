package com.microservices.hotel.HotelService.controllers;

import com.microservices.hotel.HotelService.entities.Hotel;
import com.microservices.hotel.HotelService.services.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotel")
public class HotelController {

    @Autowired
    private HotelService hotelService;

    @PostMapping
    public ResponseEntity<Hotel> createHotel(@RequestBody Hotel hotel){
        return ResponseEntity.status(HttpStatus.CREATED).body(hotelService.create(hotel));
    }

    @GetMapping("/{hotelId}")
    public ResponseEntity<Hotel> getHotelById(String hotelId){
        return ResponseEntity.status(HttpStatus.CREATED).body(hotelService.getById(hotelId));
    }

    @GetMapping
    public ResponseEntity<List<Hotel>> getHotel(){
        return ResponseEntity.status(HttpStatus.CREATED).body(hotelService.getAll());
    }

}
