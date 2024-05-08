package com.example.codingtest_1.implementation;

import java.util.Scanner;

public class implementation3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 현재 나이트의 위치 입력받기
        String inputData = sc.nextLine();
        // 입력된 문자열을 파싱하여 행(row)과 열(column)의 위치를 구합니다.
        int row = inputData.charAt(1) - '0'; // 행 번호 (1부터 8까지)
        int column = inputData.charAt(0) - 'a' + 1; // 열 번호 (a부터 h까지)

        // 나이트가 이동할 수 있는 8가지 방향 정의
        int[] dx = {-2, -1, 1, 2, 2, 1, -1, -2}; // 행 이동
        int[] dy = {-1, -2, -2, -1, 1, 2, 2, 1}; // 열 이동

        // 8가지 방향에 대하여 각 위치로 이동이 가능한지 확인
        int result = 0; // 이동 가능한 경로의 개수를 저장할 변수
        for (int i = 0; i < 8; i++) {
            // 이동하고자 하는 위치 확인
            int nextRow = row + dx[i]; // 다음 행 위치
            int nextColumn = column + dy[i]; // 다음 열 위치
            // 해당 위치로 이동이 가능하다면 카운트 증가
            if (nextRow >= 1 && nextRow <= 8 && nextColumn >= 1 && nextColumn <= 8) {
                result += 1; // 이동 가능한 경로 카운트
            }
        }

        // 이동 가능한 경로의 개수를 출력
        System.out.println(result);
    }
}
