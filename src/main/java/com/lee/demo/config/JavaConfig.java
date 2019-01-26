package com.lee.demo.config;

import com.lee.demo.model.User;
import com.lee.demo.model.UserInfo;
import com.lee.demo.service.TestService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Date;

@Configuration
public class JavaConfig {
    @Bean(name = "user_1")
    public User user() {
        return new User(10,"lee",18,new Date(),"10");
    }
    @Bean(name = "userInfo_1")
    public UserInfo userInfo() {
        return new UserInfo("lw","123456");
    }
    @Bean(name = "test_serivce_1")
    public TestService testService() {
        return new TestService();
    }
}
