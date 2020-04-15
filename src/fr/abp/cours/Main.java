package fr.abp.cours;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        String tmp = "";
        char C = '\0';
        int valeur;

        System.out.println("Entrez des chiffres et appuyez sur la touche entrée pour valider la saisie: ");

        while (C != '\n') {
            C = (char) System.in.read();
            if (C != '\r' && C != '\n') {
                tmp = tmp + C;

            }
            System.out.println("Vous avez entré: " + tmp);
            valeur = Integer.parseInt(tmp);
            System.out.println("C'est à dire " + valeur + " en entier");
        }
    }
}

