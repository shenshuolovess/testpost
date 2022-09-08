package com.demo.controller;

import com.demo.pojo.ResultVO;
import com.demo.pojo.UserInfo;
import com.demo.service.userInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * 说明这是一个控制器类
 */
@Controller
public class DemoController {
    /**
     * 浏览器访问hello方法,在页面显示Hello World
     * @return
     */
    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "Hello World";
    }


    @PostMapping("/getInfo")
    @ResponseBody
    public String getInfo(@RequestBody Map<String,String> map) {
        String userInfo=null;
        try{
            userInfo = userInfoService.getUserInfoFromAuthority(map.get("domain"), map.get("account"),map.get("password"));
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
