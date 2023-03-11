package com.hb.hotel.service.services.impl;

import com.hb.hotel.service.entities.Hotel;
import com.hb.hotel.service.exceptions.ResourceNotFoundException;
import com.hb.hotel.service.repositories.HotelRepository;
import com.hb.hotel.service.services.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class HotelServiceImpl implements HotelService
{
    @Autowired
    private HotelRepository hotelRepository;


    @Override
    public Hotel createHotel(Hotel hotel)
    {
       String hotelId = UUID.randomUUID().toString();
       hotel.setId(hotelId);
        return hotelRepository.save(hotel);
    }



    @Override
    public List<Hotel> getAllHotels()
    {
        return hotelRepository.findAll();
    }


    @Override
    public Hotel getHotel(String hotelId)
    {
        return hotelRepository.findById(hotelId).orElseThrow(() -> new ResourceNotFoundException("Hotel with given id not found!!" + "having hotelid as: " + hotelId));
    }
}
