package com.shubh.practice.lambda;

import java.util.Arrays;
import java.util.List;

public class PredicateDemo {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5);
        list.stream().filter(integer -> integer % 2 ==0).forEach(integer -> System.out.println("Print >> " + integer));
    }
}
