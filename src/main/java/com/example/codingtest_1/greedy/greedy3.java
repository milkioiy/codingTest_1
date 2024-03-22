package com.example.codingtest_1.greedy;
import java.util.*;

public class greedy3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // N, M을 공백을 기준으로 구분하여 입력 받기
        int n = sc.nextInt(); // 이차원 배열의 행 수
        int m = sc.nextInt(); // 이차원 배열의 열 수
        int result = 0; // 최종 결과값 초기화

        // 한 줄씩 입력 받아 확인하기
        for (int i = 0; i < n; i++) {
            // 현재 줄에서 '가장 작은 수' 찾기
            int min_value = 10001; // 최소값을 저장할 변수 초기화
            for (int j = 0; j < m; j++) {
                int x = sc.nextInt(); // 이차원 배열의 각 원소 입력 받기
                min_value = Math.min(min_value, x); // 현재 원소와 최소값 중 작은 값을 min_value에 저장
            }
            // '가장 작은 수'들 중에서 가장 큰 수 찾기
            result = Math.max(result, min_value); // 이전에 구한 결과값과 현재 행에서의 최소값 중 큰 값을 결과값에 저장
        }

        System.out.println(result); // 최종 답안 출력
    }
}
