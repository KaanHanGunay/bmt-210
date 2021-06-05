package com.company;

import com.company.graphs.Algorithms;
import com.company.graphs.Graf;

public class Main {

    public static void main(String[] args) {

        Graf graf1 = new Graf(5, 7);
        graf1.KenarEkle(0, 1, 6);
        graf1.KenarEkle(0, 2, 5);
        graf1.KenarEkle(2, 1, -2);
        graf1.KenarEkle(1, 3, -1);
        graf1.KenarEkle(2, 3, 4);
        graf1.KenarEkle(2, 4, 3);
        graf1.KenarEkle(3, 4, 3);

        Graf graf2 = new Graf(6, 7);
        graf2.KenarEkle(0, 1, 3);
        graf2.KenarEkle(0, 3, 5);
        graf2.KenarEkle(1, 2, 7);
        graf2.KenarEkle(1, 4, 2);
        graf2.KenarEkle(3, 4, 4);
        graf2.KenarEkle(2, 5, 9);
        graf2.KenarEkle(4, 5, 6);

        Graf graf3 = new Graf(6, 14);
        graf3.KenarEkle(0, 1, 1);
        graf3.KenarEkle(0, 4, 1);
        graf3.KenarEkle(1, 4, 1);
        graf3.KenarEkle(1, 2, 1);
        graf3.KenarEkle(4, 3, 1);
        graf3.KenarEkle(2, 3, 1);
        graf3.KenarEkle(3, 5, 1);
        graf3.KenarEkle(1, 0, 1);
        graf3.KenarEkle(4, 0, 1);
        graf3.KenarEkle(4, 1, 1);
        graf3.KenarEkle(2, 1, 1);
        graf3.KenarEkle(3, 4, 1);
        graf3.KenarEkle(3, 2, 1);
        graf3.KenarEkle(5, 3, 1);

        Graf graf4 = new Graf(9, 28);
        graf4.KenarEkle(0, 1, 4);
        graf4.KenarEkle(0, 7, 8);
        graf4.KenarEkle(1, 7, 11);
        graf4.KenarEkle(1, 2, 8);
        graf4.KenarEkle(7, 8, 7);
        graf4.KenarEkle(7, 6, 1);
        graf4.KenarEkle(2, 8, 2);
        graf4.KenarEkle(8, 6, 6);
        graf4.KenarEkle(2, 3, 7);
        graf4.KenarEkle(2, 5, 4);
        graf4.KenarEkle(6, 5, 2);
        graf4.KenarEkle(3, 5, 14);
        graf4.KenarEkle(3, 4, 9);
        graf4.KenarEkle(5, 4, 10);
        graf4.KenarEkle(1, 0, 4);
        graf4.KenarEkle(7, 0, 8);
        graf4.KenarEkle(7, 1, 11);
        graf4.KenarEkle(2, 1, 8);
        graf4.KenarEkle(8, 7, 7);
        graf4.KenarEkle(6, 7, 1);
        graf4.KenarEkle(8, 2, 2);
        graf4.KenarEkle(6, 8, 6);
        graf4.KenarEkle(3, 2, 7);
        graf4.KenarEkle(5, 2, 4);
        graf4.KenarEkle(5, 6, 2);
        graf4.KenarEkle(5, 3, 14);
        graf4.KenarEkle(4, 3, 9);
        graf4.KenarEkle(4, 5, 10);

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
