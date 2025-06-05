package com.Generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericExample {
    public static void main(String[] args) {

        List<String> company = Arrays.asList("Google","Amazon","Facebook","Netflix","Hotstar");

        ArrayList<String> arraylist = new ArrayList<>();
        arraylist.add("Google");
        arraylist.add("Amazon");
        arraylist.add("Hotstar");
        arraylist.add("Facebook");
        arraylist.add("Netflix");

        for(String s: arraylist){
            System.out.println(s);
        }


    }
}
