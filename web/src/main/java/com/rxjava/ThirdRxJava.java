package com.rxjava;

import rx.Observable;
import rx.functions.Action1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by maven on 2017/2/9.
 */
public class ThirdRxJava {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("from1");
        list.add("from2");
        list.add("from3");
        Observable.just(list).subscribe(new Action1<List<String>>() {
            @Override
            public void call(List<String> list) {
                Observable.from(list).subscribe(new Action1<String>() {
                    @Override
                    public void call(String s) {
                        System.out.println("这不是一个标准写法！" + s);
                    }
                });
            }
        });

    }

}
