package fr.abp.cours;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        String tmp = "";
        char C = '\0';

        System.out.println("Entrez des chiffres et appuyez sur la touche entrée pour valider la saisie: ");

        while (C != '\n') {
            C = (char) System.in.read();
            if (C != '\r' && C != '\n') {
                tmp = tmp + C;

            }
        }
    }

