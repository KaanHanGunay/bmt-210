package com.company.graphs;

import java.util.ArrayList;
import java.util.List;

public class Graf {

    public class Kenar {
        public int kaynak, hedef, agirlik;
        Kenar()
        {
            kaynak = hedef = agirlik = 0;
        }
    }

    public int V, E;
    public List<Kenar> kenar;

    public Graf(int v, int e) {
        V = v;
        E = e;
        kenar = new ArrayList<>();
    }

    public void KenarEkle(int kaynak, int hedef, int agirlik) {
        Kenar kenar = new Kenar();
        kenar.kaynak = kaynak;
        kenar.hedef = hedef;
        kenar.agirlik = agirlik;
        this.kenar.add(kenar);
    }
}
