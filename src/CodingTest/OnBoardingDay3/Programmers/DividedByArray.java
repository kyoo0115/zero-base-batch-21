package CodingTest.OnBoardingDay3.Programmers;

import java.util.Arrays;

public class DividedByArray {
//    public static void main(String[] args) {
//        int[] array = new int[] {5,9,7,10};
//        System.out.println(Arrays.toString(solution(array, 5)));
//    }
    public static int[] solution(int[] arr, int divisor) {
        int[] answer;
        int count = 0;

        for (int j : arr) {
            if (j % divisor == 0) {
                count++;
            }
        }
        answer = new int[count];

        if(count == 0) {
            return new int[]{-1};
        }

        int answerIndex = 0;
        for (int i : arr) {
            if (i % divisor == 0) {
                answer[answerIndex++] = i;
            }
        }

        Arrays.sort(answer);
        return answer;
    }
}
