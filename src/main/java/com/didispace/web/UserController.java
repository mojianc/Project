package com.didispace.web;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
@RequestMapping("/sys/user")
public class UserController {

    @RequestMapping("/login")
    @ResponseBody
//    public Map<String, String> login() {
//        Map<String, String> hashMap = new HashMap<>();
//        hashMap.put("msg", "登录成功");
//        return hashMap;
//    }
    public Result  login(@RequestBody User loginUser) {
    	// 这的能把string转成对象
    	// new ObjectMapper().readValue(string, User.class);
        return new Result(ResultCode.SUCCESS, loginUser);
    }

}