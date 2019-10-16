package classes;
import classes.*;

public class Chronometre extends Compteur{
    private int heure;
    private int minute;
    private int seconde;

    public Chronometre() {
        super();
        heure = 0;
        minute = 0;
        seconde = 0;
    }

    public Chronometre(int compte, int heure, int minute, int seconde) {
		super(compte);
        this.heure = heure;
        this.minute = minute;
        this.seconde = seconde;
    }

    public int getHeure() {
        return heure;
    }

    public int getMinute() {
        return minute;
    }

    public int getSeconde() {
        return seconde;
    }

    public void incrementation() {
        if(this.minute == 59 && this.seconde == 59) {
            this.heure++;
            this.minute = 0;
            this.seconde = 0;
        }
        else if(this.seconde == 59 ) {
            this.minute++;
            this.seconde = 0;
        }
        else
            this.seconde++;
    }

    public void decrementation() {
        if(this.minute == 0 && this.seconde == 0) {
            this.heure--;
            this.minute = 59;
            this.seconde = 59;
            if(heure == 0)
                this.heure = 0;
        }
        else if(this.minute != 0 ) {
            this.minute--;
            this.seconde = 0;
        }
        else
            if( (this.seconde != 0 && this.minute != 0) && (this.heure != 0))
                this.seconde--;
    }
}
