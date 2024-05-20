package com.example.codingtest_1.programmers;

import java.util.HashSet;

public class Poketmon {
    public int solution(int[] nums) {
        // 주어진 포켓몬 리스트의 길이를 기반으로 최대 선택 가능한 포켓몬 수를 계산합니다.
        int max = nums.length / 2;

        // 중복된 타입의 포켓몬을 제거하기 위해 HashSet을 사용합니다.
        HashSet<Integer> hashSet = new HashSet<>();

        // 주어진 포켓몬 리스트를 순회하면서 HashSet에 포켓몬의 타입 번호를 추가합니다.
        for (int n : nums) {
            hashSet.add(n); // 중복된 타입은 HashSet에 추가되지 않습니다 (중복 제거).
        }

        int poketmon_nums = hashSet.size();

        // 만약 최대 선택 가능한 포켓몬 수가 현재 타입의 수보다 크거나 같다면,
        // 최대로 선택할 수 있는 타입의 수는 HashSet의 크기와 동일합니다.
        if (max >= poketmon_nums) {
            return poketmon_nums;
        } else { // 그렇지 않다면, 최대로 선택할 수 있는 타입의 수는 최대 포켓몬 수입니다.
            return max;
        }
    }
}