package com.huadian.dao.user;

import com.huadian.domain.user.bo.UserBo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
     //查询用户列表
    public List<UserBo> queryUserList();
    //返回单个实体
    UserBo getUserById(String userId);
}
