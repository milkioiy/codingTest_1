package com.example.codingtest_1.leets;

import java.util.Stack;
import java.util.HashMap;
import java.util.Map;

class ValidParentese {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) return false;

        Map<Character, Character> pairs = new HashMap<>();
        pairs.put('(', ')');
        pairs.put('[', ']');
        pairs.put('{', '}');

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (pairs.containsKey(c)) {
                stack.push(c);
            } else if (!stack.isEmpty() && pairs.get(stack.peek()) == c) {
                stack.pop();
            } else {
                return false;
            }
        }

        return stack.isEmpty();
    }
}
