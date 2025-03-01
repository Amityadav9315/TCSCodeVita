package TCS;

import java.util.*;
import java.io.*;

class CriticalPlanets {
    static ArrayList<Integer>[] adj;
    static int[] visited;
    static int[] in;
    static int[] low;
    static int timer;
    static Set<Integer> criticalPlanets;

    public static void dfs(int node, int parent) {
        visited[node] = 1;
        in[node] = low[node] = timer++;

        for (int neighbour : adj[node]) {
            if (neighbour == parent) continue;

            if (visited[neighbour] == 1) {
                low[node] = Math.min(low[node], in[neighbour]);
            } else {
                dfs(neighbour, node);

                if (low[neighbour] > in[node]) {
                    criticalPlanets.add(node);
                    criticalPlanets.add(neighbour);
                }

                low[node] = Math.min(low[node], low[neighbour]);
            }
        }
    }

    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        adj = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            adj[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a < n && b < n) { // Check if the input is within bounds
                adj[a].add(b);
                adj[b].add(a);
            } else {
                System.out.println("Invalid input");
                return;
            }
        }

        visited = new int[n];
        in = new int[n];
        low = new int[n];
        criticalPlanets = new TreeSet<>();
        timer = 0;

        for (int i = 0; i < n; i++) {
            if (visited[i] == 0) {
                dfs(i, -1);
            }
        }

        if (criticalPlanets.isEmpty()) {
            System.out.println(-1);
        } else {
            for (int planet : criticalPlanets) {
                System.out.println(planet);
            }
        }
    }
}