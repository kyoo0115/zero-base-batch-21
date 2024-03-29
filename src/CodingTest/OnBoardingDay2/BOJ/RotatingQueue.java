package CodingTest.OnBoardingDay2.BOJ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.StringTokenizer;

class RotatingQueue {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(reader.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int num = 0;
        LinkedList<Integer> q = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            q.add(i);
        }

        st = new StringTokenizer(reader.readLine());
        for (int i = 0; i < m; i++) {
            int target = Integer.parseInt(st.nextToken());
            int index = q.indexOf(target);

            int steps = index <= q.size() / 2 ? index : q.size() - index;

            num += steps;

            for (int j = 0; j < steps; j++) {
                if (index <= q.size() / 2) {
                    q.addLast(q.removeFirst());
                } else {
                    q.addFirst(q.removeLast());
                }
            }

            q.removeFirst();
        }

        writer.write(String.valueOf(num));
        reader.close();
        writer.flush();
        writer.close();
    }
}
