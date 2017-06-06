package com.rxjava;

import rx.Observable;
import rx.Subscriber;
import rx.functions.Action1;
import rx.functions.Func1;

/**
 * Created by maven on 2017/2/15.
 */
public class CarRepairCalculation {
    public static Integer CarRepairPrice(final Integer carPrice,final Integer amt,final Integer city) { //城市对应ID：杭州(1) 北京(2) 广州(3) 上海(4)
        final Integer[] price = {0};
        Observable.create(new Observable.OnSubscribe<Integer>() {

            @Override
            public void call(Subscriber<? super Integer> subscriber) {           //条件 ···
                try {
                    if (amt >= carPrice * 0.3) {
                        if(amt < carPrice){
                            if (0 <= amt && 0 <= carPrice) {
                                double carPrices = carPrice;
                                double amts = amt;
                                double base = 0;
                                double rate = 0;
                                double factorNcdCity = 0.85;
                                double factorUwCity = 0.85;
                                double factorChanneCity = 0.85;
                                Double aioFactor = -Math.pow((amts / carPrices), 2) + 2 * (amts / carPrices);
                                if (city == 1) {
                                    base = 566;
                                    rate = 0.0135;
                                } else if (city == 2) {
                                    base = 539;
                                    rate = 0.0128;
                                } else if (city == 3) {
                                    base = 539;
                                    rate = 0.0128;
                                } else if (city == 4) {
                                    base = 596;
                                    rate = 0.0141;
                                }
                                Double stdPrem = base + rate * carPrices * aioFactor;
                                Double priceNonMember = stdPrem * factorNcdCity * factorUwCity * factorChanneCity;
                                Double priceNonMemberNoS = priceNonMember * 0.7;
                                price[0] = (new Double(priceNonMemberNoS)).intValue();
                                subscriber.onNext(price[0]);
                            }
                        }else{
                            throw new Throwable("最高可购买额度不超过车辆购置价");
                        }
                    } else {
                        throw new Throwable("最低可购买额度不低于车辆购置价的30%");
                    }

                } catch (Throwable throwable) {
                    throwable.printStackTrace();
                }
            }
        }).flatMap(new Func1<Integer, Observable<Integer>>() {
            @Override
            public Observable<Integer> call(Integer price) {
                return Observable.from(new Integer[]{price});
            }
        }).subscribe((Action1<? super Integer>) new Action1<Integer>() {
            @Override
            public void call(Integer price) {
                //拿到车辆价格
            }
        });
        return price[0];
    }

    public static void main(String[] args) {
        Integer a = CarRepairCalculation.CarRepairPrice(200000, 120000, 1);
        System.out.println(a);
    }
}

