package cn.com.bluemoon.webinterceptor.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloEndpoint {
    /**
     * 一个hello word的请求
     * @return
     */
    @GetMapping
   public Map<String,Object> helloWord(){
        Map<String,Object> map=new HashMap<>(1);
        map.put("hello", "world");
        return map;
   }
}
