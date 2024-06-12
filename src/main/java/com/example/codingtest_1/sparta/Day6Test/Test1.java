package com.example.codingtest_1.sparta.Day6Test;

import java.io.*;

public class Test1 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n + 1];

        String[] switch1 = br.readLine().split(" ");
        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(switch1[i - 1]);
        }

        int cnt = Integer.parseInt(br.readLine());

        for (int i = 0; i < cnt; i++){
            String[] student = br.readLine().split(" ");
            int gender = Integer.parseInt(student[0]);
            int number = Integer.parseInt(student[1]);

            if (gender == 1){
                maleSwitch(arr, n , number);
            } else{
                femaleSwitch(arr, n , number);
            }
        }
        for (int i = 1; i <= n; i++){
            sb.append(arr[i]).append(" ");
            if (i % 20 == 0){
                sb.append("\n");
            }
        }
        bw.write(sb.toString());
        br.close();
        bw.close();
    }
    private static void maleSwitch(int[] arr, int n, int number){
        for (int j = number; j<= n; j+= number){
            arr[j] = arr[j] == 1 ? 0 : 1;
        }
    }

    private static void femaleSwitch(int[] arr, int n, int number){
        int left = number;
        int right = number;

        while (left > 0 && right <= n && arr[left] == arr[right]){
            left--;
            right++;
        }
        for (int j = left + 1; j < right; j++){
            arr[j] = arr[j] == 1? 0 : 1;
        }
    }
}
