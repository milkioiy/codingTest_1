package com.example.codingtest_1.sparta.Day1;

import java.io.*;
import java.util.*;

public class Day1_5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int month = Integer.parseInt(st.nextToken());
        int day = Integer.parseInt(st.nextToken());

        String[] daysOfWeek = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int totalDays = 0;
        for (int i = 1; i < month; i++) {
            totalDays += daysInMonth[i];
        }
        totalDays += day - 1;

        String dayOfWeek = daysOfWeek[totalDays % 7];
        System.out.println(dayOfWeek);
    }
}

