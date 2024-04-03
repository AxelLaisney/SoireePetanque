/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soireepetanque.model;
import helper.NomListe;
import java.util.Random;

/**
 *
 * @author Axel Laisney
 */
public class Joueur {

    public String getNom() {
        return Nom;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public void setPrenom(String Prenom) {
        this.Prenom = Prenom;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }
    private String Nom;
    private String Prenom;
    private int Age;

    public Joueur() {
        this.Nom = NomListe.RandoNom();
        this.Prenom = NomListe.RandoPrenom();
        this.Age = new Random().nextInt(76 - 16 + 1) + 16;
    }
    
    
    
}
