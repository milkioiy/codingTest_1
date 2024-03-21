package com.example.codingtest_1.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class greedy2 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // N, M, K를 공백을 기준으로 구분하여 입력 받기
            int n = sc.nextInt(); // 배열의 크기
            int m = sc.nextInt(); // 더하는 횟수
            int k = sc.nextInt(); // 연속해서 같은 수를 더할 수 있는 최대 횟수

            // N개의 수를 공백을 기준으로 구분하여 입력 받기
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt(); // 배열에 수 입력
            }

            Arrays.sort(arr); // 입력 받은 수들 정렬하기
            int first = arr[n - 1]; // 가장 큰 수
            int second = arr[n - 2]; // 두 번째로 큰 수

            // 가장 큰 수가 더해지는 횟수 계산
            int cnt = (m / (k + 1)) * k; // 가장 큰 수가 등장하는 횟수
            cnt += m % (k + 1); // 만약 나머지가 있으면 그만큼 더하기

            int result = 0; // 결과값 초기화
            result += cnt * first; // 가장 큰 수 더하기
            result += (m - cnt) * second; // 두 번째로 큰 수 더하기

            System.out.println(result);
        }
    }


