package com.green.javaextra.day04;

public class ArrayTest {

    /*
    배열(콜렉션) : 여러 데이터를 한 곳에 담는 것
                 마치 변수 선언을 여러개 한 것과 같은 효과가 난다.
     */

    public static void main(String[] args) {
        //정수값: 12, 16, 22를 변수에 저장을 한다
        int n1 = 12, n2 = 16, n3 = 22, n4 = 39, n5 = 46;

        System.out.printf("sum: %d\n", n1 + n2 + n3 + n4 + n5);
        System.out.println(n1 + n2 + n3 + n4 + n5);

        /*
        변수에 저장된 값을 콘솔에 출력하고 모든 값을 더한 sum값을 출력
        12
        16
        22
        39
        46
        sum: ??
         */

        System.out.println("------------------------------");

        int[] arr1 = new int[7]; //정수형 변수 5개 선언한 것과 같은 효과가 난다.
        arr1[0] = 12;
        arr1[1] = 16;
        arr1[2] = 22;
        arr1[3] = 39;
        arr1[4] = 46;
        arr1[5] = 55;
        arr1[6] = 66;

        int sum = 0;
        for (int result : arr1) {
            sum += result;
        }
        System.out.println(sum);

        System.out.println("------------------");

        int sum2 = 0;
        for (int i = 0; i < arr1.length; i++) {
            sum2 += arr1[i];
            System.out.println(arr1[i]);
        }
        System.out.printf("sum2 : %d\n", sum2);

        System.out.println("-----------------");


    }
}
