package CodingTest.OnBoardingDay4.BOJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class HashHacking {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int a = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(br.readLine());
        long answer = 1L;

        for (int i = 0; i < n - 1; i++) {
            answer = (answer * m) % 1000000007;
        }

        System.out.println(answer);
    }
}