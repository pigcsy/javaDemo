package com.extend;

/**
 * Created by pig on 2017/6/13.
 */

public class Son extends Father {
    public static void main(String[] args) {
        Father father = new Father();
        Father father1 = new Son();
        Son son = new Son();
        // ConvertPro son1 = (ConvertPro) new Father();
        // son = (ConvertPro)father;
        // Son = (Son) father1;

    }
}
