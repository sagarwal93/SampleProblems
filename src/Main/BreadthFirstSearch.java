package Main;

import java.util.*;

/**
 * Created by Samarth on 6/4/16.
 */
public class BreadthFirstSearch {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int numTests = in.nextInt();

        for (int t = 0; t < numTests; t++) {

            int numV = in.nextInt();
            int numE = in.nextInt();

            Hashtable<Integer, Integer>[] dists = new Hashtable[numV];
            for (int i = 0; i < numV; i++) {
                dists[i] = new Hashtable<>();
            }

            for (int e = 0; e < numE; e++) {
                int v1 = in.nextInt() - 1;
                int v2 = in.nextInt() - 1;

                dists[v1].put(v2, 6);
                dists[v2].put(v1, 6);
            }

            int startVIdx = in.nextInt() - 1;

            int[] finalDists = getBFSDistances(dists, startVIdx);

            for (int d = 0; d < finalDists.length; d++) {
                if (finalDists[d] != 0) {
                    System.out.print(finalDists[d] + " ");
                }
            }

            System.out.println();
        }
    }

    private static int[] getBFSDistances(Hashtable<Integer, Integer>[] dists, int startVIdx) {
        int[] smallestDists = new int[dists.length];
        Arrays.fill(smallestDists, -1);
        smallestDists[startVIdx] = 0;

        boolean[] visited = new boolean[dists.length];

        Queue queue = new LinkedList<Integer>();
        queue.add(startVIdx);

        while (!queue.isEmpty()) {
            int currV = (int) queue.poll();
            visited[currV] = true;

            for (Integer edge : Collections.list(dists[currV].keys())) {
                if (visited[edge]) {
                    continue;
                }

                if (smallestDists[edge] > smallestDists[currV] + 6 || smallestDists[edge] == -1) {
                    smallestDists[edge] = smallestDists[currV] + 6;
                    queue.add(edge);
                }
            }
        }

        return smallestDists;
    }

}
