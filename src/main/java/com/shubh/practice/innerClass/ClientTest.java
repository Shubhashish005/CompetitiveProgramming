package com.shubh.practice.innerClass;

import com.shubh.practice.innerClass.nestedInnerClass.OuterClass;

public class ClientTest {

    public static void main(String[] args) {

        OuterClass.InnerClass innerClass = new OuterClass().new InnerClass();
        innerClass.invoke();
    }
}
