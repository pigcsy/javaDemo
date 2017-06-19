package com.guava;


import com.google.common.base.CharMatcher;
import com.google.common.base.Charsets;
import com.google.common.base.Joiner;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.base.Splitter;
import com.google.common.base.Strings;
import com.google.common.collect.ComparisonChain;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.junit.Assert;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Created by maven on 2017/2/9.
 */
public class FristDemo {
    /**
     * @return void 返回类型
     * @throws
     * @Title: testFunction
     * @Description: Fucntion<K,V>接口提供的apply是用来将对象K转换为对象V的
     */

    /**
     * @return void 返回类型
     * @throws
     * @Title: testJoiner
     * @Description: 利用某个分隔符将一组字符串分隔开来
     * <p>
     * 输出结果为：
     * 传统方法：loda,vigoss,merlini
     * 采用joiner:loda,vigoss,merlini
     */

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

    /**
     * @return void 返回类型
     * @throws
     * @Title: testMapJoiner
     * @Description: 将一个map型数据组合成一个由指定分隔符分开的key-value样式
     * <p>
     * 输出结果为：
     * <p>
     * 贝克汉姆:中场;罗纳尔多:前锋;布冯:门将;齐达内:中场
     */
    @Test
    public void testMapJoiner() {
        Map<String, String> map = Maps.newLinkedHashMap();
        String delimiter = ";";

        map.put("贝克汉姆", "中场");
        map.put("罗纳尔多", "前锋");
        map.put("布冯", "门将");
        map.put("齐达内", "中场");

        String returnString = Joiner.on(delimiter)// 创建了一个以delimiter作为分隔符的Joiner
                .withKeyValueSeparator(":")// 创建了一个以：作为键值间隔符的MapJoiner
                .join(map);// 将这个指定了MapJoiner样式的map连接成一个字符串

        System.out.print(returnString);

    }

    /**
     * @return void 返回类型
     * @throws
     * @Title: testSplitter
     * @Description: 将含有指定分隔符的字符串分开
     */
    @Test
    public void testSplitter() {
        String text = "英文|中文||韩文|法文|  xx   |";

        System.out.print(Arrays.toString(text.split("\\|")));

        System.out.print(Splitter.on("|")// 创建一个以"|"作为切分的Splitter
                .trimResults()// 对切分所有结果，去掉两边空格
                .split(text)// 将字符串text按照"|"切分开来
                .toString());
    }

    /**
     * @return void 返回类型
     * @throws
     * @Title: testMapSplitter
     * @Description:使用MapSplitter可以将按照键值对规则组合起来的字符串，拆分成一个一个map中的键值对 输出结果为：
     * key为贝克汉姆,value为中场
     * key为罗纳尔多,value为前锋
     * key为布冯,value为门将
     * key为齐达内,value为中场
     */
    @Test
    public void testMapSplitter() {
        String text = "贝克汉姆:中场;罗纳尔多:前锋;布冯:门将;齐达内:中场";

        String delimiter = ";";

        Map<String, String> map = Splitter.on(delimiter)
                .withKeyValueSeparator(":").split(text);

        for (Map.Entry<String, String> e : map.entrySet()) {
            System.out.print("key为{},value为{}" + e.getKey() + e.getValue());
        }
    }

    /**
     * @return void 返回类型
     * @throws
     * @Title: testCharsets
     * @Description: 字符集处理
     */
    @SuppressWarnings("unused")
    @Test
    public void testCharsets() {
        String text = "编码问题";

        // 获取该字符串指定编码字符集的时候，如果传递参数为string类型，则需要强行捕捉异常，因为这个spring类型可能填写错误
        try {
            byte[] b = text.getBytes("utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        // 但是使用Charset类型作为参数却没有问题，所以guava帮我们封装了几种常用的编码，并以Charset类型返回，让我们直接当做参数传递进去
        // 这里无需捕捉任何异常情况，因为使用了guava封装的字符集，根本不可能报错
        byte[] bt = text.getBytes(Charsets.UTF_8);

    }

    /**
     * @return void 返回类型
     * @throws
     * @Title: testStrings
     * @Description: 给指定的字符串后添加字符
     */
    @Test
    public void testStrings() {
        StringBuilder text = new StringBuilder("helloworld");
        char c = 'x';

        for (int i = 0; i < 3; i++) {
            text.append(c);
        }

        Assert.assertEquals(text.toString(), "helloworldxxx");

        // 给字符串helloworld后面不断添加'x'字符，直到整个字符串长度达到了13。如果该长度没有helloworld长度大，则直接返回helloworld
        String result = Strings.padEnd("helloworld", 13, c);

        Assert.assertEquals(result, "helloworldxxx");

        // 如果是null，则转成""空字符串；否则返回原始字符串。这是一个推荐使用的函数
        Assert.assertEquals(Strings.nullToEmpty(null), "");

        // 如果字符串是""空字符串，则直接返回null
        Assert.assertNull(Strings.emptyToNull(""));

        // 如果字符串是""空串，或者是null，则返回true
        Assert.assertTrue(Strings.isNullOrEmpty("")
                && Strings.isNullOrEmpty(null));
    }

    @Test
    public void testCharMatcher() {
        String text = "My name is    loda,  I'm a IT guy!";

        // 将多个空格合并为一个空格
        String after = CharMatcher.WHITESPACE.collapseFrom(text, ' ');

        Assert.assertEquals(after, "My name is loda, I'm a IT guy!");

        String charWithNumber = "12xabd34";

        Assert.assertEquals(CharMatcher.JAVA_DIGIT.retainFrom(charWithNumber), "1234");
    }

    @Test
    public void testPreconditions() {
        int a = 10;
        Preconditions.checkArgument(a > 10, "参数必须大于10");
        Preconditions.checkNotNull(null, "不能为空");

    }

    @Test
    public void testMoreObjects() {
        Student s = new Student(1, null, "male", 13);

        // 利用guava的toString格式化对象
        Assert.assertEquals(s.toString(), "Student{id=1, sex=male, age=13}");

        // 查找第一个不为空的元素，如果都是null，则抛出空指针异常
        Assert.assertEquals(MoreObjects.firstNonNull(null, "jack"), "jack");

        Student s1 = new Student(1, "jack", "female", 13);
        Student s2 = new Student(1, "jack", "male", 14);
        Assert.assertTrue("检查s1是否小于s2", s1.compareTo(s2) < 0);
    }

    private class Student implements Comparable<Student> {
        private int id;
        private String name;
        private String sex;
        private int age;

        public Student(int id, String name, String sex, int age) {
            super();
            this.id = id;
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        @Override
        public String toString() {
            return MoreObjects.toStringHelper(this)// 创建ToStringHelper对象
                    .omitNullValues()// 忽略空值
                    .add("id", id)// 将id添加入内
                    .add("name", name)// 将name添加入内
                    .add("sex", sex)// 将sex添加入内
                    .add("age", age)// 将age添加入内----guava采用链表连接所有属性
                    .toString();// 将ToStringHelper格式化为字符串内容
        }

        @Override
        public int compareTo(Student s) {
            // 如果需要对多个值进行进行比较，以完成排序过程，典型写法为:
            // return typicalCompare(s);

            // 使用了guava，你就可以这样写了
            return ComparisonChain.start().compare(this.id, s.id)// 将id加入比较器
                    .compare(this.name, s.name)// 将name加入比较器
                    .compare(this.sex, s.sex)// 将sex加入比较器
                    .compare(this.age, s.age)// 将age加入比较器
                    .result();// 得出比较结果
        }

        @SuppressWarnings("unused")
        public int typicalCompare(Student s) {
            int result = this.id - s.id;
            // 优先级从高到低，如果某个属性比较结果相等，则继续将后面的元素进行比较
            if (result != 0)
                return result;
            result = this.name.compareTo(s.name);

            if (result != 0)
                return result;

            result = this.sex.compareTo(s.sex);

            if (result != 0)
                return result;

            return this.age - s.age;
        }
    }

}

