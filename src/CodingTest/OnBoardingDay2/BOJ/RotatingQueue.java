package CodingTest.OnBoardingDay2.BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class RotatingQueue {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] positions = new int[M];
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < M; i++) {
            positions[i] = Integer.parseInt(st.nextToken());
        }

        int result = minOperations(N, M, positions);
        System.out.println(result);

        br.close();
    }

    public static int minOperations(int N, int M, int[] positions) {
        Deque<Integer> q = new ArrayDeque<>();

        for(int i = 1; i <= N; i++) { //큐에 N 만큼 데이터 삽입
            q.add(i);
        }

        int count = 0;

        for(int pos : positions) {
            int index = 0;

            for(int num : q) {
                if(num == pos) {
                    break;
                }
                index++;
            }
            int left = index;
            int right = q.size() - index;

            if(left <= right) {
                rotateLeft(q, left);
                count += left;
            } else {
                rotateRight(q, right);
                count += right;
            }
            q.pollFirst();
        }
        return count;
    }
    public static void rotateLeft (Deque<Integer> q, int k) {
        for (int i = 0; i < k; i++) {
            int first = q.pollFirst();
            q.addFirst(first);
        }
    }

    public static void rotateRight (Deque<Integer> q, int k) {
        for (int i = 0; i < k; i++) {
            int last = q.pollLast();
            q.addLast(last);
        }
    }
}
