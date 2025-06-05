package com.Iterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {
    public static void main(String[] args) {
        List al = Arrays.asList(1,2,3,"Four",5,"Six",7) ;

        Iterator it = al.iterator();

        while(it.hasNext()){
            Object ir =it.next();
            System.out.println(ir);
            //  it.remove();   // as it is Array which is fixed so it not allowed , as we should use ArrayLIst
        }

    }
}


