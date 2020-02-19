package com.thoughtworks.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Practice2 {

    public static void main(String[] args) {
        //分别用for循环、增强for循环、迭代器遍历并打印getNumbers返回的List
        List<Integer> numList = getNumbers(100);
        for(int i = 0; i < numList.size(); i++) {
            System.out.println(numList.get(i));
        }

        System.out.println("=========");

        for(Integer i: numList) {
            System.out.println(i);
        }

        System.out.println("=========");

        Iterator<Integer> numIterator = numList.iterator();
        while (numIterator.hasNext()) {
            System.out.println(numIterator.next());
        }
    }

    /**
     * 创建一个List 然后在List中添加0到100整数
     */
    public static List<Integer> getNumbers(int num) {
        List<Integer> numList = new ArrayList<>();
        for (int i = 0; i <= num; i++) {
            numList.add(i);
        }
        return numList;
    }


}
