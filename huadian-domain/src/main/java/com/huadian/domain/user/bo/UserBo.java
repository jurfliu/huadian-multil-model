package com.huadian.domain.user.bo;

/**
 * @ClassName: UserBo
 * @Description: TODO
 * @Author: liujianfu
 * @Date: 2021/06/04 16:29:16 
 * @Version: V1.0
 **/
public class UserBo {
    private int  userId;
    private String userName;
    private String pwd;
    private String tel;
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
}
