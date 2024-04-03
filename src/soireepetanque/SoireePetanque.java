/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soireepetanque;

import helper.DecideurEquipe;
import helper.Match;
import java.util.ArrayList;
import java.util.Random;
import soireepetanque.model.Equipe;
import soireepetanque.model.Joueur;

/**
 *
 * @author Axel Laisney
 */
public class SoireePetanque {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DecideurEquipe d = new DecideurEquipe();
        Match m = new Match();
        int nbJ = new Random().nextInt(36 - 12 + 1) + 12;
        for(int i=12; i<37; i++){
        ArrayList<Equipe> lEquipe = d.generateEquipe(i);
        System.out.println("Nombre de joueurs:"+i);
        m.DoMatch(lEquipe);
        }
    }
    
}
