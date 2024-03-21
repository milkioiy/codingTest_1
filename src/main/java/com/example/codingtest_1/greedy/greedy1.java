package com.example.codingtest_1.greedy;

public class greedy1 {
    public static void main(String[] args){
        int n = 1260; //돈의 총액수
        int cnt = 0; // 동전의 최소개수를 저장하는 변수
        int[] coinTypes = {500, 100, 50, 10}; //동전의 종류 배열

        for (int i = 0; i < 4; i++){
            int coin = coinTypes[i]; //현재 순회 중인 동전의 액수
            cnt += n / coin; //거스름돈을 현재 동전으로 나눈 몫을 cnt에 더함 (최종 필요한 최소 동전의 개수)
            n %= coin; //현재 동전으로 거스름돈을 나눈 나머지를 다음 계산을 위해 n에 저장
        }

        System.out.println(cnt); // 최소 동전 개수 출력
        }
    }

