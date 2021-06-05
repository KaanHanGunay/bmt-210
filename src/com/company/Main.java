package com.company;

import com.company.graphs.Algorithms;
import com.company.graphs.Graf;

public class Main {

    public static void main(String[] args) {
        Graf graf1 = new Graf(5, 7);

        graf1.kenar[0].kaynak = 0;
        graf1.kenar[0].hedef = 1;
        graf1.kenar[0].agirlik = 6;

        graf1.kenar[1].kaynak = 0;
        graf1.kenar[1].hedef = 2;
        graf1.kenar[1].agirlik = 5;

        graf1.kenar[2].kaynak = 2;
        graf1.kenar[2].hedef = 1;
        graf1.kenar[2].agirlik = -2;

        graf1.kenar[3].kaynak = 1;
        graf1.kenar[3].hedef = 3;
        graf1.kenar[3].agirlik = -1;

        graf1.kenar[4].kaynak = 2;
        graf1.kenar[4].hedef = 3;
        graf1.kenar[4].agirlik = 4;

        graf1.kenar[5].kaynak = 2;
        graf1.kenar[5].hedef = 4;
        graf1.kenar[5].agirlik = 3;

        graf1.kenar[6].kaynak = 3;
        graf1.kenar[6].hedef = 4;
        graf1.kenar[6].agirlik = 3;

        Graf graf2 = new Graf(6, 7);

        graf2.kenar[0].kaynak = 0;
        graf2.kenar[0].hedef = 1;
        graf2.kenar[0].agirlik = 3;

        graf2.kenar[1].kaynak = 0;
        graf2.kenar[1].hedef = 3;
        graf2.kenar[1].agirlik = 5;

        graf2.kenar[2].kaynak = 1;
        graf2.kenar[2].hedef = 2;
        graf2.kenar[2].agirlik = 7;

        graf2.kenar[3].kaynak = 1;
        graf2.kenar[3].hedef = 4;
        graf2.kenar[3].agirlik = 2;

        graf2.kenar[4].kaynak = 3;
        graf2.kenar[4].hedef = 4;
        graf2.kenar[4].agirlik = 4;

        graf2.kenar[5].kaynak = 2;
        graf2.kenar[5].hedef = 5;
        graf2.kenar[5].agirlik = 9;

        graf2.kenar[6].kaynak = 4;
        graf2.kenar[6].hedef = 5;
        graf2.kenar[6].agirlik = 6;

        Graf graf3 = new Graf(6, 14);

        graf3.kenar[0].kaynak = 0;
        graf3.kenar[0].hedef = 1;
        graf3.kenar[0].agirlik = 1;

        graf3.kenar[1].kaynak = 0;
        graf3.kenar[1].hedef = 4;
        graf3.kenar[1].agirlik = 1;

        graf3.kenar[2].kaynak = 1;
        graf3.kenar[2].hedef = 4;
        graf3.kenar[2].agirlik = 1;

        graf3.kenar[3].kaynak = 1;
        graf3.kenar[3].hedef = 2;
        graf3.kenar[3].agirlik = 1;

        graf3.kenar[4].kaynak = 4;
        graf3.kenar[4].hedef = 3;
        graf3.kenar[4].agirlik = 1;

        graf3.kenar[5].kaynak = 2;
        graf3.kenar[5].hedef = 3;
        graf3.kenar[5].agirlik = 1;

        graf3.kenar[6].kaynak = 3;
        graf3.kenar[6].hedef = 5;
        graf3.kenar[6].agirlik = 1;

        graf3.kenar[7].kaynak = 1;
        graf3.kenar[7].hedef = 0;
        graf3.kenar[7].agirlik = 1;

        graf3.kenar[8].kaynak = 4;
        graf3.kenar[8].hedef = 0;
        graf3.kenar[8].agirlik = 1;

        graf3.kenar[9].kaynak = 4;
        graf3.kenar[9].hedef = 1;
        graf3.kenar[9].agirlik = 1;

        graf3.kenar[10].kaynak = 2;
        graf3.kenar[10].hedef = 1;
        graf3.kenar[10].agirlik = 1;

        graf3.kenar[11].kaynak = 3;
        graf3.kenar[11].hedef = 4;
        graf3.kenar[11].agirlik = 1;

        graf3.kenar[12].kaynak = 3;
        graf3.kenar[12].hedef = 2;
        graf3.kenar[12].agirlik = 1;

        graf3.kenar[13].kaynak = 5;
        graf3.kenar[13].hedef = 3;
        graf3.kenar[13].agirlik = 1;

        Graf graf4 = new Graf(9, 28);

        graf4.kenar[0].kaynak = 0;
        graf4.kenar[0].hedef = 1;
        graf4.kenar[0].agirlik = 4;

        graf4.kenar[1].kaynak = 0;
        graf4.kenar[1].hedef = 7;
        graf4.kenar[1].agirlik = 8;

        graf4.kenar[2].kaynak = 1;
        graf4.kenar[2].hedef = 7;
        graf4.kenar[2].agirlik = 11;

        graf4.kenar[3].kaynak = 1;
        graf4.kenar[3].hedef = 2;
        graf4.kenar[3].agirlik = 8;

        graf4.kenar[4].kaynak = 7;
        graf4.kenar[4].hedef = 8;
        graf4.kenar[4].agirlik = 7;

        graf4.kenar[5].kaynak = 7;
        graf4.kenar[5].hedef = 6;
        graf4.kenar[5].agirlik = 1;

        graf4.kenar[6].kaynak = 2;
        graf4.kenar[6].hedef = 8;
        graf4.kenar[6].agirlik = 2;

        graf4.kenar[7].kaynak = 8;
        graf4.kenar[7].hedef = 6;
        graf4.kenar[7].agirlik = 6;

        graf4.kenar[8].kaynak = 2;
        graf4.kenar[8].hedef = 3;
        graf4.kenar[8].agirlik = 7;

        graf4.kenar[9].kaynak = 2;
        graf4.kenar[9].hedef = 5;
        graf4.kenar[9].agirlik = 4;

        graf4.kenar[10].kaynak = 6;
        graf4.kenar[10].hedef = 5;
        graf4.kenar[10].agirlik = 2;

        graf4.kenar[11].kaynak = 3;
        graf4.kenar[11].hedef = 5;
        graf4.kenar[11].agirlik = 14;

        graf4.kenar[12].kaynak = 3;
        graf4.kenar[12].hedef = 4;
        graf4.kenar[12].agirlik = 9;

        graf4.kenar[13].kaynak = 5;
        graf4.kenar[13].hedef = 4;
        graf4.kenar[13].agirlik = 10;

        graf4.kenar[14].kaynak = 1;
        graf4.kenar[14].hedef = 0;
        graf4.kenar[14].agirlik = 4;

        graf4.kenar[15].kaynak = 7;
        graf4.kenar[15].hedef = 0;
        graf4.kenar[15].agirlik = 8;

        graf4.kenar[16].kaynak = 7;
        graf4.kenar[16].hedef = 1;
        graf4.kenar[16].agirlik = 11;

        graf4.kenar[17].kaynak = 2;
        graf4.kenar[17].hedef = 1;
        graf4.kenar[17].agirlik = 8;

        graf4.kenar[18].kaynak = 8;
        graf4.kenar[18].hedef = 7;
        graf4.kenar[18].agirlik = 7;

        graf4.kenar[19].kaynak = 6;
        graf4.kenar[19].hedef = 7;
        graf4.kenar[19].agirlik = 1;

        graf4.kenar[20].kaynak = 8;
        graf4.kenar[20].hedef = 2;
        graf4.kenar[20].agirlik = 2;

        graf4.kenar[21].kaynak = 6;
        graf4.kenar[21].hedef = 8;
        graf4.kenar[21].agirlik = 6;

        graf4.kenar[22].kaynak = 3;
        graf4.kenar[22].hedef = 2;
        graf4.kenar[22].agirlik = 7;

        graf4.kenar[23].kaynak = 5;
        graf4.kenar[23].hedef = 2;
        graf4.kenar[23].agirlik = 4;

        graf4.kenar[24].kaynak = 5;
        graf4.kenar[24].hedef = 6;
        graf4.kenar[24].agirlik = 2;

        graf4.kenar[25].kaynak = 5;
        graf4.kenar[25].hedef = 3;
        graf4.kenar[25].agirlik = 14;

        graf4.kenar[26].kaynak = 4;
        graf4.kenar[26].hedef = 3;
        graf4.kenar[26].agirlik = 9;

        graf4.kenar[27].kaynak = 4;
        graf4.kenar[27].hedef = 5;
        graf4.kenar[27].agirlik = 10;

        int[][] graph1 = {
                {0, 6, 5, Integer.MAX_VALUE, Integer.MAX_VALUE},
                {Integer.MAX_VALUE, 0, -2, -1, Integer.MAX_VALUE},
                {Integer.MAX_VALUE, -2, 0, 4, 3},
                {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 0, 3},
                {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 0},
        };

        int[][] graph2 = {
                {0, 3, Integer.MAX_VALUE, 5, Integer.MAX_VALUE, Integer.MAX_VALUE},
                {Integer.MAX_VALUE, 0, 7, Integer.MAX_VALUE, 2, Integer.MAX_VALUE},
                {Integer.MAX_VALUE, Integer.MAX_VALUE, 0, Integer.MAX_VALUE, Integer.MAX_VALUE, 9},
                {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 0, 4, Integer.MAX_VALUE},
                {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 0, 6},
                {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 0}
        };

        int[][] graph3 = {
                { 0, 1, Integer.MAX_VALUE, Integer.MAX_VALUE, 1, Integer.MAX_VALUE},
                { 1, 0, 1, Integer.MAX_VALUE, 1, Integer.MAX_VALUE },
                { Integer.MAX_VALUE, 1, 0, 1, Integer.MAX_VALUE, Integer.MAX_VALUE },
                { Integer.MAX_VALUE, Integer.MAX_VALUE, 1, 0, 1, 1 },
                { 1, 1, Integer.MAX_VALUE, 1, 0, Integer.MAX_VALUE },
                { Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 1, Integer.MAX_VALUE, 0 },
        };

        int[][] graph4 = {
                {0, 4, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 8, Integer.MAX_VALUE},
                {4, 0, 8, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 11, Integer.MAX_VALUE},
                {Integer.MAX_VALUE, 8, 0, 7, Integer.MAX_VALUE, 4, Integer.MAX_VALUE, Integer.MAX_VALUE, 2},
                {Integer.MAX_VALUE, Integer.MAX_VALUE, 7, 0, 9, 14, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE},
                {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 9, 0, 10, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE},
                {Integer.MAX_VALUE, Integer.MAX_VALUE, 4, 14, 10, 0, 2, Integer.MAX_VALUE, Integer.MAX_VALUE},
                {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 2, 0, 1, 6},
                {8, 11, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 1, 0, 7},
                {Integer.MAX_VALUE, Integer.MAX_VALUE, 2, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 6, 7, 0}
        };

        System.out.println("Bellman-Ford Algoritması 1. Graph");
        Algorithms.BellmanFord(graf1, 0);
        System.out.println("#######################################");
        System.out.println("Bellman-Ford Algoritması 2. Graph");
        Algorithms.BellmanFord(graf2, 0);
        System.out.println("#######################################");
        System.out.println("Bellman-Ford Algoritması 3. Graph");
        Algorithms.BellmanFord(graf3, 0);
        System.out.println("#######################################");
        System.out.println("Bellman-Ford Algoritması 4. Graph");
        Algorithms.BellmanFord(graf4, 0);
        System.out.println("#######################################");
        System.out.println("Dijkstra Algoritması 1. Graph");
        Algorithms.Dijkstra(graph1, 0);
        System.out.println("#######################################");
        System.out.println("Dijkstra Algoritması 2. Graph");
        Algorithms.Dijkstra(graph2, 0);
        System.out.println("#######################################");
        System.out.println("Dijkstra Algoritması 3. Graph");
        Algorithms.Dijkstra(graph3, 0);
        System.out.println("#######################################");
        System.out.println("Dijkstra Algoritması 4. Graph");
        Algorithms.Dijkstra(graph4, 0);
        System.out.println("#######################################");
        System.out.println("Floyd-Warshall Algoritması 1. Graph");
        Algorithms.FloydWarshall(graph1);
        System.out.println("#######################################");
        System.out.println("Floyd-Warshall Algoritması 2. Graph");
        Algorithms.FloydWarshall(graph2);
        System.out.println("#######################################");
        System.out.println("Floyd-Warshall Algoritması 3. Graph");
        Algorithms.FloydWarshall(graph3);
        System.out.println("#######################################");
        System.out.println("Floyd-Warshall Algoritması 4. Graph");
        Algorithms.FloydWarshall(graph4);
    }
}
