package com.example.codingtest_1.sparta.Day2;

import java.io.*;
import java.util.*;

public class Day2_1 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        StringTokenizer st = new StringTokenizer(s, " ");
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write(String.valueOf(st.countTokens()));
        bw.flush();
        bw.close();
        br.close();
    }
}
