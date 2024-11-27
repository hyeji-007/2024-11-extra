package com.green.javaextra.day04;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class ArrayListTest2 {

    public static void main(String[] args) {
        String str1 = "A";
        String str2 = "B";
        String str3 = "C";
        String str4 = "D";

        List<String> list = new ArrayList<>(4);
        list.add(str1);
        list.add(str2);
        list.add(str3);
        list.add(str4);

        System.out.println(list);
    }
}
