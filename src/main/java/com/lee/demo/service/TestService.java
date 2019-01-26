package com.lee.demo.service;

import com.lee.demo.model.User;
import com.lee.demo.model.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
* @Description:    java类作用描述
* @Author:         Lee_William
* @CreateDate:     2019/1/26 23:48
 *
 * 这是一个测试 测试自动注入的方法
 *
*/

public class TestService {
    @Autowired
    @Qualifier(value = "user_1")
    private User user;
    @Autowired
    @Qualifier("userInfo_1")
    private UserInfo userInfo;
    public void run() {
        System.out.println(user.toString());
        System.out.println(userInfo.toString());
    }
}
