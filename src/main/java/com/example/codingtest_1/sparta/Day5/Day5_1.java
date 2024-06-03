package com.example.codingtest_1.sparta.Day5;

import java.io.*;
import java.util.StringTokenizer;

public class Day5_1 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        // 첫 번째 줄에서 행과 열의 크기를 읽어온다
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] arr1 = new int[n][m];
        int[][] arr2 = new int[n][m];

        // 첫 번째 배열을 읽어온다
        for (int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < m; j++){
                arr1[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 두 번째 배열을 읽어온다
        for (int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < m; j++){
                arr2[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 두 배열을 더하고 결과를 StringBuilder에 추가한다
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                sb.append(arr1[i][j] + arr2[i][j]).append(" ");
            }
            sb.append("\n");
        }

        // 결과를 BufferedWriter를 이용해 출력한다
        bw.write(sb.toString());

        br.close();
        bw.close();
    }
}
