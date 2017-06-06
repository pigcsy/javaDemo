package com.second;

import java.util.Arrays;

import static com.second.CopyUntil.badCopyOf;
import static com.second.CopyUntil.goodCopyOf;

/**
 * Created by pig on 2017/1/3.
 */
public class Copy {

    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        a = (int[]) goodCopyOf(a, 10);
        System.out.println(Arrays.toString(a));

        String[] b = {"Tom", "Dick", "Harry"};
        b = (String[]) goodCopyOf(b, 10);
        System.out.println(Arrays.toString(b));

        System.out.println("The following call will generate an exception.");
        b = (String[]) badCopyOf(b, 10);
    }
}
