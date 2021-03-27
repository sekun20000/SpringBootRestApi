package com.taeyang;

import java.util.Arrays;
import java.util.Scanner;

public class  BasicGrammer {

    public static void main(String[] args) {
        //    사용자에게 9개의 숫자를 입력 받아서 33의이중 배열에 넣은 후 각 행의 덧셈 합을출력하시오.
        //    조건1) 출력 시 44의 형식으로 출력 (4행째는 덧셈 합)
        //    조건2)데이터 출력시 정렬된 형식으로 출력
        //    비고. 이중배열 사용법 int[][] arr = new int[4][4];
        //    비고. 데이터를 정렬된 형식으로 출력하는 방법을 찾아보시오.

        Scanner sc = new Scanner(System.in);
        
        int arr[][] = new int[4][4];

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr[i].length-1; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < arr.length; i++) {
            int cnt = 0;
            int cnt2 = 0;

            for (int j = 0; j < arr[i].length; j++) {

                cnt += arr[i][j];
                cnt2 += arr[j][i];

                if(j == arr[i].length-1) {
                    arr[i][j] = cnt;
                    arr[j][i] = cnt2;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}


