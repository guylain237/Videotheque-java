package com.company;

import java.awt.image.DataBuffer;
import java.io.*;

public class MainFile {
    public static void main(String[] args){

/*
fichiers fich = new fichiers("FilmsFichier.txt");
Films[] result =fichiers.getContent();
for(int i =0;i< result.length ; i++){
    System.out.println(result[i]);
}
*/









        String path="C:/sauvegarde/filmsserialise.txt";
       ObjectInputStream ois;
        ObjectOutputStream oos;
        try{
            oos = new ObjectOutputStream(
                    new BufferedOutputStream(
                            new FileOutputStream(
                                    new File(path)
                            )
                    )
            );
           oos.writeObject(new Films("Batman", "Bruce Wayne", 2016, "Richard Donner", "Cle-USB"));
           oos.writeObject(new Films("Avenger", "Tony Start", 2010, "Joss Whedon", "Blue-ray"));
           oos.writeObject(new Films("Spiderman", "Harry paker", 2008, "Sam Raimi", "DVD"));
            oos.writeObject(new Films("Batman", "Bruce Wayne", 2016, "Richard Donner", "Cle-USB"));
            oos.writeObject(new Films("Avenger", "Tony Start", 2010, "Joss Whedon", "Blue-ray"));
            oos.writeObject(new Films("Spiderman", "Harry paker", 2008, "Sam Raimi", "DVD"));
            oos.writeObject(new Films("Batman", "Bruce Wayne", 2016, "Richard Donner", "Cle-USB"));
            oos.writeObject(new Films("Avenger", "Tony Start", 2010, "Joss Whedon", "Blue-ray"));
            oos.writeObject(new Films("Spiderman", "Harry paker", 2008, "Sam Raimi", "DVD"));
            oos.writeObject(new Films("Batman", "Bruce Wayne", 2016, "Richard Donner", "Cle-USB"));
            oos.writeObject(new Films("Avenger", "Tony Start", 2010, "Joss Whedon", "Blue-ray"));
            oos.writeObject(new Films("Spiderman", "Harry paker", 2008, "Sam Raimi", "DVD"));
oos.close();

ois = new ObjectInputStream(
        new BufferedInputStream(
                new FileInputStream(
                        new File(path)
                )
        )
);
try {
    System.out.println("AFFICHAGE DES FILMS SERIALISER");
    System.out.println(((Films)ois.readObject()).toString());
    System.out.println(((Films)ois.readObject()).toString());
    System.out.println(((Films)ois.readObject()).toString());
    System.out.println(((Films)ois.readObject()).toString());
    System.out.println(((Films)ois.readObject()).toString());
    System.out.println(((Films)ois.readObject()).toString());
    System.out.println(((Films)ois.readObject()).toString());
    System.out.println(((Films)ois.readObject()).toString());
    System.out.println(((Films)ois.readObject()).toString());
    System.out.println(((Films)ois.readObject()).toString());
    System.out.println(((Films)ois.readObject()).toString());
    System.out.println(((Films)ois.readObject()).toString());
    System.out.println(((Films)ois.readObject()).toString());
}catch (ClassNotFoundException e)
{
    e.printStackTrace();
}
ois.close();
        } catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }catch (IOException e){
            e.getMessage();
        }

    }
}
