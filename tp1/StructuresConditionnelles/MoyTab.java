import java.util.Scanner;
import java.text.DecimalFormat;

public class MoyTab{
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        double somme1 = 0;
        double somme2 = 0;

        // ici le cas où la taille du tableau est connu
        double []tab ={0,0,0};
        for(int i = 0; i < tab.length ; i++)
        {
            System.out.println("Note " + (i+1) + ": ");
            tab[i] = scan.nextDouble();
            somme1 = somme1 + tab[i];
            if(i == tab.length - 1 )
            {
                System.out.println("La moyenne 1 est de : " +df.format(( somme1 / (tab.length))) );
            }
        }

        // ici le cas où la taille du tableau est inconnu à l'avance ( tableau dynamique )
        /*
        System.out.print("Taille du 2e tableau : ");
        int a = scan.nextInt();
        double []tab2 = new double[a];
        for(int k = 0; k < tab2.length ; k++)
        {
            System.out.println("Note " + (k+1) + ": ");
            tab2[k] = scan.nextDouble();
            somme2 = somme2 + tab2[k];
            if(k == tab2.length - 1 )
            {
                System.out.println("La moyenne 2 est de : " + df.format(( somme2 / (tab2.length))) );
            }
        }*/
    }
}