package demo.controller;

import com.alibaba.fastjson.JSONObject;
import com.google.gson.Gson;
import demo.pojo.dd;
import demo.pojo.stu;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
    public String hello(@RequestBody String json){
        JSONObject object = JSONObject
                .parseObject(json);
        return "{\n" +
                "\t\"data\":{\n" +
                "\t\t\"userName\":\"11\",\n" +
                "\t\t\"userAccount\":\"56\",\n" +
                "\t\t\"createTime\":789\n" +
                "\t}\n" +
                "}";
    }
}
