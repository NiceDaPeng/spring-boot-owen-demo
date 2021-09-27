package com.owen.mapper;

import com.owen.bean.Guest;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GuestMapper {

    List<Guest> findAll();
}
