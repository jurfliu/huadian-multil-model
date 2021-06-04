package com.huadian.user;

import com.huadian.domain.user.bo.UserBo;

public interface UserService {
    //返回单个实体
    UserBo getUserById(String userId);
}
