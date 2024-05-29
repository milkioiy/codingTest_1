package com.example.codingtest_1.sparta.Day1;

import java.util.Scanner;

public class Day1_3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //문자열 몇개?

        for (int i = 0; i < N; i++){
            int M = sc.nextInt(); //각 문자 몇 번 반복?
            String s = sc.next(); //문자열 입력받기

            for(int j = 0;j < s.length();j++){ //문자열의 길이만큼 반복
                for(int k = 0; k < M; k++){
                    System.out.print(s.charAt(j)); //각 문자열마다 m번씩 반복해서 축력
                }
            }
            System.out.println();

        }
    }
}

