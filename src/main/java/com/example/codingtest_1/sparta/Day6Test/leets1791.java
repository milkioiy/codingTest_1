package com.example.codingtest_1.sparta.Day6Test;

public class leets1791 {
    public int findCenter(int[][] edges){
        // 첫 번째 간선의 두 노드
        int node1 = edges[0][0];
        int node2 = edges[0][1];

        // 두 번째 간선의 두 노드
        int node3 = edges[1][0];
        int node4 = edges[1][1];

        // 중심 노드는 첫 번째와 두 번째 간선에서 공통으로 등장하는 노드입니다.
        if (node1 == node3 || node1 == node4) {
            return node1;
        } else {
            return node2;
        }
    }
}
