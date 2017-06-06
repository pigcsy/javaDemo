package com.third;

/**
 * Created by maven on 2017/1/5.
 */
public class ReflectedMain {
    public static void main(String[] args) {
        // 客户端调用：
        RealSubject real = new RealSubject();
        Subject sub = new ProxySubject(real);
        sub.request();
    }
}
