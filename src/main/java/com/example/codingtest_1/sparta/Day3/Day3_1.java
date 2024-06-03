package com.example.codingtest_1.sparta.Day3;

import java.io.*;

public class Day3_1 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write(br.readLine());
        bw.newLine(); // 한 줄을 비우기 위해 새 줄을 추가
        bw.write("1");

        br.close();
        bw.close();
    }
}
