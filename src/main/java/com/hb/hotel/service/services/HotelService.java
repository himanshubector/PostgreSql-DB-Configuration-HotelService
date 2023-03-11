package com.hb.hotel.service.services;

import com.hb.hotel.service.entities.Hotel;

import java.util.List;

public interface HotelService
{
    // create
    Hotel createHotel(Hotel hotel);


    // get all
    List<Hotel> getAllHotels();



    // get single
    Hotel getHotel(String id);

}
