package com.example.codingtest_1.greedy;
import java.util.*;

public class greedy4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // N, K를 공백을 기준으로 구분하여 입력 받기
        int n = sc.nextInt(); // 초기 수
        int k = sc.nextInt(); // 나눌 수
        int result = 0; // 결과값 초기화

        while (true) {
            // N이 K로 나누어 떨어지는 수가 될 때까지만 1씩 빼기
            int target = (n / k) * k; // 현재 수를 K로 나누었을 때 가장 가까운 K의 배수
            result += (n - target); // 현재 수에서 가장 가까운 K의 배수를 빼는 횟수를 결과값에 더함
            n = target; // 현재 수를 K의 배수로 업데이트
            // N이 K보다 작을 때 (더 이상 나눌 수 없을 때) 반복문 탈출
            if (n < k) break;
            // K로 나누기
            result += 1; // K로 나눈 횟수를 결과값에 더함
            n /= k; // 현재 수를 K로 나눈 몫으로 업데이트
        }

        // 마지막으로 남은 수에 대하여 1씩 빼기
        result += (n - 1); // 남은 수에서 1을 빼는 횟수를 결과값에 더함
        System.out.println(result); // 결과값 출력
    }
}
