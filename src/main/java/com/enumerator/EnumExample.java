package com.enumerator;

enum Day{
    Monday, Tuesday,Wednesday,Thrusday,Friday,Saturday,Sunday
}

public class EnumExample {
    public static void main(String[] args) {
       Day d= Day.Friday;
        System.out.println(d);

        Day d1 = Day.Wednesday;
        System.out.println(d1);
    }
}
