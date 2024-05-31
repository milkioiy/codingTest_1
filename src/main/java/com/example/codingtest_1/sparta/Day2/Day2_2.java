package com.example.codingtest_1.sparta.Day2;

import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Day2_2 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String fruit = st.nextToken(); // 과일의 종류
            int count = Integer.parseInt(st.nextToken()); // 과일의 개수
            if(map.containsKey(fruit)){ //map에 과일이 포함되어있으면
                map.put(fruit,map.get(fruit)+count);
            }else{ //map에 과일이 없으면
                map.put(fruit,count);
            }

        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        if(map.values().contains(5)) {
           bw.write("YES");
        }
        else {
            bw.write("NO");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
