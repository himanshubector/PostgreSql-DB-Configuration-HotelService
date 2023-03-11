package com.hb.hotel.service.repositories;

import com.hb.hotel.service.entities.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository<Hotel, String>
{



}
