package com.third;


/**
 * Created by maven on 2017/1/5.
 */

import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;
import java.lang.reflect.Proxy;

public class TestMain {
    public static void main(String args[]) {
        TestRealReflect real = new TestRealReflect();
        Test.Reflect proxyReflect = (Test.Reflect) Proxy.newProxyInstance(Test.Reflect.class.getClassLoader(), new Class[]{Test.Reflect.class}, new ProxyHandler(real));
        proxyReflect.doSomething();
        //write proxySubject class binary data to file
        createProxyClassFile();
    }

    public static void createProxyClassFile() {
        String name = "proxyReflect";
        byte[] data = ProxyGenerator.generateProxyClass(name, new Class[]{Test.Reflect.class});
        try {
            FileOutputStream out = new FileOutputStream(name + ".class");
            out.write(data);
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

