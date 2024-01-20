package CodingTest.OnBoardingDay5.BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Node {
    int value;
    Node next;

    Node(int value) {
        this.value = value;
    }
}

public class Josephus {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);
        josephus(n, k);
    }

    public static void josephus(int N, int K) {
        Node head = new Node(1);
        Node prev = head;

        for (int i = 2; i <= N; i++) {
            prev.next = new Node(i);
            prev = prev.next;
        }

        prev.next = head;

        Node node = head;
        Node prevNode = prev;

        StringBuilder sb = new StringBuilder();
        sb.append("<");

        while (node != node.next) {
            for (int i = 1; i < K; i++) {
                prevNode = node;
                node = node.next;
            }

            sb.append(node.value);
            sb.append(", ");
            prevNode.next = node.next;
            node = node.next;
        }

        sb.append(node.value);
        sb.append(">");

        System.out.println(sb);
    }
}