package com.owen.dao;

import com.owen.bean.Guest;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Repository
public class GuestDao {

    static List<Guest> guestList = new ArrayList<>();

    static {

        guestList.add(new Guest("黄晓明", "店长"));
        guestList.add(new Guest("秦海璐", "财务"));
        guestList.add(new Guest("林淑薇", "总厨"));
        guestList.add(new Guest("王俊凯", "经理"));
        guestList.add(new Guest("杨紫", "前台"));
    }

    public List<Guest> list() {
        return guestList;
    }


    public void add(Guest guest) {
        guestList.add(guest);
    }

    //    获取操作
    public Guest get(String name) {
        for (Guest guest :
                guestList) {
            if (guest.getName().equals(name)) {
                return guest;
            }

        }

        return new Guest();
    }

    public void update(Guest newGuest) {

        Guest oldGuest = get(newGuest.getName());
        oldGuest.setRole(newGuest.getRole());

    }

    public void delete(String name) {
        Guest guest = get(name);
            guestList.remove(guest);

    }

    //设计一个方法获取所有的role
    public Set<String> roles() {

        Set<String> roleList = new HashSet<>();

        for (Guest guest :
                guestList) {
            String role = guest.getRole();
            roleList.add(role);

        }
        return roleList;
    }
}
