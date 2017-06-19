package com.invoke;

import lombok.Data;

/**
 * Created by pig on 2017/6/19.
 */
@Data
public class Entity {
    public static String s = null;
    public String name = null;
    private String sex = null;
    private String age = null;
    private String tel = null;
    private String address = null;
    private void showPeopleInfo() {
       System.out.println(name + " " + sex + " " + age + " " + tel + " "
                + address);
        }
}
