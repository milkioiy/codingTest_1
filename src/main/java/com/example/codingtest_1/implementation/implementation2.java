package com.example.codingtest_1.implementation;

import java.util.Scanner;

public class implementation2 {
    // 특정한 시각 안에 '3'이 포함되어 있는지의 여부를 확인하는 함수
    public static boolean check(int h, int m, int s) {
        // 시간, 분, 초 각각의 수가 '3'을 포함하는지 확인
        if (h % 10 == 3 || m / 10 == 3 || m % 10 == 3 || s / 10 == 3 || s % 10 == 3)
            return true; // '3'을 포함하면 true 반환
        return false; // 그렇지 않으면 false 반환
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 시간을 입력받음
        int h = sc.nextInt();
        int cnt = 0; // 특정한 시간 안에 '3'이 포함된 횟수를 세는 변수

        // 0부터 입력받은 시간까지 시, 분, 초를 모두 확인하여 '3'이 포함되어 있는지 검사
        for (int i = 0; i <= h; i++) {
            for (int j = 0; j < 60; j++) {
                for (int k = 0; k < 60; k++) {
                    // 매 시각 안에 '3'이 포함되어 있다면 카운트 증가
                    if (check(i, j, k)) cnt++;
                }
            }
        }

        // 특정한 시간까지의 모든 시각 중 '3'이 포함된 횟수 출력
        System.out.println(cnt);
    }
}
