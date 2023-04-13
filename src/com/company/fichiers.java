package com.company;

import java.io.File;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class fichiers {
    public static Films[] content;
    public fichiers(Films[] content){
        this.content = content;
    }
    public fichiers(String filename){
        try {
            Scanner reader = new Scanner(new File(filename));
            int n= Integer.parseInt(reader.nextLine());
            content = new Films[n];
            for (int i=0; i<n; i++){
                content[i] = rowToFilms(reader.nextLine());
                reader.close();
                System.out.println("success !");
            }

    }catch (Exception e){
            System.out.println("probleme d'ouverture du fichier "+filename+"...");
            e.printStackTrace();
            System.exit(-1);
        }
}

    private Films rowToFilms(String nextLine) {
        String[] part = nextLine.split(",");
        String NomFilm=part[0];
        String FirstActeur=part[1];
        int AnneeSortie= Integer.parseInt(part[2]);
        String realisateur=part[3];
        String support=part[4];
    return new Films(NomFilm,FirstActeur,AnneeSortie,realisateur,support);
    }

    public static Films[] getContent() {
        return content;
    }
}
