package com.rxjava;

import rx.Observable;
import rx.Observer;

import java.util.concurrent.TimeUnit;

/**
 * Created by maven on 2017/2/9.
 */
//定时
public class SecondRxJava {

    public static void main(String[] args) throws InterruptedException {

        //     Observable.interval(2, TimeUnit.SECONDS).subscribe(new Action1<Long>() {
        //         @Override
        //         public void call(Long aLong) {
        //             System.out.println(" call : " + aLong);
        //         }
        //     });
        //     // Thread.sleep(timestamp)
        //     Thread.sleep(6000);
        // }
        Observable.interval(2, TimeUnit.SECONDS).subscribe(new Observer<Long>() {
            @Override
            public void onCompleted() {
                System.out.println("completed");
            }

            @Override
            public void onError(Throwable e) {
                System.out.println("erro");
            }

            @Override
            public void onNext(Long number) {
                System.out.println("hi dear");
            }
        });
        Thread.sleep(6000);
    }

}
