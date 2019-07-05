package com.example.wzq.test.service;

import com.example.wzq.test.dao.TestRepository;
import com.example.wzq.test.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * @program: demo2
 * @description: 123
 * @author: Wzq
 * @create: 2019-07-05 11:48
 */
@Service
@Transactional
public class TestServiceImpl implements TestService {


    @Autowired
    TestRepository testRepository;

    @Override
    public List<Student> getStudent() {
        List<Student> list = this.testRepository.findAll();
        return list;
    }
}
