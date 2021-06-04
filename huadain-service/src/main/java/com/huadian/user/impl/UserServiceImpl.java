package com.huadian.user.impl;

import com.huadian.dao.user.UserMapper;
import com.huadian.user.UserService;
import com.huadian.domain.user.bo.UserBo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName: UserServiceImpl
 * @Description: TODO
 * @Author: liujianfu
 * @Date: 2021/06/04 17:53:00 
 * @Version: V1.0
 **/
@Service
public class UserServiceImpl implements UserService {
@Autowired
private UserMapper userMapper;
    @Override
    public UserBo getUserById(String userId) {
        System.out.println("进入service模块:"+userId);
        return userMapper.getUserById(userId);
    }
}
