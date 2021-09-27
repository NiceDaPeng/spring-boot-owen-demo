package com.owen.mapper;

import com.owen.bean.Guest;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface GuestMapper {

//    @Select("select `name`,`role` from guest")
    List<Guest> findAll();

}
