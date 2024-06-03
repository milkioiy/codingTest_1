package com.example.codingtest_1.sparta.Day5;

import java.io.*;

public class Day5_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        char[][] arr = new char[5][15];
        int max = 0;

        for (int i =0; i < 5; i++){
            arr[i] = br.readLine().toCharArray();
            max = Math.max(max, arr[i].length);
        }

        for (int i =0; i < max; i++){
            for (int j = 0; j < 5; j++){
                if ( i < arr[j].length){
                    sb.append(arr[j][i]);
                }
            }
        }
        bw.write(sb.toString());

        br.close();
        bw.close();

    }
}
