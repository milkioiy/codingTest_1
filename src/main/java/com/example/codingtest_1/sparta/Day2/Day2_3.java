package com.example.codingtest_1.sparta.Day2;

import java.io.*;
import java.util.StringTokenizer;

public class Day2_3 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        StringTokenizer st = new StringTokenizer(s, " ");

        String a = st.nextToken();
        String b = st.nextToken();

        int num1 = Integer.parseInt(new StringBuilder(a).reverse().toString());
        int num2 = Integer.parseInt(new StringBuilder(b).reverse().toString());

        int result = Math.max(num1, num2);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(result));

        bw.flush();
        bw.close();
        br.close();
    }
}
