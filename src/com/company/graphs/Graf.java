package com.company.graphs;

public class Graf {

    public class Kenar {
        public int kaynak, hedef, agirlik;
        Kenar()
        {
            kaynak = hedef = agirlik = 0;
        }
    }

    public int V, E;
    public Kenar[] kenar;

    public Graf(int v, int e)
    {
        V = v;
        E = e;
        kenar = new Kenar[e];
        for (int i = 0; i < e; ++i)
            kenar[i] = new Kenar();
    }
}
