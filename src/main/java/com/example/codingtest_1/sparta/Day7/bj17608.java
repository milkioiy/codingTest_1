package com.example.codingtest_1.sparta.Day7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class bj17608 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();
        int cnt = 1;

        for (int i = 0; i < N; i++){
            stack.add(Integer.parseInt(br.readLine()));
        }

        int stick = 0;
        while(!stack.isEmpty()){
            if (stick == 0) {
                stick = stack.pop();
            }else {
                int k = stack.pop();
                if (stick < k) {
                    cnt++;
                    stick = k;
                }
            }
        }
        System.out.println(cnt);
    }
}
