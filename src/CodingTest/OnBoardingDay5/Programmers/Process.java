package CodingTest.OnBoardingDay5.Programmers;

import java.util.*;

class Pair {
    int priority;
    int index;

    public Pair(int priority, int index) {
        this.priority = priority;
        this.index = index;
    }
}

class Solution {

    public static int solution(int[] priorities, int location) {
        Queue<Pair> queue = new LinkedList<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < priorities.length; i++) {
            queue.offer(new Pair(priorities[i], i));
            maxHeap.offer(priorities[i]);
        }

        int count = 0;

        while (!queue.isEmpty()) {
            Pair current = queue.poll();
            if (current.priority == maxHeap.peek()) {
                maxHeap.poll();
                count++;
                if (current.index == location) {
                    break;
                }
            } else {
                queue.offer(current);
            }
        }

        return count;
    }
}
