package com.shubh.interview.impetus;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Student {

    private int id;
    private String city;

    public Student(int id, String city) {
        this.id = id;
        this.city = city;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}


public class ImpetusArrayQuestions {

    //Solution 8
    private static Map<Integer, Long> oddNumbersAndTheirFrequency(List<Integer> integerList) {
        return integerList.stream()
                .filter(integer -> integer % 2 != 0)
                .collect(Collectors.groupingBy(integer -> integer, Collectors.counting()));

    }

    //Solution 1
    private static List<String> removeValueFromList(List<String> stringList, String valueToRemove) {
        return stringList
                .stream()
                .filter(s -> !s.equals(valueToRemove))
                .collect(Collectors.toList());

    }

    //Solution 2
    private static int maximumValue(List<Integer> numberList) {
        return numberList.stream()
                .max(Comparator.comparing(Integer::intValue))
                .get();
    }

    //Solution 7
    private static int[] reverseIntegerArray(int[] numberList) {
        for (int i = 0; i < numberList.length / 2; i++) {
            int temp = numberList[i];
            numberList[i] = numberList[numberList.length - i - 1];
            numberList[numberList.length - i - 1] = temp;
        }

        return numberList;
    }

    //Solution 6
    private static int findSecondLargestNumberInTheArray(int array[]) {

        /*int largest = -1;
        int secondLargest = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > largest) {
                secondLargest = largest;
                largest = array[i];
            }
            else if (array[i] > secondLargest){
                secondLargest = array[i];
            }
        }

        return secondLargest;*/

        List<Integer> integers = Arrays.asList(10, 1, 17, 5, 6, 3);

        return integers.stream().sorted(Comparator.reverseOrder()).limit(2).skip(1).findFirst().get();
    }

    //Solution 3
    private static long numberofStudentRecordUpdated(List<Student> studentList) {
        return studentList.stream()
                .filter(student -> student.getCity().equals("Mumbai"))
                .peek(student -> student.setCity("Delhi"))
                .count();
    }

    public static void main(String[] args) {

        System.out.println(maximumValue(List.of(3, 9, 4, 5, 1, 7)));

        System.out.println("---------------");
        System.out.println(removeValueFromList(List.of("apple", "banana", "guava"), "banana"));

        System.out.println("---------------");
        System.out.println(oddNumbersAndTheirFrequency(List.of(3, 9, 9, 4, 5, 5, 1, 7, 2)));

        System.out.println("---------------");
        System.out.println(Arrays.toString(reverseIntegerArray(new int[]{3, 9, 4, 5, 1, 7})));


        System.out.println("---------------");
        System.out.println(findSecondLargestNumberInTheArray(new int[]{3, 9, 4, 5, 1, 7}));

        System.out.println("---------------");
        System.out.println(numberofStudentRecordUpdated(List.of(new Student(1, "Mumbai"), new Student(2, "Nagpur"), new Student(3, "Mumbai"))));
    }

    //Solution 5
    private List<Integer> removeDuplicateFromList(List<Integer> list) {
        return list.stream().distinct().collect(Collectors.toList());
    }

}
