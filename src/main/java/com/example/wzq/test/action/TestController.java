package com.example.wzq.test.action;

import com.example.wzq.test.entity.Student;
import com.example.wzq.test.service.TestService;
import com.google.common.collect.Maps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @program: demo2
 * @description: testController
 * @author: Wzq
 * @create: 2019-07-05 10:55
 */
@RestController
@RequestMapping(value = "/test")
public class TestController {

    @Autowired
    TestService testService;

    @RequestMapping(value = "/test")
    public Object getTest(){
        Map<String,String> map = Maps.newHashMap();
        map.put("name","wzq");
        List<Student> list = this.testService.getStudent();
        return list;
    }

}

