package com.lee.demo.controller;

import com.lee.demo.model.User;
import com.lee.demo.model.UserInfo;
import com.lee.demo.repository.UserRepository;
import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
* @Description:    java类作用描述
* @Author:         Lee_William
* @CreateDate:     2019/1/17 0:35
 *
 *1.通过模拟从数据库调用数据进行分页显示到页面，这是采用的查询参数 function : usersForQueryArg
 * 并且在使得该控制器下都能进行跨域访问
 *
*/
@Controller
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class LoginController {

    @Autowired
    @Qualifier(value = "userRepository")
    private UserRepository userRepository;

    @RequestMapping("/home")
    public String login() {
        System.out.println("/home");
        return "home";
    }
    @RequestMapping("/users")
    public String usersForQueryArg(
            @RequestParam int page,
            @RequestParam int count,
            Map<String,Object> map
    ) {
        System.out.println("queryParam page : "+page+" , count : "+count);
        List<User> all = new ArrayList<User>();
        all = userRepository.findAll(page,count);
        map.put("users", all);
        map.put("currentPage",page);
        return "users";
    }
    @RequestMapping(value = "/alluser",method = RequestMethod.GET)
    @ResponseBody
    public Map<String, Object> usersForQuery(
            @RequestParam int page,
            @RequestParam int count

    ) {
        Map<String,Object> map = new HashMap<>();
        List<User> all = new ArrayList<User>();
        all = userRepository.findAll(page,count);
        map.put("usersInfo",all);
        map.put("pageNumber",page);
        return map;
    }

    @RequestMapping(value = "/allusera",method = RequestMethod.GET)
    @ResponseBody
    public Map<String, Object> usersForQueryall() {
        List<User> all = new ArrayList<>();
        all = userRepository.findAll(2,10);
        Map<String, Object> map = new HashMap<>();
        map.put("all",all);
        return map;
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public String login(String name, String password) {
        System.out.println(name+", "+password);
        return "GOOD";
    }


    @GetMapping("/register")
    public String register() {
        return "register";
    }

    @PostMapping("/register")
    @ResponseBody
    public String signIn(User user) {
        user.setId(10);
        System.out.println(user.getId()+", "+user.getName());
        return "GOOD";
    }
}

