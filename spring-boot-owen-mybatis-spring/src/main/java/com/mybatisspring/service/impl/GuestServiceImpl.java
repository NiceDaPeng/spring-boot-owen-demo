package com.mybatisspring.service.impl;

import com.mybatisspring.bean.Guest;
import com.mybatisspring.mapper.GuestMapper;
import com.mybatisspring.mapper2.GuestMapper2;
import com.mybatisspring.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuestServiceImpl implements GuestService {

//    @Autowired
//    private GuestMapper mapper1;

    @Autowired
    private GuestMapper2 mapper;
    @Override
    public List<Guest> list() {
        return mapper.list();
    }
}
