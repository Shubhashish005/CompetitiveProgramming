package com.shubh.interview;

import java.util.Arrays;

public class CustomArrayList {

    int couter = 0;
    private int size;
    double threshold = Math.ceil(size / 2);
    private Object[] arr;
    private Object[] newArr;

    public CustomArrayList(int size) {
        this.size = size;
        arr = new Object[size];
    }

    public static void main(String[] args) {

        CustomArrayList customArrayList = new CustomArrayList(2);

        customArrayList.add(1);
        customArrayList.add(1);
        customArrayList.add(1);
/*        customArrayList.add(1);
        customArrayList.add(1);
        customArrayList.add(1);*/

        System.out.println(customArrayList);

    }

    private void add(Object object) {
        if (couter <= threshold) {
            arr[couter] = object;
        } else {
            newArr = Arrays.copyOf(arr, size * 2);
            newArr[couter] = object;

            arr = newArr;
        }

        couter++;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            stringBuilder.append(arr[i] + " ");
        }

        return stringBuilder.toString();
    }
}
