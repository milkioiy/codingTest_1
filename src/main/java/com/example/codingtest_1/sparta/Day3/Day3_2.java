package com.example.codingtest_1.sparta.Day3;

import java.io.*;

public class Day3_2 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long n = Long.parseLong(br.readLine());
        bw.write(String.valueOf(n * (n - 1) / 2));
        bw.newLine();
        bw.write("2");

        br.close();
        bw.close();

    }
}
