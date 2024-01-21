package CodingTest.OnBoardingDay6.Programmers;

import java.util.*;

public class DiskController {

    static class Job implements Comparable<Job> {
        int requestTime;
        int processingTime;

        public Job(int requestTime, int processingTime) {
            this.requestTime = requestTime;
            this.processingTime = processingTime;
        }

        @Override
        public int compareTo(Job other) {
            return this.processingTime - other.processingTime;
        }
    }

    public static int solution(int[][] jobs) {
        int answer = 0;
        int currentTime = 0;
        int jobIndex = 0;

        Arrays.sort(jobs, Comparator.comparingInt(a -> a[0]));
        PriorityQueue<Job> minHeap = new PriorityQueue<>();

        while (jobIndex < jobs.length || !minHeap.isEmpty()) {
            while (jobIndex < jobs.length && jobs[jobIndex][0] <= currentTime) {
                minHeap.offer(new Job(jobs[jobIndex][0], jobs[jobIndex][1]));
                jobIndex++;
            }

            if (!minHeap.isEmpty()) {
                Job currentJob = minHeap.poll();
                answer += currentTime - currentJob.requestTime + currentJob.processingTime;
                currentTime += currentJob.processingTime;
            } else {
                currentTime = jobs[jobIndex][0];
            }
        }

        return answer / jobs.length;
    }
}
