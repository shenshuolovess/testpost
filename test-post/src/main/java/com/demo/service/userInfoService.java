package com.demo.service;

import com.demo.pojo.ResultVO;
import com.demo.utils.Utils;

import java.util.HashMap;
import java.util.Map;

public class userInfoService {
    public static String getUserInfoFromAuthority(String domain, String account, String key) {
        String authorizeUrl = "http://localhost:8889/hello";
        Map<String,String> map=new HashMap<>();
        Map<String, Map<String,String>> params = new HashMap<>();
        map.put("domain", domain);
        map.put("account", account);
        map.put("key", key);
        params.put("data",map);
        //发送Post数据并返回数据
        String resultVo = Utils.sendPostRequest(authorizeUrl, params);
        return resultVo;
    }

}
