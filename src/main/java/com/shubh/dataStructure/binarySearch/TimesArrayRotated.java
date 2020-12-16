package com.shubh.dataStructure.binarySearch;

public class TimesArrayRotated {

    private static final int[] arr = {9, 10, 11, 12, 15, 18, 2, 5, 6, 8};

    private int numberOfRotations(int start, int end, int length) {

        while (start <= end) {

            if (arr[start] <= arr[end])
                return start;

            int mid = start + (end - start) / 2;
            int next = (mid + 1) % length;
            int previous = (mid - 1 + length) % length;

            if (arr[mid] <= arr[next] && arr[mid] <= arr[previous])
                return mid;
            else if (arr[mid] >= arr[start])
                start = mid + 1;
            else if (arr[mid] <= arr[end])
                end = mid - 1;
        }

        return -1;
    }

    public static void main(String[] args) {
        TimesArrayRotated timesArrayRotated = new TimesArrayRotated();
        int numberOfRotations = timesArrayRotated.numberOfRotations(0, arr.length - 1, arr.length);
        System.out.println("Number Of Rotations >> " + numberOfRotations);
    }
}
