package bf.sonabel.afactory;

import bf.sonabel.factory.UsineLimonade;
import bf.sonabel.factory2.UsineChaussure;

public class Holding {


    public static void main(String[] args) {
        Holding h = new Holding();
    }

    public Produit produire(String nom) {
        Usine u;
        switch (nom) {
            case "cas1":
                u = new UsineLimonade();
            case "cas2":
                u = new UsineChaussure();
            default:
                u = new UsineLimonade();
        }
        return u.produire(nom);


    }
}
