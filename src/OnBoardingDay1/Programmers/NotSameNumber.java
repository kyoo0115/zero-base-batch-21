package OnBoardingDay1.Programmers;

import java.util.*;
// 프로그래머스 같은 숫자는 싫어
// https://school.programmers.co.kr/learn/courses/30/lessons/12906?language=java
// 시간 복잡도 = O(n)
// 공간 복잡도 = O(n)

public class NotSameNumber {
    public int[] solution(int []arr) {
        int[] answer;

        Stack<Integer> stack = new Stack<>();

        for (int j : arr) {
            if (!stack.isEmpty() && stack.peek() == j) {
                stack.pop();
            }
            stack.add(j);
        }
        answer = new int[stack.size()];
        for (int i = 0; i < stack.size(); i++) {
            answer[i] = stack.get(i);
        }
        return answer;
    }
}
