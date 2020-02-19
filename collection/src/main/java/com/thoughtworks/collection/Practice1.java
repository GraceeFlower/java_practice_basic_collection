package com.thoughtworks.collection;

import java.util.Collection;
import java.util.HashSet;
import java.util.Random;

public class Practice1 {
    public static void main(String[] args) {
        System.out.println(randomNumber());
    }

    /**
     *  生成10个0到20的随机整数，要求不能重复
     */
    public static Collection<Integer> randomNumber() {
        Collection<Integer> numList = new HashSet<>();
        Random random = new Random();
        while (numList.size() < 10) {
            numList.add(random.nextInt(21));
        }
        return numList;
    }
}
