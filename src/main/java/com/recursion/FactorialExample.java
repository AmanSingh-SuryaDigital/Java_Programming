package com.recursion;

import java.util.Scanner;

public class FactorialExample {
    int factorial_Number(int n){
        if(n==0){
            return 1;
        }
        return factorial_Number(n-1)*n;
    }

    public static void main(String[] args) {
        FactorialExample f = new FactorialExample();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the NUmber");
        int a = sc.nextInt();
        System.out.println(f.factorial_Number(a));
        sc.close();
    }
}
