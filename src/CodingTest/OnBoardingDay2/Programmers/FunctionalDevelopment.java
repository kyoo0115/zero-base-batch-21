package CodingTest.OnBoardingDay2.Programmers;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class FunctionalDevelopment {
    public static ArrayList<Integer> solution(int[] progresses, int[] speeds) {

        Queue<Integer> queue = new LinkedList<>();
        ArrayList<Integer> days = new ArrayList<>();

        for (int i = 0; i < progresses.length; i++) {
            int remainingProgress = 100 - progresses[i];
            int remainingDays = remainingProgress / speeds[i];

            if(remainingProgress % speeds[i] != 0) {
                remainingDays++;
            }
            queue.add(remainingDays);
        }

        while(!queue.isEmpty()) {
            int front_day = queue.peek();
            queue.poll();
            int count = 1;

            while(!queue.isEmpty() && front_day >= queue.peek()) {
                count++;
                queue.poll();
            }

            days.add(count);
        }
        return days;
    }
}
