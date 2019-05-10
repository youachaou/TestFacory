package bf.sonabel.factory;


import bf.sonabel.afactory.Usine;

public class UsineLimonade implements Usine {

    public static void main(String[] args) {
        UsineLimonade ul = new UsineLimonade();
        Limonade fanta = ul.produire("fanta");
        fanta.utiliser();
        Limonade sprite = ul.produire("sprite");
        sprite.utiliser();
        Limonade coca = ul.produire("coca");
        coca.utiliser();
        Limonade fantaO = ul.produire("fantaOrange");
        fantaO.utiliser();
        Limonade hawai = ul.produire("hawai");
        hawai.utiliser();

    }

    public Limonade produire(String nom) {
        switch (nom) {
            case "fanta":
                return new Fanta();
            case "coca":
                return new Coca();
            case "sprite":
                return new Coca();
            //case "fantaOrange":
            //    return new FantaOrange();
            default:
                return new Coca();
        }

    }
}
