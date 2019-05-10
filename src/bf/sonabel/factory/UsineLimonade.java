package bf.sonabel.factory;


import bf.sonabel.factory.Limonade;

public class UsineLimonade {

    public static void main(String[] args) {
        UsineLimonade ul = new UsineLimonade();
        Limonade fanta = ul.produireLimonade("fanta");
        fanta.boire();
        Limonade sprite = ul.produireLimonade("sprite");
        sprite.boire();
        Limonade coca = ul.produireLimonade("coca");
        coca.boire();
        Limonade fantaO = ul.produireLimonade("fantaOrange");
        fantaO.boire();
        Limonade hawai = ul.produireLimonade("hawai");
        hawai.boire();

    }

    private Limonade produireLimonade(String nom) {
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
