package com.owen.service;

import com.owen.bean.Guest;
import com.owen.repository.GuestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class GuestServiceImpl implements GuestService {


    @Autowired
    private GuestRepository repository;

    @Override
    public List<Guest> list() {
        return repository.findAll();
    }


}
