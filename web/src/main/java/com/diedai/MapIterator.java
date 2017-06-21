package com.diedai;

import java.time.Clock;
import java.time.Instant;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by pig on 2017/6/21.
 */

public class MapIterator {
    public static void main(String[] args) {

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(1, 1);
        map.put(2, 2);
        map.put(3, 3);

        //第一种
        final Clock clock1 = Clock.systemUTC();
        int start=clock1.instant().getNano();
        System.out.println("泛型迭代");
        Iterator<Map.Entry<Integer, Integer>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, Integer> entry = it.next();
            System.out.println("key=" + entry.getKey() + "," + "value=" + entry.getValue());
        }
        final Clock clock2 = Clock.systemUTC();
        int end=clock2.instant().getNano();
        System.out.println(end-start);


        //第二种
        System.out.println("推荐");
        final Clock clock3 = Clock.systemUTC();
        int start3=clock3.instant().getNano();
        for(Map.Entry<Integer, Integer> entry:map.entrySet()){
            System.out.println("key=" + entry.getKey() + "," + "value=" + entry.getValue());
        }
        final Clock clock4 = Clock.systemUTC();
        int end4=clock4.instant().getNano();
        System.out.println(end4-start3);

        //第三种
        System.out.println("通过键找值，效率低");
        final Clock clock5 = Clock.systemUTC();
        int start5=clock5.instant().getNano();
        for (Integer key : map.keySet()) {
            System.out.println("key= "+ key + " and value= " + map.get(key));
        }
        final Clock clock6 = Clock.systemUTC();
        int end6=clock6.instant().getNano();
        System.out.println(end6-start5);

        //第四种
        System.out.println("老版本迭代");
        final Clock clock7 = Clock.systemUTC();
        int start7=clock7.instant().getNano();
        int s = Instant.now().getNano();
        Iterator iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();
            Integer key = (Integer)entry.getKey();
            Integer value = (Integer)entry.getValue();
            System.out.println("Key = " + key + ", Value = " + value);
        }
        final Clock clock8 = Clock.systemUTC();
        int end8=clock8.instant().getNano();
        int e = Instant.now().getNano();
        System.out.println(end8-start7);
        System.out.println(e-s);
    }


}
