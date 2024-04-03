/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soireepetanque.model;

import java.util.ArrayList;

/**
 *
 * @author Axel Laisney
 */
public class Equipe {
    private int Numero;
    private ArrayList<Joueur> Ljoueurs = new ArrayList<Joueur>();
    private int Score;

    public int getScore() {
        return Score;
    }

    public void setScore(int Score) {
        this.Score = Score;
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    public ArrayList<Joueur> getLjoueurs() {
        return Ljoueurs;
    }

    public void setLjoueurs(Joueur joueur) {
        Ljoueurs.add(joueur);
    }
    
    public Equipe(int numero){
        this.Numero = numero;
        this.Score = 0;
    }
}
