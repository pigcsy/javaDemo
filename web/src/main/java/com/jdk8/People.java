package com.jdk8;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by maven on 2017/4/5.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class People {
    /**
     * 学号
     */
    private long id;

    private String name;

    private int age;

    /**
     * 年级
     */
    private int grade;

    /**
     * 专业
     */
    private String major;

    /**
     * 学校
     */
    private String school;

    // List<String> str;


    // 省略getter和setter
}
