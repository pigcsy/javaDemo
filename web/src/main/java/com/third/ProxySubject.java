package com.third;

/**
 * Created by maven on 2017/1/5.
 */
public class ProxySubject extends Subject {

    // 以真实角色作为代理角色的属性
    private Subject realSubject;

    public ProxySubject(Subject realSubject) {
        this.realSubject = realSubject;
    }

    // 该方法封装了真实对象的request方法
    public void request() {
        preRequest();
        postRequest();
        realSubject.request();  // 此处执行真实对象的request方法

    }

    private void preRequest() {
        System.out.println(" 这是第一个 ");

    }

    private void postRequest() {
        System.out.println(" 这是第二个 ");

    }
}
