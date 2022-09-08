package com.demo.utils;

import com.demo.pojo.ResultVO;
import org.springframework.http.*;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

public class Utils {
    /**
     * 向目的URL发送post请求
     * @param url       目的url
     * @param params    发送的参数
     * @return  ResultVO
     */
    public static String sendPostRequest(String url, Map<String, Map<String,String>> params){
        RestTemplate client = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        HttpMethod method = HttpMethod.POST;
        // 以表单的方式提交
        headers.setContentType(MediaType.APPLICATION_JSON_UTF8);
        //将请求头部和参数合成一个请求
        HttpEntity<Map<String, Map<String,String>>> requestEntity = new HttpEntity<>(params, headers);
        //执行HTTP请求，将返回的结构使用ResultVO类格式化
        ResponseEntity<String> response = client.exchange(url, method, requestEntity, String.class);
        int value = response.getStatusCodeValue();
        return response.getBody();
    }
}
