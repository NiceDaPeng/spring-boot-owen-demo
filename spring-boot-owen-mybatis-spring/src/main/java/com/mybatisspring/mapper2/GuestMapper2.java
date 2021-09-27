package com.mybatisspring.mapper2;

import com.mybatisspring.bean.Guest;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface GuestMapper2 {

    @Select("select * from guest")
    public List<Guest> list();
}
