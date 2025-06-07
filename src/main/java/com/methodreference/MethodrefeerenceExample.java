package com.methodreference;

import java.util.Arrays;
import java.util.List;

public class MethodrefeerenceExample {
    public static void main(String[] args) {
        List<String> name = Arrays.asList("AMAN","Aman", "aman singh","aman singh rajawat");

        name.forEach(System.out::println);
    }
}
