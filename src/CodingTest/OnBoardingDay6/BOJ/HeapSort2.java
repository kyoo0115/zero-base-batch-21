package CodingTest.OnBoardingDay6.BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class HeapSort2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Input format correction
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] A = new int[N + 1];

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        heapSort(A, N, K);

        // Output format correction
        for (int i = 1; i <= N; i++) {
            System.out.print(A[i] + " ");
        }
    }

    public static void heapSort(int[] A, int N, int K) {
        buildMinHeap(A, N);

        for (int i = N; i >= 2; i--) {
            if (K > 0) {
                swap(A, 1, i);
                heapify(A, 1, i - 1);
                K--;
            } else {
                break;
            }
        }
    }

    public static void buildMinHeap(int[] A, int N) {
        for (int i = N / 2; i >= 1; i--) {
            heapify(A, i, N);
        }
    }

    public static void heapify(int[] A, int k, int N) {
        int left = 2 * k;
        int right = 2 * k + 1;
        int smaller;

        if (right <= N) {
            if (A[left] < A[right]) {
                smaller = left;
            } else {
                smaller = right;
            }
        } else if (left <= N) {
            smaller = left;
        } else {
            return;
        }

        if (A[smaller] < A[k]) {
            swap(A, k, smaller);
            heapify(A, smaller, N);
        }
    }

    public static void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
}
