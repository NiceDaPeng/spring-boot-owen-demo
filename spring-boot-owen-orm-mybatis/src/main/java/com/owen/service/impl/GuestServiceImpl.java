package com.owen.service.impl;

import com.owen.bean.Guest;
import com.owen.mapper2.GuestMapper2;
import com.owen.service.GuestService;
import com.owen.tk.mapper.TKGuestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class GuestServiceImpl implements GuestService {

//    @Autowired
//    private GuestMapper guestMapper;

    @Autowired
    private GuestMapper2 mapper;

    @Override
    public List<Guest> findAll() {
       return mapper.findAll();
    }
}
