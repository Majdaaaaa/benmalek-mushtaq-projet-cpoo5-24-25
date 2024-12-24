public enum Doigt {
    POUCE_D(Main.DROITE, 0.5), ANNULAIRE_D(Main.DROITE, 1.2), MAJEUR_D(Main.DROITE, 1), AURICULAIRE_D(Main.DROITE, 2),
    INDEX_D(Main.DROITE, 1.2),
    POUCE_G(Main.GAUCHE, 0.5), ANNULAIRE_G(Main.GAUCHE, 1.2), MAJEUR_G(Main.GAUCHE, 1), AURICULAIRE_G(Main.GAUCHE, 1.5),
    INDEX_G(Main.GAUCHE, 1.2);
    // AURICULAIRE_D = 2 psq il est petit est doit atteindre des touche chiantes = %^$` entrée shift effacé - ) .....

    private Main main;
    private double poids;
    private Coordonnee coord;
    private String nomDoigt;

    private Doigt(Main m, double p) {
        this.main = m;
        main.getListDoigt().add(this);
        this.poids = p;
        this.coord = getPosBase(this);
    }

    public Main getMain() {
        return this.main;
    }

    public double getPoids() {
        return poids;
    }

    public Coordonnee getCord() {
        return this.coord;
    }

    public Coordonnee getPosBase(Doigt d) {
        Coordonnee c = null;
        switch (d) {
            case ANNULAIRE_G:
                c = new Coordonnee(2, 2);
                this.nomDoigt = "ANNULAIRE_G";
                break;
            case ANNULAIRE_D:
                c = new Coordonnee(9, 2);
                this.nomDoigt = "ANNULAIRE_D";
                break;
            case AURICULAIRE_G:
                c = new Coordonnee(1, 2);
                this.nomDoigt = "AURICULAIRE_G";
                break;
            case AURICULAIRE_D:
                c = new Coordonnee(10, 2);
                this.nomDoigt = "AURICULAIRE_D";
                break;
            case INDEX_G:
                c = new Coordonnee(4, 2);
                this.nomDoigt = "INDEX_G";
                break;
            case INDEX_D:
                c = new Coordonnee(7, 2);
                this.nomDoigt = "INDEX_D";
                break;
            case MAJEUR_G:
                c = new Coordonnee(3, 2);
                this.nomDoigt = "MAJEUR_G";
                break;
            case MAJEUR_D:
                c = new Coordonnee(8, 2);
                this.nomDoigt = "MAJEUR_D";
                break;
            case POUCE_G:
                c = new Coordonnee(4, 0);
                this.nomDoigt = "POUCE_G";
                break;
            case POUCE_D:
                c = new Coordonnee(8, 0);
                this.nomDoigt = "POUCE_D";
                break;
        }
        return c;
    }

    // public String toString() {
    //     return "Doigt {" +
    //             "main = " + main +
    //             ", poids = " + poids +
    //             ", coord = " + coord +
    //             '}';
    // }

    public String toString() {
        return "Doigt { " +
                 main + " "
                 + nomDoigt +" "+
                " , poids = " + poids +
                " , " + coord +
                '}';
    }
}