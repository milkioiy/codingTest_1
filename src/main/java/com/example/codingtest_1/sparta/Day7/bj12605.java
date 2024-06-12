package com.example.codingtest_1.sparta.Day7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj12605 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++){
            String str = br.readLine();
            String[] strArr = str.split("");

            sb.append("Case #").append(i+1).append(": ");
            for (int j = strArr.length - 1; j >= 0; j--){
                sb.append(strArr[j]);
                if (j > 0) {
                    sb.append(" ");
                }
            }
            System.out.println(sb.toString());
        }
    }
}
