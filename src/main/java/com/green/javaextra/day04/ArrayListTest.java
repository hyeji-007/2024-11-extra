package com.green.javaextra.day04;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
    /*
    배열의 단점을 보완한 것이 ArrayList라고 생각하면 된다.
    - 배열은 길이가 고정이다.
    - 몇번방(index)를 꼭 지정해주어야 한다. >> 실수할 가능성이 생긴다.
     */
    public static void main(String[] args) { //<type>가 빈칸이면 object가 들어간다.
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>(10); //10칸 짜리 배열을 만듦(근사치 설정 >> 효율성 up, 최초 크기가 10)
        list2.add(10); //넣을 때는 add
        list2.add(20);
        list2.add(30);
        list2.add(40);

        System.out.println(list2.get(3)); //뺄 때는 get(방 번호)
        //System.out.println(list2.get(4));
        System.out.println("size: " + list2.size());

        /*
        List<Integer> 일 때만 remove(int index)로만 삭제 가능하다.
        List<Integer>가 아닐때는 index와 data로도 삭제 가능하다.
         */

        System.out.println(list2.remove(2)); //<Integer>일 경우 방 번호로밖에 삭제 못함

    }
}
