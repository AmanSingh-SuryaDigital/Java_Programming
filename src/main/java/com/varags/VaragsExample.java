package com.varags;

public class VaragsExample {
    int summisation(int ... n){
        int sum=0;
        for(int i=0; i<n.length; i++){
            sum+=n[i];
        }
        return sum;
    }

    public static void main(String[] args) {

        VaragsExample main = new VaragsExample();
        int output=    main.summisation(12,3,45,3,213,23,3,45,23,3,4,42,24,3);
        System.out.println(output);
    }
}
