/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import soireepetanque.model.Equipe;
import soireepetanque.model.Joueur;

/**
 *
 * @author Axel Laisney
 */
public class DecideurEquipe {
    
    private ArrayList<Joueur> ListJoueurs = new ArrayList<Joueur>();

    public ArrayList<Equipe> generateEquipe(int nbJoueurs){
        ArrayList<Equipe> ListEquipes = new ArrayList<Equipe>();
        generateJoueurs(nbJoueurs);
        int nbTriplette = 0;
        //6 équipes
        if(nbJoueurs <= 15){
            nbTriplette = nbJoueurs - 12;
            for(int i = 1 ; i<7; i++){
                if(nbTriplette > 0){
                    Equipe e = generateEquipeOf3(i);
                    nbTriplette --;
                    ListEquipes.add(e);
                    continue;
                }else{
                    Equipe e = generateEquipeOf2(i);
                    ListEquipes.add(e);
                    continue;
                }
            }
        //8 équipes    
        }else if(nbJoueurs <= 19 && nbJoueurs > 15){
            nbTriplette = nbJoueurs - 16;
            for(int i = 1; i<9; i++){
                if(nbTriplette > 0){
                    Equipe e = generateEquipeOf3(i);
                    nbTriplette --;
                    ListEquipes.add(e);
                    continue;
                }else{
                    Equipe e = generateEquipeOf2(i);
                    ListEquipes.add(e);
                    continue;
                } 
            }
        //10 équipes    
        }else if(nbJoueurs <= 23 && nbJoueurs > 19){
            nbTriplette = nbJoueurs - 20;
            for(int i = 1; i<11; i++){
                if(nbTriplette > 0){
                    Equipe e = generateEquipeOf3(i);
                    nbTriplette --;
                    ListEquipes.add(e);
                    continue;
                }else{
                    Equipe e = generateEquipeOf2(i);
                    ListEquipes.add(e);
                    continue;
                } 
            }
        //12 équipes    
        }else if(nbJoueurs <= 37 && nbJoueurs >23){
            nbTriplette = nbJoueurs - 24;
            for(int i = 1; i<13; i++){
                if(nbTriplette > 0){
                    Equipe e = generateEquipeOf3(i);
                    nbTriplette --;
                    ListEquipes.add(e);
                    continue;
                }else{
                    Equipe e = generateEquipeOf2(i);
                    ListEquipes.add(e);
                    continue;
                } 
            }
        }else{
            System.out.print("Erreur dans le nombre de joueurs");
        }
        return ListEquipes;
    }
    
    public void generateJoueurs(int nbJoueurs){
        for (int i =0; i<nbJoueurs; i++){
            Joueur j = new Joueur();
            this.ListJoueurs.add(j);
        }
    }
    
    private Equipe generateEquipeOf2(int i){
        Equipe e = new Equipe(i);
        for(int g = 0; g<2; g++){
            int rInt = new Random().nextInt(this.ListJoueurs.size());
            Joueur j = this.ListJoueurs.get(rInt);
            e.setLjoueurs(j);
            this.ListJoueurs.remove(rInt);
            this.ListJoueurs.trimToSize();
        }
        return e;
    }
    
    private Equipe generateEquipeOf3(int i){
        Equipe e = new Equipe(i);
        for(int g = 0; g<3; g++){
            int rInt = new Random().nextInt(this.ListJoueurs.size());
            Joueur j = this.ListJoueurs.get(rInt);
            e.setLjoueurs(j);
            this.ListJoueurs.remove(rInt);
            this.ListJoueurs.trimToSize();
        }
        return e;
    }
}
