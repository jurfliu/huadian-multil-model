package com.huadian.user;

import com.huadian.domain.user.bo.UserBo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName: UserController
 * @Description: TODO
 * @Author: liujianfu
 * @Date: 2021/06/04 17:50:02 
 * @Version: V1.0
 **/
@Controller
@RequestMapping(value = "/user")
public class UserController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private UserService userService;
    @ResponseBody
    @GetMapping("/single")
    public Object findSingleUser(String userId){
        logger.info("查询用户信息.......");
        UserBo pageInfo=userService.getUserById(userId);
        return  pageInfo;
    }
}

