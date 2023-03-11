package com.hb.hotel.service.controllers;


import com.hb.hotel.service.entities.Hotel;
import com.hb.hotel.service.services.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotels")
public class HotelController
{
    @Autowired
    private HotelService hotelService;

    //create

    @PostMapping
    public ResponseEntity<Hotel> createHotel(@RequestBody Hotel hotel)
    {
        Hotel hotel1 = hotelService.createHotel(hotel);
        return ResponseEntity.status(HttpStatus.CREATED).body(hotel1);
    }


    //get single
    @GetMapping("/{hotelId}")
    public ResponseEntity<Hotel> getHotel(@PathVariable String hotelId)
    {
        Hotel hotel = hotelService.getHotel(hotelId);
        return ResponseEntity.status(HttpStatus.OK).body(hotel);
    }



    //get all

    @GetMapping
    public ResponseEntity<List<Hotel>> getAllHotels()
    {
        List<Hotel> hotels = hotelService.getAllHotels();
        return ResponseEntity.status(HttpStatus.OK).body(hotels);
    }

}
