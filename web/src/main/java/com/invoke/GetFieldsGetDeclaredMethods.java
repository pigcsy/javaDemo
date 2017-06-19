package com.invoke;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created by pig on 2017/6/19.
 */

public class GetFieldsGetDeclaredMethods {
    public static void main(String[] args) {
        Class c1 = Entity.class;

        Field[] fs = c1.getFields();
        System.out.println("*******getFields()*********");
        for (int i = 0; i < fs.length; i++) {
            System.out.println(fs[i].getName());
        }
        System.out.println("*******getDeclaredFields()*********");
        fs = c1.getDeclaredFields();
        for (int i = 0; i < fs.length; i++) {
            System.out.println(fs[i].getName());
        }
        System.out.println("*******getMethods()*********");
        Method[] md = c1.getMethods();
        for (int i = 0; i < md.length; i++) {
            System.out.println(md[i].getName());
        }
        System.out.println("*******getDeclaredMethods()*********");
        md = c1.getDeclaredMethods();
        for (int i = 0; i < md.length; i++) {
            System.out.println(md[i].getName());
        }

        System.out.println("*******getConstructors()*********");
        Constructor[] con = c1.getConstructors();
        for (int i = 0; i < con.length; i++) {
            System.out.println(con[i].getName());
        }
        System.out.println("*******getDeclaredConstructors()*********");
        con = c1.getDeclaredConstructors();
        for (int i = 0; i < con.length; i++) {
            System.out.println(con[i].getName());
        }
    }
}

