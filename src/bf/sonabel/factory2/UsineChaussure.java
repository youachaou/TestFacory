package bf.sonabel.factory2;

import bf.sonabel.afactory.Usine;

public class UsineChaussure implements Usine {


    public Chaussure produire(String nom) {

        switch (nom) {
            case "bottes":
                return
                        new Bottes();
            case "sandales":
                return
                        new Sandales();
            default:
                return
                        new Bottes();
        }
    }
}
