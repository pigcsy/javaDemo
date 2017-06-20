package com.jdk8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * Created by maven on 2017/4/5.
 */

public class Demo {

    public static void main(String[] args) {
        // 初始化
        List<People> peoples = new ArrayList<People>() {
            {
                add(new People(20160001, "孔明", 20, 1, "土木工程", "武汉大学"));
                add(new People(20160002, "伯约", 21, 2, "信息安全", "武汉大学"));
                add(new People(20160003, "玄德", 22, 3, "经济管理", "武汉大学"));
                add(new People(20160004, "云长", 21, 2, "信息安全", "武汉大学"));
                add(new People(20161001, "翼德", 21, 2, "机械与自动化", "华中科技大学"));
                add(new People(20161002, "元直", 23, 4, "土木工程", "华中科技大学"));
                add(new People(20161003, "奉孝", 23, 4, "计算机科学", "华中科技大学"));
                add(new People(20162001, "仲谋", 22, 3, "土木工程", "浙江大学"));
                add(new People(20162002, "鲁肃", 23, 4, "计算机科学", "浙江大学"));
                add(new People(20163001, "丁奉", 24, 5, "土木工程", "南京大学"));
            }
        };
        peoples.add(new People(20160001, "maven", 24, 3, "网络工程", "滁州学院"));
        // //filter筛选
        // List<People> whuStudents = peoples.stream()
        //         .filter(peo -> "武汉大学".equals(peo.getSchool()))
        //         .limit(3).skip(2)
        //         .collect(Collectors.toList());
        // System.out.println(whuStudents);
        //
        // long count = whuStudents.stream().count();
        // System.out.println(count);
        //
        // List<String> names = peoples.stream()
        //         .filter(student -> "计算机科学".equals(student.getMajor()))
        //         .map(People::getName).collect(Collectors.toList());
        // System.out.println(names);

        // List<String> whuStudents = peoples.stream()
        //         .map(str -> str.getName())// 映射成为Stream<String[]>
        //         .collect(Collectors.toList());
        // System.out.println("name" + whuStudents);

        // List list=  Stream.of("one", "two", "three", "four")
        //           .filter(e -> e.length() > 3)
        //           .peek(e -> System.out.println("Filtered value: " + e))
        //           // .map(String::toUpperCase)
        //           // .peek(e -> System.out.println("Mapped value: " + e))
        //           .collect(Collectors.toList());
        //   System.out.println(list);

        //flatmap
        // List<Developer> team = new ArrayList<>();
        // Developer polyglot = new Developer("esoteric");
        // polyglot.add("clojure");
        // polyglot.add("scala");
        // polyglot.add("groovy");
        // polyglot.add("go");
        //
        // Developer busy = new Developer("pragmatic");
        // busy.add("java");
        // busy.add("javascript");
        //
        // team.add(polyglot);
        // team.add(busy);
        //
        // List<String> teamLanguages = team.stream().
        //         map(d -> d.getLanguages()).
        //         flatMap(a -> a.stream()).
        //         collect(Collectors.toList());
        // System.out.println(polyglot.getLanguages());
        // System.out.println(teamLanguages);

        // String[] one = {"大", "头", "是", "傻", "逼", "吗"};
        // String[] two = {"那", "必", "需", "不", "是", "啊"};
        // List<String[]> tesList = new ArrayList<>();
        // tesList.add(one);
        // tesList.add(two);
        // String test = tesList.stream()
        //         //.map(str -> tesList.toString().split(","))
        //         .filter(str -> !"不".equals(str))
        //         //.allMatch(str ->!"bu".equals (tesList.toString()))
        //         .flatMap(strings -> Arrays.stream(strings))
        //         .collect(Collectors.joining(","));
        //
        // System.out.println(test.toString());

        // Stream<Integer> integerStream = Stream.of(1, 2, 3, 5,3,3,3,3,3,3,3,3,3,3,3);
        // Stream.iterate(3, item -> item + 1).limit(10).forEach(System.out::println);


        // List<Integer> nums = Lists.newArrayList(1,1,null,2,3,4,null,5,6,7,8,9,10);
        // System.out.println("sum is:"+nums.stream().filter(num -> num != null).
        //         distinct().mapToInt(num -> num * 2).
        //         peek(System.out::println).skip(2).limit(4).sum());
// //获取日期时间
//         final Clock clock = Clock.systemUTC();
//
//         System.out.println(clock.instant());
//         System.out.println(clock.millis());
//         final Clock clock = Clock.systemUTC();
//         // Get the local date and local time
//         final LocalDate date = LocalDate.now();
//         final LocalDate dateFromClock = LocalDate.now(clock);
//         System.out.println(date);
//         System.out.println(dateFromClock);
// // Get the local date and local time
//         final LocalTime time = LocalTime.now();
//         final LocalTime timeFromClock = LocalTime.now(clock);
//         System.out.println(time);
//         System.out.println(timeFromClock);

        final Collection< Task > tasks = Arrays.asList(
        new Task( Status.OPEN, 5 ),
        new Task( Status.OPEN, 13 ),
        new Task( Status.CLOSED, 8 )
        );
        // Calculate total points of all active tasks using sum()
        final long totalPointsOfOpenTasks = tasks
                .stream()
                .filter( task -> task.getStatus() == Status.OPEN )
                .mapToInt( Task::getPoints)
                .sum();

        System.out.println( "Total points: " + totalPointsOfOpenTasks );

    }
}
