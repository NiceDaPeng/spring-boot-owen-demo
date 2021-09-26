package com.owen.service.impl;

import com.owen.bean.Guest;
import com.owen.dao.GuestDao;
import com.owen.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class GuestServiceImpl implements GuestService {

    @Autowired
    private GuestDao guestDao;

    @Override
    public List<Guest> list() {
        List<Guest> guestList = guestDao.list();
        return guestList;
    }
}
