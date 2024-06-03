package com.example.codingtest_1.sparta.Day4;

import java.io.*;

public class Day4_1 {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = bf.readLine();
        StringBuilder result = new StringBuilder();
        result.append(s.charAt(0));

        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i) == '-'){
                result.append(s.charAt(i + 1));
            }
        }
        bw.write(result.toString());

        bf.close();
        bw.close();
    }
}
