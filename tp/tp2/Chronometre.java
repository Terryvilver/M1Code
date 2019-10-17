public class Chronometre extends Compteur{

    public Chronometre() {
        super();
    }

    public Chronometre(int heure, int minute, int seconde) {
        super(heure, minute, seconde);
    }

    public int getHeure() {
        return super.hh;
    }

    public int getMinute() {
        return super.mm;
    }

    public int getSeconde() {
        return super.ss;
    }

    public void incrementation() {
        if(super.mm == 59 && super.ss == 59) {
            super.hh++;
            super.mm = 0;
            super.ss = 0;
        }
        else if(super.ss == 59 ) {
            super.mm++;
            super.ss = 0;
        }
        else
            super.ss++;
    }
}
