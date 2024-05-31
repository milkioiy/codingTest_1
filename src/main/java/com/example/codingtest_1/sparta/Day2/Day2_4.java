package com.example.codingtest_1.sparta.Day2;
import java.io.*;

public class Day2_4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[26];
        String s = br.readLine();

        for (int i = 0; i < s.length(); i++) {
            if ('a' <= s.charAt(i) && s.charAt(i) <= 'z') {
                arr[s.charAt(i) - 97]++; //소문자일 경우 해당 위치의 값을 증가
            } else {
                arr[s.charAt(i) - 65]++; //대문자일 경우
            }
        }
        int max = -1;
        char ch = '?';

        // 알파벳 빈도수 배열을 순회하며 가장 높은 빈도수와 그 알파벳을 찾음
        for (int i = 0; i < 26; i++) {
            if (arr[i] > max) {
                max = arr[i];
                ch = (char) (i + 65);
            } else if (arr[i] == max) {
                ch = '?'; // 최대 빈도수가 동일한 다른 알파벳이 있는 경우
            }
        }

        bw.write(ch);
        bw.flush();
        bw.close();
        br.close();
    }
}
