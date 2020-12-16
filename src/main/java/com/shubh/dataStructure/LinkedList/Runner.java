package com.shubh.dataStructure.LinkedList;

public class Runner {

    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();
        System.out.println("------ Insert Data -----------");
        linkedList.insertData(20);
        linkedList.insertData(10);
        linkedList.insertData(50);
        linkedList.insertData(70);
        linkedList.showData();
        System.out.println("------ Insert Data printed -----------");
        System.out.println("------ Insert Data At Start -----------");
        linkedList.insertDataAtStart(25);
        linkedList.showData();
        System.out.println("------ Insert Data At Start printed -----------");
//        System.out.println("------ Insert Data At Index -----------");
//        linkedList.insertDataAtIndex(2, 22);
//        linkedList.showData();
//        System.out.println("------ Insert Data At Index Printed-----------");
        System.out.println("------ Delete Data -----------");
        linkedList.deleteData(50);
        linkedList.showData();
        System.out.println("------ Delete Data printed-----------");
    }
}
