package com.example.codingtest_1.sparta.Day6Test;

import java.io.*;
import java.util.*;

public class Test2 {
    static int N = 19;
    static int[] dx = {0,1,1,1};
    static int[] dy = {1,0,1,-1};
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int N = 19;
        int[][] board = new int[N][N];
        boolean[][] visited = new boolean[N][N];



        for (int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++){
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        boolean win = false;
        for (int i = 0; i < N && !win; i++){
            for(int j = 0; j < N && !win; j++){
                if (board[i][j] != 0 && !visited[i][j]){
                    for (int dir = 0; dir < 4; dir++) {
                        if (checkFiveInARow(i, j, board, visited, board[i][j], dir, sb)) {
                            win = true; // 승부가 결정되면 루프 종료
                            break;
                        }
                    }
                }
            }
        }

        if (!win) {
            sb.append(0); // 승부가 결정되지 않으면 0 출력
        }

        bw.write(sb.toString());
        bw.flush();
        br.close();
        bw.close();
    }

    // 연속된 다섯 개의 바둑알을 확인하는 메소드
    static boolean checkFiveInARow(int x, int y, int[][] board, boolean[][] visited, int color, int dir, StringBuilder sb) {
        int count = 1; // 바둑알 개수 세기
        visited[x][y] = true; // 방문 표시
        List<Point> points = new ArrayList<>(); // 바둑알 위치를 저장할 리스트
        points.add(new Point(x, y));

        // 현재 방향과 반대 방향으로 바둑알 개수 세기
        count += searchDirection(x, y, board, visited, dir, color, points);
        count += searchDirection(x, y, board, visited, dir + 4, color, points);

        // 다섯 개의 바둑알이 연속으로 놓여있는 경우
        if (count == 5) {
            int nx = x - dx[dir];
            int ny = y - dy[dir];
            if (inBounds(nx, ny) && board[nx][ny] == color) {
                return false; // 여섯 개 이상 연속되면 false
            }

            // 바둑알 위치를 정렬하여 가장 왼쪽 위 바둑알을 찾음
            Collections.sort(points, Comparator.comparingInt(p -> p.y));
            if (points.get(0).y == points.get(points.size() - 1).y) {
                Collections.sort(points, Comparator.comparingInt(p -> p.x));
            }

            sb.append(color).append("\n");
            sb.append(points.get(0).x + 1).append(" ").append(points.get(0).y + 1); // 1-based 좌표 출력
            return true;
        }
        return false;
    }

    // 특정 방향으로 바둑알 개수를 세는 메소드
    static int searchDirection(int x, int y, int[][] board, boolean[][] visited, int dir, int color, List<Point> points) {
        int count = 0;
        int nx = x + dx[dir % 4];
        int ny = y + dy[dir % 4];

        // 방향으로 이동하면서 같은 색의 바둑알 개수 세기
        while (inBounds(nx, ny) && board[nx][ny] == color) {
            points.add(new Point(nx, ny)); // 바둑알 위치 저장
            visited[nx][ny] = true; // 방문 표시
            nx += dx[dir % 4];
            ny += dy[dir % 4];
            count++;
        }
        return count;
    }


    // 좌표가 바둑판 범위 내에 있는지 확인하는 메소드
    static boolean inBounds(int x, int y) {
        return x >= 0 && x < N && y >= 0 && y < N;
    }

    // 바둑알 위치를 저장할 클래스
    static class Point {
        int x, y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}