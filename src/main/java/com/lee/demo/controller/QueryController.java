package com.lee.demo.controller;

import com.lee.demo.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
* @Description:    java类作用描述
* @Author:         Lee_William
* @CreateDate:     2019/1/26 23:39
 *
 * 本方法就是进行 查询参数的 demo，根据id进行查询不同的结果
 *
 * 注意写法
 *
*/

@Controller
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class QueryController {
    @RequestMapping(value = "/user/{id}",method = RequestMethod.GET)
    @ResponseBody
    public Map<String, List> findOne(
            @PathVariable("id") int id
    ) {
        Map<String, List> map = new HashMap<>();
        List<User> list = new ArrayList<>();
        User user = new User(id,"li_"+id,16,new Date(),"10");
        list.add(user);
        map.put("APersonInfo",list);
        return map;
    }
}