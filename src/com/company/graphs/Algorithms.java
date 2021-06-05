package com.company.graphs;

public class Algorithms {

    public static void BellmanFord(Graf graf, int source) {
        int V = graf.V, E = graf.E;
        int[] uzaklik = new int[V];

        for (int i = 0; i < V; ++i)
            uzaklik[i] = Integer.MAX_VALUE;
        uzaklik[source] = 0;

        for (int i = 1; i < V; ++i) {
            for (int j = 0; j < E; ++j) {
                int u = graf.kenar[j].kaynak;
                int v = graf.kenar[j].hedef;
                int agirlik = graf.kenar[j].agirlik;
                if (uzaklik[u] != Integer.MAX_VALUE && uzaklik[u] + agirlik < uzaklik[v]) {
                    uzaklik[v] = uzaklik[u] + agirlik;
                }
            }
        }

        for (int j = 0; j < E; ++j) {
            int u = graf.kenar[j].kaynak;
            int v = graf.kenar[j].hedef;
            int agirlik = graf.kenar[j].agirlik;
            if (uzaklik[u] != Integer.MAX_VALUE && uzaklik[u] + agirlik < uzaklik[v]) {
                System.out.println("Grafta negatif ağırlık bulunmaktadır.");
                return;
            }
        }
        printArr(uzaklik, V);
    }

    public static void printArr(int[] dist, int V) {
        System.out.println("Kenarın kaynaktan hedefe olan uzaklığı:");
        for (int i = 0; i < V; ++i)
            System.out.println(i + "\t\t" + dist[i]);
    }

    public static void Dijkstra(int[][] graph, int source) {
        int uzunluk = graph.length;
        boolean[] ziyaretEdilenKoseler = new boolean[uzunluk];
        int[] uzaklik = new int[uzunluk];
        for (int i = 0; i < uzunluk; i++) {
            ziyaretEdilenKoseler[i] = false;
            uzaklik[i] = Integer.MAX_VALUE;
        }

        uzaklik[source] = 0;
        for (int i = 0; i < uzunluk; i++) {

            int u = kisaUzakligiBul(uzaklik, ziyaretEdilenKoseler);
            ziyaretEdilenKoseler[u] = true;

            for (int v = 0; v < uzunluk; v++) {
                if (!ziyaretEdilenKoseler[v] && graph[u][v] != 0 && (uzaklik[u] + graph[u][v] < uzaklik[v]) && graph[u][v] != Integer.MAX_VALUE) {
                    uzaklik[v] = uzaklik[u] + graph[u][v];
                }
            }
        }
        for (int i = 0; i < uzaklik.length; i++) {
            System.out.printf("%s köşesinden %s köşesine olan ağırlık = %s%n", source, i, uzaklik[i]);
        }

    }

    private static int kisaUzakligiBul(int[] uzaklik, boolean[] ziyaretEdilenKoseler) {
        int enKisa = Integer.MAX_VALUE;
        int enKisaKenar = -1;
        for (int i = 0; i < uzaklik.length; i++) {
            if (!ziyaretEdilenKoseler[i] && uzaklik[i] < enKisa) {
                enKisa = uzaklik[i];
                enKisaKenar = i;
            }
        }
        return enKisaKenar;
    }

    public static void FloydWarshall(int[][] graph) {
        int nV = graph.length;
        int[][] matrix = new int[nV][nV];
        int i, j, k;

        for (i = 0; i < nV; i++)
            for (j = 0; j < nV; j++)
                matrix[i][j] = graph[i][j];

        for (k = 0; k < nV; k++) {
            for (i = 0; i < nV; i++) {
                for (j = 0; j < nV; j++) {
                    if ((matrix[i][k] + matrix[k][j] < matrix[i][j]) && matrix[i][k] != Integer.MAX_VALUE && matrix[k][j] != Integer.MAX_VALUE)
                        matrix[i][j] = matrix[i][k] + matrix[k][j];
                }
            }
        }
        printMatrix(matrix);
    }

    private static void printMatrix(int[][] matrix) {
        int nV = matrix[0].length;
        for (int i = 0; i < nV; ++i) {
            for (int j = 0; j < nV; ++j) {
                if (matrix[i][j] == Integer.MAX_VALUE)
                    System.out.print("INF\t\t");
                else
                    System.out.print(matrix[i][j] + "\t\t");
            }
            System.out.println();
        }
    }

}
