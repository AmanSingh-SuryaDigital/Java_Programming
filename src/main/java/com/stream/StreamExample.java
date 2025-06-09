package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {

        List<Integer> al = Arrays.asList(12,33,34,2,121,11,2);

        List<Integer> stream = al.stream().map(s -> s * 3).filter(s -> s % 2 == 0).collect(Collectors.toList());

        System.out.println(stream);
    }
}
