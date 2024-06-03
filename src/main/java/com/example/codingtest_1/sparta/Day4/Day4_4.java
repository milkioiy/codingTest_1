package com.example.codingtest_1.sparta.Day4;

import java.io.*;
import java.util.HashSet;

public class Day4_4 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        HashSet<String> set = new HashSet<>();

        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];
        char s = '0';
        char e = '0';

        for (int i = 0; i < n; i++){
            arr[i] = br.readLine();
            set.add(arr[i]);
        }

        for (int i =0; i < n; i++){
            if("?".equals(arr[i])){
                if(0 < i) s = arr[i - 1].charAt(arr[i-1].length()-1);
                if(i < n - 1) e = arr[i + 1].charAt(0);
            }
        }
        int m = Integer.parseInt(br.readLine());

        for(int i = 0; i < m; i++){
            String input = br.readLine();
            if (set.contains(input)) continue;
            if (s != '0' && input.charAt(0) != s) continue;
            if (e != '0' && input.charAt(input.length()-1) != e) continue;

            bw.write(input);

        }

        br.close();
        bw.close();
    }
}
