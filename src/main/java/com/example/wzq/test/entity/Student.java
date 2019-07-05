package com.example.wzq.test.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * @program: demo2
 * @description: 1234
 * @author: Wzq
 * @create: 2019-07-05 11:49
 */
@Data
@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    private String name;

}
