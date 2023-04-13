package com.company;

import javax.xml.crypto.Data;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;
//import java.util.InputMismatchException;

public class Main {

    public static void main(String[] args) {

     // liste de films
                char continuer=' ';
                Scanner nw = new Scanner(System.in);

                Films fils = new Films();
                System.out.println(fils);
               // fils.recherche(nw.next());

                System.out.println(
                        "-------------------------------------------------------------------------------------------------------------------------");


                System.out.println(
                        "-------------------------------------------------------------------------------------------------------------------------");


                Films[] listfilm = { new Films("Superman", "Henry Cavill", 2016, "Richard Donner", "K7"),
                        new Films("Batman", "Bruce Wayne", 2016, "Richard Donner", "Cle-USB"),
                        new Films("Avenger", "Tony Start", 2010, "Joss Whedon", "Blue-ray"),
                        new Films("Spiderman", "Harry paker", 2008, "Sam Raimi", "DVD"), };
                ;
                for (Films list : listfilm)
                    System.out.println(list.toString());
                System.out.println(
                        "-------------------------------------------------------------------------------------------------------------------------");


                System.out.println("stocker un nouveau film");

                Films film=new Films();

                listfilm.clone();
                // do{

                System.out.print("Nom du film : ");
                film.setNomFilm(nw.next());
                nw.nextLine();
                System.out.print("Acteur principal du  du film : ");
                film.setFirstActeur(nw.next());
                nw.nextLine();

                System.out.print("Annee de sortie du  du film : ");

            film.setAnneeSortie(nw.nextInt());





                nw.nextLine();
                System.out.print("Realisateur du film : ");
                film.setRealisateur(nw.next());
                nw.nextLine();
                System.out.print("Support du film : ");
                film.setSupport(nw.next());
                nw.nextLine();

                System.out.println(film.toString());
          /*  System.out.println("Souhaitez-vous ajouter un autre film ? (O/N)");
         continuer = nw.nextLine().charAt(0);
            if(continuer=='n') {

                break;
            }
    }while (continuer=='o');*/

                System.out.println( "NomFilm='" + film.getNomFilm() + '\'' +
                        ", FirstActeur='" + film.getFirstActeur() + '\'' +
                        ", AnneeSortie=" + film.getAnneeSortie() +
                        ", realisateur='" + film.getRealisateur() + '\'' +
                        ", support='" + film.getSupport() + '\'' +
                        '.');

                System.out.println(
                        "-------------------------------------------------------------------------------------------------------------------------");
                System.out.println(
                        "-------------------------------------------------------------------------------------------------------------------------");

                System.out.println("entrer le nom du films a rechercher : ");
                film.recherche(nw.next());
                nw.nextLine();
                System.out.println(
                        "-------------------------------------------------------------------------------------------------------------------------");
                System.out.println(
                        "-------------------------------------------------------------------------------------------------------------------------");

                System.out.println("entrer le nom du films a supprimer: ");
                film.supprimer(nw.next());

                System.out.println(
                        "-------------------------------------------------------------------------------------------------------------------------");
                System.out.println(
                        "-------------------------------------------------------------------------------------------------------------------------");

                System.out.println( "NomFilm='" + film.getNomFilm() + '\'' +
                        ", FirstActeur='" + film.getFirstActeur() + '\'' +
                        ", AnneeSortie=" + film.getAnneeSortie() +
                        ", realisateur='" + film.getRealisateur() + '\'' +
                        ", support='" + film.getSupport() + '\'' +
                        '.');









        // clients
        Scanner person = new Scanner(System.in);
        ArrayList<Client> clients = new ArrayList<>();
        clients.add(new Client("Amarido", "Carlos", "Amarildo@gmail.com"));
        clients.add(new Client("Fofa","Clemente", "clemente@yahoo.com"));
        clients.add(new Client("Gildo","Arrobas","Arrobas@hotmail.com"));

        ArrayList<Films> movies = new ArrayList<>();
        movies.add(new Films("Petter Pam","Breon Chris",2014,"Wamshuerf","DVD"));
        movies.add(new Films("Infinity war","Chris Evans",2020,"BrothersGuns","K7"));

        for (Object pessoa: clients) {
            System.out.println(pessoa);
        }
        clients.add(new Client("Miguel","Barbosa","barbosa@gmail.com"));
        System.out.println("\n--------Liste des clients----------");
        for (Object pessoa: clients) {
            System.out.println(pessoa);
        }

        Client client = new Client();
        System.out.println("entrer votre Nom :\t");
         client.setNom(person.next());
         person.nextLine();
        System.out.println("entrer votre Prenom :\t");
         client.setPrenom(person.next());
         person.nextLine();
        System.out.println("entrer votre Email :\t");
         client.setMail(person.next());

        System.out.println("nouveau client ajouter :");
        System.out.println(client.toString());





        MovieLouer movieLouer = new MovieLouer();
        movieLouer.client = new Client("Fofa","Clemente","clemente@yahoo.com");
        movieLouer.films = new Films("Petter Pam","Breon Chris",2014,"Wamshuerf","DVD");

        System.out.println("\n-----Liste de Filmes Louer avec l'affectation du client-----------");
        System.out.println(movieLouer);
    }
}
