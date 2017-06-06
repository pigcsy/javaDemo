package com.rxjava;

/**
 * Created by maven on 2017/2/15.
 */
public class CarPaintCalculation {
    public static Integer CarPaintPrice(Integer carPrice) {
        Integer CarPaintPrice = 0;
        if (carPrice != null&& 70000<=carPrice && carPrice<1000000) {
            if (70000 <= carPrice && carPrice < 200000) {
                CarPaintPrice = 599;
            }else if(200000 <= carPrice && carPrice < 400000) {
                CarPaintPrice=699;
            }else if(400000 <= carPrice && carPrice < 600000) {
                CarPaintPrice=799;
            }else if(600000 <= carPrice && carPrice < 1000000){
                CarPaintPrice=899;
            }
        }
        return CarPaintPrice;
    }

    public static void main(String[] args) {
        Integer s=CarPaintCalculation.CarPaintPrice(150000);
        System.out.println(s);
    }
}
