package CodingTest.OnBoardingDay3.BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MinMaxInteger {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int[] arr = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int min = arr[0];
        int max = arr[0];

        for (int i = 0; i < n; i++) {
            if(min > arr[i]){
                min = arr[i];
            }

            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println(min + " " + max);
    }
}
