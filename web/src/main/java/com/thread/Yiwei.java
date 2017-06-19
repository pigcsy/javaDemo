package com.thread;

/**
 * Created by maven on 2017/3/20.
 * 移位操作的简单计算方法
 * <p>
 * >>右移操作
 * <p>
 * x>>y
 * <p>
 * 就是x除以2的y此方,取整数
 * <p>
 * <<左移操作
 * <p>
 * X<<y
 * <p>
 * 就是x乘以2的y次方
 */


public class Yiwei {
    public static void main(String[] args) {
        int number = 16;
        //原始数二进制
        printInfo(number << 2);
        //左移一位
        printInfo(number >>> 2);
        //右移一位
    }

    /**
     * 输出一个int的二进制数
     *
     * @param num
     */
    private static void printInfo(int num) {
        System.out.println(num);
    }
}
