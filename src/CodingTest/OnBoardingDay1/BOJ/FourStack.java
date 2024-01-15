package CodingTest.OnBoardingDay1.BOJ;

import java.util.Scanner;
import java.util.Stack;

public class FourStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] permutation = new int[n];
        for (int i = 0; i < n; i++) {
            permutation[i] = scanner.nextInt();
        }

        System.out.println(cleanPermutation(n, permutation) ? "YES" : "NO");
    }

    private static boolean cleanPermutation(int n, int[] permutation) {
        Stack<Integer>[] stacks = new Stack[4];
        for (int i = 0; i < 4; i++) {
            stacks[i] = new Stack<>();
        }

        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            int current = permutation[i];
            int stackIndex = 0;

            // 현재 숫자보다 크거나 같은 스택을 찾음
            for (int j = 1; j < 4; j++) {
                if (!stacks[j].isEmpty() && stacks[j].peek() < stacks[stackIndex].peek()) {
                    stackIndex = j;
                }
            }

            // 스택에 삽입
            stacks[stackIndex].push(current);
        }

        // 스택에서 숫자를 꺼내어 배열에 저장
        int index = n - 1;
        for (int i = 0; i < 4; i++) {
            while (!stacks[i].isEmpty() && index >= 0) {
                result[index--] = stacks[i].pop();
            }
        }

        // 배열에 저장된 숫자가 오름차순인지 확인
        for (int i = 0; i < n - 1; i++) {
            if (result[i] > result[i + 1]) {
                return false;
            }
        }

        return true;
    }
}
