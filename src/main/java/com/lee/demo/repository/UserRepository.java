package com.lee.demo.repository;

import com.lee.demo.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Repository(value = "userRepository")
public class UserRepository {
    public List<User> findAll(int page, int count) {
        List<User> tempPage = new ArrayList<User>();
        if(page<1){
            page = 1;
        }
        for (int i = 1; i <= count; i++) {
            User tempUser = new User((page - 1) * count + i, "li_"+(page - 1) * count + i, 10 + i, new Date(), "10");
            tempPage.add(tempUser);
        }
        return tempPage;
    }
}
