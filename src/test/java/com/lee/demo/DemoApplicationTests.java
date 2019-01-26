package com.lee.demo;

import com.lee.demo.config.JavaConfig;
import com.lee.demo.controller.LoginController;
import com.lee.demo.service.TestService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Test
    public void contextLoads() {
//        try {
//            LoginController loginController = new LoginController() ;
//            MockMvc mockMvc = MockMvcBuilders.standaloneSetup(loginController).build();
//            mockMvc.perform(get("/home"))
//                    .andExpect(MockMvcResultMatchers.view().name("home"))
//                    .andReturn();
//        }catch (Exception e){
//            System.err.println("find exception : "+e.toString());
//        }

        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(JavaConfig.class);
        TestService testService = annotationConfigApplicationContext.getBean("test_serivce_1", TestService.class);
        testService.run();


    }

}

