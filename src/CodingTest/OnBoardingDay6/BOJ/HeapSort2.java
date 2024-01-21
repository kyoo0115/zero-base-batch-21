package CodingTest.OnBoardingDay6.BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class HeapSort2 {
    private static final StringBuilder result = new StringBuilder();
    private static int swapCount = 0;
    private static int targetSwapCount;
    private static boolean targetSwapCountReached = false;

    public static void main(String[] args) throws IOException {
        int[] numbers = readInput();
        heapSort(numbers);
        System.out.println(targetSwapCountReached ? result : "-1");
    }

    private static int[] readInput() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = reader.readLine().split(" ");
        int num = Integer.parseInt(inputs[0]);
        targetSwapCount = Integer.parseInt(inputs[1]);
        int[] numbers = new int[num + 1];
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        for (int i = 1; i <= num; i++) {
            numbers[i] = Integer.parseInt(tokenizer.nextToken());
        }
        return numbers;
    }

    private static void heapSort(int[] numbers) {
        int n = numbers.length - 1;
        buildMinHeap(numbers, n);
        for (int i = n; i >= 2; i--) {
            swap(numbers, 1, i);
            heapify(numbers, 1, i - 1);
        }
    }

    private static void buildMinHeap(int[] numbers, int n) {
        for (int i = n / 2; i >= 1; i--) {
            heapify(numbers, i, n);
        }
    }

    private static void heapify(int[] numbers, int root, int n) {
        int left = 2 * root;
        int right = left + 1;
        int smallest;
        if (right <= n) {
            smallest = (numbers[left] < numbers[right]) ? left : right;
        } else if (left <= n) {
            smallest = left;
        } else {
            return;
        }
        if (numbers[smallest] < numbers[root]) {
            swap(numbers, root, smallest);
            heapify(numbers, smallest, n);
        }
    }

    private static void swap(int[] numbers, int i, int j) {
        swapCount++;
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
        if (swapCount == targetSwapCount) {
            targetSwapCountReached = true;
            for (int k = 1; k < numbers.length; k++) {
                result.append(numbers[k]).append(" ");
            }
        }
    }
}