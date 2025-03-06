package 백준.BFS_DFS;

import java.util.*;

public class DFS {

    static int N;

    static ArrayList<Edge>[] adj;
    static boolean[] visited;
    static int[] distance;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();

        for (int i = 0; i < N - 1; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i < N - 1; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();

            adj.get(A).add(new Edge(B, C));
            adj.get(B).add(new Edge(A, C));
        }

    }

    static void dfs(ArrayList<ArrayList<Edge>> adj) {

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < N - 1; i++) {

        }

    }
}

class Edge {

    int to;     // 연결된 정점
    int weight; // 길이

    Edge(int to, int weight) {
        this.to = to;
        this.weight = weight;
    }
}
