package com.shubh.practice.interview;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

class Data {

    int x;

    public Data(int x) {

        synchronized (this) {

        }
        this.x = x;
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("Data equals method");
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Data other = (Data) obj;
        if (x != other.x)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x);
    }

    @Override
    public String toString() {
        return "Data{" +
                "x=" + x +
                '}';
    }
}

public class RemoveDuplicateEmployee {

    public static void main(String[] args) {

        List<Data> dataList = new ArrayList<>();

        dataList.add(new Data(10));
        dataList.add(new Data(20));
        dataList.add(new Data(10));
        dataList.add(new Data(20));

/*        employeeList.stream()
                .collect(
                        Collectors.collectingAndThen
                                (Collectors.toCollection
                                        (() -> new TreeSet<>
                                                (Comparator.comparing(Person::getName))), ArrayList::new));*/

        Set<Data> collect = dataList.stream()
                .collect(Collectors.toSet());
        System.out.println(collect);


    }
}
