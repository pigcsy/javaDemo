package com.guava;

import com.google.common.base.Function;
import com.google.common.collect.Ordering;

import javax.annotation.Nullable;

/**
 * Created by maven on 2017/2/13.
 */
public class Comparator {
    public static void main(String[] args) {
        class Foo {
            @Nullable
            String sortedBy = "a,b,c";
            int notSortedBy = 123;
        }
        Ordering<Foo> ordering = Ordering.natural().nullsFirst().onResultOf(new Function<Foo, String>() {
            public String apply(Foo foo) {
                return foo.sortedBy;
            }

            public String reString(Foo foo) {
                return foo.sortedBy;
            }

            public int reInt(Foo foo) {
                return foo.notSortedBy;
            }
        });
        System.out.println(ordering);

    }

}
