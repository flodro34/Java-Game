package org.example;

import java.util.Random;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //instanciation de l'objet Random
        Random random = new Random();

        //Génération de nb aléatoire
        int nbADeviner = random.nextInt(100) + 1;

        //Instanciation de l'objet Scanner
        Scanner sc = new Scanner(System.in);

        int saisie = 0;
        //int essai = 5;

        System.out.println("Devine un nb entre 1 et 100");

        do {
            System.out.println("Entre un nb :");
            saisie = sc.nextInt();

            if (nbADeviner < saisie){
                System.out.println("le nb est + petit ");
            } else if (nbADeviner > saisie) {
                System.out.println("le nb est + grand ");
            }else {
                System.out.println("Gagné !");
            }
        }while (saisie != nbADeviner);


    }
}
