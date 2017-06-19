package com.guava;

import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.List;
import java.util.Map;

/**
 * Created by maven on 2017/2/9.
 */
public class SecondDemo {
    @Test
    public void testJoiner() {
        List<String> list = Lists.newArrayList("maven", "com/guava", "", "merlini");

        String delimiter = ",";

        // 传统方法，采用stringbuilder
        System.out.println("传统方法:{}" + joinWithStringBuilder(list, delimiter));

        // 采用guava提供的Joiner类
        System.out.println("采用joiner:{}" + joinWithGuava(list, delimiter));
    }

    private String joinWithGuava(List<String> list, String delimiter) {
        return Joiner.on(delimiter)// 创建一个Joiner对象，将分隔符delimiter设为全局变量
                .skipNulls()// 创建一个新的Joiner对象，复写其appendTo方法，用来过滤list中的空值
                // .useForNull("nullText")// 使用nullText替换空字符串
                .join(list);// 将list中的内容一个个的与delimiter分隔符连接起来
    }

    private String joinWithStringBuilder(List<String> list, String delimiter) {
        StringBuilder sb = new StringBuilder();

        for (String s : list) {
            if (s != null) {
                sb.append(s).append(delimiter);
            }
        }
        // 将最后的delimiter去掉
        sb.setLength(sb.length() - delimiter.length());
        return sb.toString();
    }

    @Test
    public void common() {
        String testString = "Monday,Tuesday,Thursday,Friday,,";
        Iterable<String> parts = Splitter.on(",").split(testString);
        for (String s : parts)
            System.out.println(s);
    }

    /**
     * Splitter.trimResults 去掉结果集Iterable每个元素的首尾的空格
     */
    @Test
    public void trimResults() {
        //Just like the Joiner class,Splitter is immutable on creation,
        //so care must be taken to not call the trimResults method after
        //creating the original Splitter class
        Splitter splitter = Splitter.on("|").trimResults();
        Iterable<String> parts = splitter.split("1| 2 | 3 |||");
        for (String s : parts)
            System.out.print(s);
    }

    /**
     * 将指定格式的字符串分割成map
     */
    @Test
    public void testSplitToMap() {
        String testString = "Washington D.C=Redskins#New York City=Giants#Philadelphia=Eagles#Dallas=Cowboys";
        Splitter.MapSplitter mapSplitter = Splitter.on("#").withKeyValueSeparator("=");
        Map<String, String> testMap = mapSplitter.split(testString);
        for (String key : testMap.keySet())
            System.out.println(testMap.get(key));

    }
}

