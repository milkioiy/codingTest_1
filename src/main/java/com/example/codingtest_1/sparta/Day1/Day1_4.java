package com.example.codingtest_1.sparta.Day1;

import java.util.Scanner;

public class Day1_4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i = 1; i <= N; i++){
            for(int j = 0; j < i; j++){
                System.out.print("*");
            }
            for(int k = 0; k < 2*(N-i); k++){ // 8(2*4), 6(2*3)..과 같은 형식으로 줄어듦
                System.out.print(" ");
            }
            for(int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = N-1; i>=1; i--){
            for(int j = 0; j < i; j++){
                System.out.print("*");
            }
            for(int k = 0; k < 2*(N-i); k++){
                System.out.print(" ");
            }
            for(int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
