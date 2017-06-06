package com.singleton;

/**
 * Created by maven on 2017/2/8.
 */
public class TestSingleton {
    private static volatile TestSingleton instance = null;
    String name1 = "aa";
    String name2 = "bb";

    private TestSingleton() {
    }

    public static TestSingleton getInstance() {
        if (instance == null) {
            synchronized (TestSingleton.class) {
                if (instance == null) {
                    instance = new TestSingleton();
                }
            }
        }
        return instance;
    }

    public static void setInstance(TestSingleton instance) {
        TestSingleton.instance = instance;
    }

    public static void main(String[] args) {
        TestSingleton testSingleton = TestSingleton.getInstance();
        System.out.println("the name1 is " + testSingleton.getName1());
        System.out.println("the name2 is " + testSingleton.getName2());

    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

}

