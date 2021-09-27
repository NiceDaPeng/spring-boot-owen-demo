package com.owen.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.owen.bean.Guest;
import com.owen.mapper.GuestMapper;
import com.owen.service.GuestService;
import org.springframework.stereotype.Service;


@Service
public class GuestServiceImpl extends ServiceImpl<GuestMapper,Guest> implements GuestService{

//    @Autowired
//    private GuestMapper guestMapper;
//    @Override
//    public List<Guest> findAll() {
//        return guestMapper.selectList(null);
//    }
}
