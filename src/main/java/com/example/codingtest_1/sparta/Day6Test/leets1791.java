package com.example.codingtest_1.sparta.Day6Test;

import java.util.HashSet;
import java.util.Set;

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

/*
public class leets1791 {
    public int findCenter(int[][] edges){
        // 해시셋을 사용하여 노드를 저장할 Set을 생성합니다.
        Set<Integer> set = new HashSet<>();

        // 각 간선을 순회합니다.
        for (int[] edge : edges){
            // 현재 간선의 첫 번째 노드가 이미 set에 있다면, 이는 중심 노드입니다.
            if (set.contains(edge[0]))
                return edge[0]; // 첫 번째 노드를 반환합니다.
            // 현재 간선의 두 번째 노드가 이미 set에 있다면, 이는 중심 노드입니다.
            else if (set.contains(edge[1]))
                return edge[1]; // 두 번째 노드를 반환합니다.

            // 첫 번째 노드와 두 번째 노드를 set에 추가합니다.
            set.add(edge[0]);
            set.add(edge[1]);
        }

        // 논리적으로 이 부분에 도달할 수 없습니다. (스타 그래프가 항상 유효하다고 가정하므로)
        return 0;
    }
}
 */