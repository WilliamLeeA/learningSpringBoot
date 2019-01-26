package com.lee.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
/**
* @Description:    java类作用描述
* @Author:         Lee_William
* @CreateDate:     2019/1/26 23:32
 *
 * 实现文件上传功能，访问http://localhost:8081/upload
 * 并且使用MultipartFile进行管理上传的文件 使用内置方法 transferTo进行保存到本地
 * 保存时先获取文件的原始文件名（文件名.类型），使用字符串拼接 具体位置+文件 进行保存
 *
*/
@Controller
public class FileUploadHandle {
    @ResponseBody
    @PostMapping("/upload")
    public String fileReceive(
            @RequestPart("file") MultipartFile uploadedFile
    ) {
        if(uploadedFile.isEmpty()){
            return "Filed";
        }
        String fileName = uploadedFile.getOriginalFilename();
        String path = "C:/Users/lee/Desktop/YourSpace/";
        File file = new File(path+fileName);
        System.out.println(path + fileName);
        try{
            uploadedFile.transferTo(file);
        }catch (Exception e){
            System.out.println(e.toString());
        }catch (Error error){
            System.out.println(error);
        }
        return "GOOD";
    }
}
