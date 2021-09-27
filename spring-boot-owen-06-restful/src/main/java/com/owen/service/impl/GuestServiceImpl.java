package com.owen.service.impl;

import com.owen.bean.Guest;
import com.owen.mapper.GuestDao;
import com.owen.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;


@Service
public class GuestServiceImpl implements GuestService {

    @Autowired
    private GuestDao guestDao;

    @Override
    public List<Guest> list() {
        List<Guest> guestList = guestDao.list();
        return guestList;
    }

    public void add(Guest guest){
        guestDao.add(guest);
    }

    @Override
    public void update(Guest guest) {

        guestDao.update(guest);
    }

    public void delete(String name){
        guestDao.delete(name);
    }

    @Override
    public Guest get(String name) {
        return guestDao.get(name);
    }

    @Override
    public Set roles() {
        return guestDao.roles();
    }
}
