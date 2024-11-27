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
        String str5 = "E";

        List<String> list = new ArrayList<>(4); //<E> 제네릭은 프로그램이 시작될 때 타입이 결정된다. >> E type: String
        list.add(str1); //0
        list.add(str2); //1
        list.add(str3); //2
        list.add(str4); //3

        System.out.println(list); //[A, B, C, D]
        System.out.println(list.get(1)); //B
        //index로 삭제
        System.out.println(list.remove(1)); //B, 삭제되는 값을 return 해줌
        System.out.println(list); //값을 빼면서 뒷쪽의 값을 앞당겨준다.
        //data로 삭제 시도 (없으면 return false)
        System.out.println(list.remove(str3)); // type = boolean
        System.out.println(list.remove(str5));
        System.out.println(list);
    }
}
