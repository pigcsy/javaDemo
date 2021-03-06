package com.sort;

/**
 * 冒泡排序：执行完一次内for循环后，最小的一个数放到了数组的最前面（跟那一个排序算法* 不一样）。相邻位置之间交换
 */

public class BubbleSortA {

    /**
     * 测试
     *
     * @param args
     */
    public static void main(String[] args) {
        Integer[] intgArr={49,65,38,97,76,13,27,49,78,34,12,64,1};
        BubbleSortA bubblesort = new BubbleSortA();
        bubblesort.bubble(intgArr, 0, intgArr.length - 1);
        for (Integer intObj : intgArr) {
            System.out.print(intObj.intValue() + " ");
        }
    }

    /**
     * 排序算法的实现，对数组中指定的元素进行排序
     *
     * @param array 待排序的数组
     * @param from  从哪里开始排序
     * @param end   排到哪里
     */
    public void bubble(Integer[] array, int from, int end) {
        //需array.length - 1轮比较
        for (int k = 1; k < end - from + 1; k++) {
            //每轮循环中从最后一个元素开始向前起泡，直到i=k止，即i等于轮次止
            for (int i = end - from; i >= k; i--) {
                //按照一种规则（后面元素不能小于前面元素）排序
                if ((array[i].compareTo(array[i - 1])) < 0) {
                    //如果后面元素小于了（当然是大于还是小于要看比较器实现了）前面的元素，则前后交换
                    swap(array, i, i - 1);
                }
            }
        }
    }

    /**
     * 交换数组中的两个元素的位置
     *
     * @param array 待交换的数组
     * @param i     第一个元素
     * @param j     第二个元素
     */
    public void swap(Integer[] array, int i, int j) {
        if (i != j) {//只有不是同一位置时才需交换
            Integer tmp = array[i];
            array[i] = array[j];
            array[j] = tmp;
        }
    }
}      