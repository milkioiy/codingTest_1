package com.example.codingtest_1.sparta.Day5;

import java.io.*;
import java.util.StringTokenizer;

public class Day5_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int max = 0;
        int x=1,y=1;
        int arr[][] = new int[9][9];

        for (int i = 0; i < 9; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 9; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }


        for (int i = 0; i < 9; i++){
            for (int j =0; j < 9; j++){
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    x = i + 1;
                    y = j + 1;
                }
            }
        }
        bw.write(max + "\n" + x + " " + y);

        br.close();
        bw.close();
    }
}
