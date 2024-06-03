package com.example.codingtest_1.sparta.Day4;

import java.io.*;

public class Day4_2 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        StringBuilder result = new StringBuilder();
        int i = 0;
        for (i = 0; i < s.length() / 10; i++){
            result.append(s.substring(10*i, 10*(i+1))).append("\n");
        }
        result.append(s.substring(10*i, s.length())).append("\n");

        bw.write(result.toString());

        br.close();
        bw.close();
    }

}
