package miage.shu.bowling;

public class Jeu {
    private Integer essai1;
    private Integer essai2;

    public Jeu(Integer essai1) {
        this.essai1 = essai1;
    }

    public Jeu(Integer essai1, Integer essai2) {
        this.essai1 = essai1;
        this.essai2 = essai2;
    }

    public boolean isValid() {
        if (this.essai1 == null) {
            return false;
        }
        if (this.essai2 == null && Integer.valueOf(10) != this.essai1) {
            return false;
        }
        Integer somme = this.essai1;
        if (this.essai2 != null) {
            somme += this.essai2;
        }
        if (somme > 10) {
            return false;
        }

        return true;
    }
}
