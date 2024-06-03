package com.example.codingtest_1.sparta.Day3;

import java.io.*;

public class Day3_4 {
    public static void main(String[] args ) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        // 재귀 호출 대신 동적 프로그래밍을 사용하여 피보나치 수를 계산
        bw.write(fibonacci(n) + " " + (n - 2));

        bw.newLine();
        br.close();
        bw.close();
    }

    // 동적 프로그래밍을 이용하여 피보나치 수를 계산
    static int fibonacci(int N){
        int[] f = new int[N + 1];
        f[1] = f[2] = 1;
        for(int i = 3; i <= N; i++) { // 반복문을 통해 이전 값들을 이용하여 피보나치 수를 계산
            f[i] = f[i - 1] + f[i - 2];
        }
        return f[N]; // 계산된 피보나치 수
    }
}
