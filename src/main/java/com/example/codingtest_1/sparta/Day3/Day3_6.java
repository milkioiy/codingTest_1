package com.example.codingtest_1.sparta.Day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Day3_6 {
    public static int[] arr;
    public static int N, M;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[M];


// 깊이 우선 탐색 시작
        dfs(1, 0);
        System.out.println(sb);
    }

    //현재까지의 깊이를 나타내는 변수 depth와 탐색할 수의 시작 위치를 나타내는 변수 at을 초기화
        public static void dfs(int at, int depth) {
// 현재 깊이가 M이면 수열 출력
            //종료 조건: 현재 깊이가 M이면, 즉 수열이 완성되었으면, 수열의 값을 StringBuilder에 추가하고 줄 바꿈
            if (depth == M) {
                for (int val : arr) {
                    sb.append(val).append(' ');
                }
                sb.append('\n');
                return;
            }
// at부터 N까지 수를 확인하며 백트래킹, 재귀 호출:
            for (int i = at; i <= N; i++) {

                arr[depth] = i;
                dfs(i + 1, depth + 1);
                //at부터 N까지의 수 중에서 하나를 선택하여 수열에 넣습니다.
                // 이때, 선택한 수를 arr 배열에 저장하고, 깊이를 증가시켜 다음 위치를 탐색


            }
        }
    }

    // 1부터 N까지의 자연수 중에서 중복 없이 M개를 고른 오름차순 수열을 깊이 우선 탐색(DFS) 방식으로 구하여 출력
