package com.example.codingtest_1.sparta.Day1;

import java.util.Scanner;

public class Day1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int max = 0;
        int result = 0;

        if (n1 == n2 && n2 == n3) {
            result = (10000 + n1 * 1000);
        } else if (n1 == n2 || n1 == n3) {
            result = (1000 + n1 * 100);
        } else if (n2 == n3) {
            result = (1000 + n2 * 100);
        } else {
            if(n1>n2){
                if(n3>n1){
                    max = n3;
                }
                else{
                    max = n1;
                }
            }
            else if(n2>n1){
                if(n3>n2){
                    max = n3;
                }
                else{
                    max = n2;
                }
            }
            result = (max *100);
        }
        System.out.println(result);
    }
}
