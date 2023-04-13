package com.company;

import java.io.Serializable;
import java.util.ArrayList;

public class Films implements Serializable {
    private String NomFilm;
    private String FirstActeur;
    private int AnneeSortie;
    private String realisateur;
    private String support;

    public Films(String nomFilm, String firstActeur, int anneeSortie, String realisateur,String support) {
        NomFilm = nomFilm;
        FirstActeur = firstActeur;
        AnneeSortie = anneeSortie;
        this.realisateur = realisateur;
        this.support=support;

    }


    public Films() {
        NomFilm = "superman";
        FirstActeur = "Henry Cavill";
        AnneeSortie = 2016;
        this.realisateur = "Richard Donner";
        this.support="K7";
        NomFilm = "Batman";
        FirstActeur = "Bruce Wayne";
        AnneeSortie = 2016;
        this.realisateur = "Richard Donner";
        this.support="DVD";

    }

    public String getNomFilm() {
        return NomFilm;
    }

    public void setNomFilm(String nomFilm) {
        NomFilm = nomFilm;
    }

    public String getFirstActeur() {
        return FirstActeur;
    }

    public void setFirstActeur(String firstActeur) {
        FirstActeur = firstActeur;
    }

    public int getAnneeSortie() {
        return AnneeSortie;
    }

    public void setAnneeSortie(int anneeSortie) {
        AnneeSortie = anneeSortie;
    }

    public String getRealisateur() {
        return realisateur;
    }

    public void setRealisateur(String realisateur) {
        this.realisateur = realisateur;
    }

    public String getSupport() {
        return support;
    }

    public void setSupport(String support) {
        this.support = support;
    }

    public void recherche(String nom) {
        System.out.println("result de la recherche du film "+nom);
        if (nom.equals(getNomFilm().toLowerCase())) {
            System.out.println(
                    "NomFilm='" + NomFilm + '\'' +
                    ", FirstActeur='" + FirstActeur + '\'' +
                    ", AnneeSortie=" + AnneeSortie +
                    ", realisateur='" + realisateur + '\'' +
                    ", support='" + support + '\'' +
                    '.');
        }else if (!nom.equals(getNomFilm())){
            System.out.println("impossible de faire la recherche de ce film car il n'existe pas");
        }
    }
    public void supprimer(String nom){
        if(nom.equals(getNomFilm().toLowerCase())){
            NomFilm="";
            FirstActeur="";
            AnneeSortie=0;
            realisateur="";
            support="";
            System.out.println("objet supprimer avec success !");


        }else if (!nom.equals(getNomFilm())){
            System.out.println("impossible de supprimer ce film car il n'existe pas");
        }
    }

    @Override
    public String toString() {
        return "Liste des Films :" +
                "NomFilm='" + NomFilm + '\'' +
                ", FirstActeur='" + FirstActeur + '\'' +
                ", AnneeSortie=" + AnneeSortie +
                ", realisateur='" + realisateur + '\'' +
                ", support='" + support + '\'' +
                '.';
    }
    public void support() {
       String[] nom = {"DVD", "K7"};
    }


}
