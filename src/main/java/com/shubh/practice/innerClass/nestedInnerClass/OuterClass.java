package com.shubh.practice.innerClass.nestedInnerClass;

public class OuterClass {

    private int outerData = 1000;

    private void display() {
        System.out.println("OuterClass display method");
        InnerClass innerClass = new InnerClass();
        System.out.println("InnerData >> " + innerClass.innerData);
    }

    public class InnerClass {
        private int innerData = 1000;

        public void invoke() {
            System.out.println("InnerClass Invoke Method");
            display();
        }

        private void display() {
            System.out.println("InnerClass display method");
            System.out.println("InnerData >> " + innerData);
        }
    }
}
