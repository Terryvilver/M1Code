//Le but est de créer un compte a rebours

public class CompteRebours extends Compteur {

    CompteRebours() {
        super();
    }

    CompteRebours(int heure, int minute, int seconde) {
        super(heure, minute, seconde);
    }

    public void decrementation() {
        if(super.mm == 0 && super.ss == 0) {
            super.hh--;
            super.mm = 59;
            super.ss = 59;
        }
        else if(super.ss == 0 ) {
            super.mm--;
            super.ss = 59;
        }
        else
            super.ss--;
    }
}