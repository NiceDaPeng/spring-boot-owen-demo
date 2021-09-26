package com.owen.dao;

import com.owen.bean.Guest;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class GuestDao {

    static List<Guest> guestList = new ArrayList<>();

    static {

        guestList.add(new Guest("黄晓明","店长"));
        guestList.add(new Guest("秦海璐","财务"));
        guestList.add(new Guest("林淑薇","总厨"));
        guestList.add(new Guest("王俊凯","经理"));
        guestList.add(new Guest("杨紫","前台"));
    }

    public List<Guest> list(){
        return guestList;
    }


}
