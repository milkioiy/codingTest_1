package com.example.codingtest_1.sparta.Day5;

import java.io.*;

public class Day5_4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        char[][] arr = new char[n][n];

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            for (int j = 0; j < n; j++) {
                arr[i][j] = s.charAt(j);
            }
        }

        int a = 0;
        int b = 0;

        for (int i = 0; i < n; i++) {
            int cnt1 = 0;
            int cnt2 = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i][j] != 'X') {
                    cnt1++;
                } else {
                    if (cnt1 >= 2) {
                        a++;
                    }
                    cnt1 = 0;
                }

                if (arr[j][i] != 'X') {
                    cnt2++;
                } else {
                    if (cnt2 >= 2) {
                        b++;
                    }
                    cnt2 = 0;
                }
            }
            if (cnt1 >= 2) {
                a++;
            }
            if (cnt2 >= 2) {
                b++;
            }
        }

        sb.append(a).append(" ").append(b);
        bw.write(sb.toString());

        br.close();
        bw.close();
    }
}
