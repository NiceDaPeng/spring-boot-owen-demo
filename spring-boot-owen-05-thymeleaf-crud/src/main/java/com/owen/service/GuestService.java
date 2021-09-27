package com.owen.service;


import com.owen.bean.Guest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

public interface GuestService {

   List<Guest> list();

   void add(Guest guest);

   void update(Guest guest);

   void delete(String name);

   Guest get(String name);

   Set<String> roles();

}
