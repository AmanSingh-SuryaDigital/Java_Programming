package com.Generic;

import java.util.Arrays;
import java.util.List;

public class GenericExample2 {
    public static void main(String[] args) {

        GenricFunctionalInterfaceExample<String> gn = (s)->{
            System.out.println(s);
        };
        gn.create("Aman");


        GenricFunctionalInterfaceExample<Integer> gnnum = (s)->{
            System.out.println(s);
        };

        List<Integer> num = Arrays.asList(1,2,3,4,5,5,6);

        for(Integer n: num){
            gnnum.create(n);
        }


    }}


