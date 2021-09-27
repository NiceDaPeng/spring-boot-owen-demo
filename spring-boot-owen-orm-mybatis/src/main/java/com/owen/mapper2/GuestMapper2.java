package com.owen.mapper2;

import com.owen.bean.Guest;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GuestMapper2 {

    List<Guest> findAll();
}
