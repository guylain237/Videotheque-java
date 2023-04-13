package com.company;

import java.io.Serializable;

public class Client implements Serializable {
    private String nom;
    private String prenom;
    private String mail;


    public Client(String nom, String prenom, String mail) {
        this.nom = nom;
        this.prenom = prenom;
        this.mail = mail;
    }

    public Client() {
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
    public String LouerMovie(){

     return LouerMovie();
    }
    @Override
    public String toString() {
        return "Client{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", mail='" + mail + '\'' +
                '}';
    }

}
