package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class StreamExample2 {
    public static void main(String[] args) {

        List<String> name = Arrays.asList("Aman","Satish","Rahul","Raj","Aman");

        List<String> output = name.stream().map(s -> s.toUpperCase()).filter(s -> s.equals("AMAN")).collect(Collectors.toList());

        System.out.println(output);
    }
}
