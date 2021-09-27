package com.owen.service.impl;

import com.owen.bean.Guest;
import com.owen.mapper.GuestMapper;
import com.owen.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class GuestServiceImpl implements GuestService {

    @Autowired
    private GuestMapper guestMapper;

    @Override
    public List<Guest> findAll() {
       return guestMapper.findAll();
    }
}
