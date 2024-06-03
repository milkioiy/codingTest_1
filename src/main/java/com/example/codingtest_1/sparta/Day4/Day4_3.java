package com.example.codingtest_1.sparta.Day4;

import java.io.*;
import java.util.StringTokenizer;

public class Day4_3 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());

        //첫번째 입력은 s, 두번째는 num
        String s = stringTokenizer.nextToken();
        int num = Integer.parseInt(stringTokenizer.nextToken());

        //s를 num 진법으로 해석하고 10진법 정수로 변환
        int tmp = Integer.parseInt(s, num);
        String result = Integer.toString(tmp);

        bw.write(result);

        br.close();
        bw.close();
    }
}
