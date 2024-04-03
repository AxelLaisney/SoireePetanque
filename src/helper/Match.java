/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import java.util.ArrayList;
import java.util.Random;
import soireepetanque.model.Equipe;

/**
 *
 * @author Axel Laisney
 */
public class Match {
    
    public void DoMatch(ArrayList<Equipe> equipeList){
        int listLength = equipeList.size();
        switch(listLength){
            case 6:
                System.out.println("----- 1ere partie -----");
                TwoVsTwo(equipeList.get(GetRightEquipe(equipeList, 1)), equipeList.get(GetRightEquipe(equipeList, 2)));
                TwoVsTwo(equipeList.get(GetRightEquipe(equipeList, 3)), equipeList.get(GetRightEquipe(equipeList, 4)));
                TwoVsTwo(equipeList.get(GetRightEquipe(equipeList, 5)), equipeList.get(GetRightEquipe(equipeList, 6)));
                System.out.println("----- 2eme partie -----");
                TwoVsTwo(equipeList.get(GetRightEquipe(equipeList, 1)), equipeList.get(GetRightEquipe(equipeList, 3)));
                TwoVsTwo(equipeList.get(GetRightEquipe(equipeList, 2)), equipeList.get(GetRightEquipe(equipeList, 6)));
                TwoVsTwo(equipeList.get(GetRightEquipe(equipeList, 4)), equipeList.get(GetRightEquipe(equipeList, 5)));
                System.out.println("----- 3eme partie -----");
                TwoVsTwo(equipeList.get(GetRightEquipe(equipeList, 1)), equipeList.get(GetRightEquipe(equipeList, 4)));
                TwoVsTwo(equipeList.get(GetRightEquipe(equipeList, 5)), equipeList.get(GetRightEquipe(equipeList, 2)));
                TwoVsTwo(equipeList.get(GetRightEquipe(equipeList, 3)), equipeList.get(GetRightEquipe(equipeList, 6)));
                System.out.println("----- 4eme partie -----");
                TwoVsTwo(equipeList.get(GetRightEquipe(equipeList, 1)), equipeList.get(GetRightEquipe(equipeList, 5)));
                TwoVsTwo(equipeList.get(GetRightEquipe(equipeList, 6)), equipeList.get(GetRightEquipe(equipeList, 4)));
                TwoVsTwo(equipeList.get(GetRightEquipe(equipeList, 2)), equipeList.get(GetRightEquipe(equipeList, 3)));
                
                resultat(equipeList);
                break;
                
            case 8:
                System.out.println("----- 1ere partie -----");
                TwoVsTwo(equipeList.get(GetRightEquipe(equipeList, 1)), equipeList.get(GetRightEquipe(equipeList, 2)));
                TwoVsTwo(equipeList.get(GetRightEquipe(equipeList, 3)), equipeList.get(GetRightEquipe(equipeList, 4)));
                TwoVsTwo(equipeList.get(GetRightEquipe(equipeList, 5)), equipeList.get(GetRightEquipe(equipeList, 6)));
                TwoVsTwo(equipeList.get(GetRightEquipe(equipeList, 7)), equipeList.get(GetRightEquipe(equipeList, 8)));
                System.out.println("----- 2eme partie -----");
                TwoVsTwo(equipeList.get(GetRightEquipe(equipeList, 1)), equipeList.get(GetRightEquipe(equipeList, 3)));
                TwoVsTwo(equipeList.get(GetRightEquipe(equipeList, 2)), equipeList.get(GetRightEquipe(equipeList, 4)));
                TwoVsTwo(equipeList.get(GetRightEquipe(equipeList, 5)), equipeList.get(GetRightEquipe(equipeList, 7)));
                TwoVsTwo(equipeList.get(GetRightEquipe(equipeList, 6)), equipeList.get(GetRightEquipe(equipeList, 8)));
                System.out.println("----- 3eme partie -----");
                TwoVsTwo(equipeList.get(GetRightEquipe(equipeList, 1)), equipeList.get(GetRightEquipe(equipeList, 4)));
                TwoVsTwo(equipeList.get(GetRightEquipe(equipeList, 2)), equipeList.get(GetRightEquipe(equipeList, 3)));
                TwoVsTwo(equipeList.get(GetRightEquipe(equipeList, 5)), equipeList.get(GetRightEquipe(equipeList, 8)));
                TwoVsTwo(equipeList.get(GetRightEquipe(equipeList, 6)), equipeList.get(GetRightEquipe(equipeList, 7)));
                System.out.println("----- 4eme partie -----");
                TwoVsTwo(equipeList.get(GetRightEquipe(equipeList, 1)), equipeList.get(GetRightEquipe(equipeList, 5)));
                TwoVsTwo(equipeList.get(GetRightEquipe(equipeList, 2)), equipeList.get(GetRightEquipe(equipeList, 8)));
                TwoVsTwo(equipeList.get(GetRightEquipe(equipeList, 3)), equipeList.get(GetRightEquipe(equipeList, 7)));
                TwoVsTwo(equipeList.get(GetRightEquipe(equipeList, 4)), equipeList.get(GetRightEquipe(equipeList, 6)));
                
                resultat(equipeList);
                break;
                
            case 10:
                System.out.println("----- 1ere partie -----");
                TwoVsTwo(equipeList.get(GetRightEquipe(equipeList, 1)), equipeList.get(GetRightEquipe(equipeList, 2)));
                TwoVsTwo(equipeList.get(GetRightEquipe(equipeList, 3)), equipeList.get(GetRightEquipe(equipeList, 4)));
                TwoVsTwo(equipeList.get(GetRightEquipe(equipeList, 5)), equipeList.get(GetRightEquipe(equipeList, 6)));
                TwoVsTwo(equipeList.get(GetRightEquipe(equipeList, 7)), equipeList.get(GetRightEquipe(equipeList, 8)));
                TwoVsTwo(equipeList.get(GetRightEquipe(equipeList, 9)), equipeList.get(GetRightEquipe(equipeList, 10)));
                System.out.println("----- 2eme partie -----");
                TwoVsTwo(equipeList.get(GetRightEquipe(equipeList, 2)), equipeList.get(GetRightEquipe(equipeList, 3)));
                TwoVsTwo(equipeList.get(GetRightEquipe(equipeList, 4)), equipeList.get(GetRightEquipe(equipeList, 5)));
                TwoVsTwo(equipeList.get(GetRightEquipe(equipeList, 6)), equipeList.get(GetRightEquipe(equipeList, 7)));
                TwoVsTwo(equipeList.get(GetRightEquipe(equipeList, 8)), equipeList.get(GetRightEquipe(equipeList, 9)));
                TwoVsTwo(equipeList.get(GetRightEquipe(equipeList, 10)), equipeList.get(GetRightEquipe(equipeList, 1)));
                System.out.println("----- 3eme partie -----");
                TwoVsTwo(equipeList.get(GetRightEquipe(equipeList, 1)), equipeList.get(GetRightEquipe(equipeList, 3)));
                TwoVsTwo(equipeList.get(GetRightEquipe(equipeList, 2)), equipeList.get(GetRightEquipe(equipeList, 4)));
                TwoVsTwo(equipeList.get(GetRightEquipe(equipeList, 9)), equipeList.get(GetRightEquipe(equipeList, 6)));
                TwoVsTwo(equipeList.get(GetRightEquipe(equipeList, 8)), equipeList.get(GetRightEquipe(equipeList, 10)));
                TwoVsTwo(equipeList.get(GetRightEquipe(equipeList, 5)), equipeList.get(GetRightEquipe(equipeList, 7)));
                System.out.println("----- 4eme partie -----");
                TwoVsTwo(equipeList.get(GetRightEquipe(equipeList, 6)), equipeList.get(GetRightEquipe(equipeList, 8)));
                TwoVsTwo(equipeList.get(GetRightEquipe(equipeList, 7)), equipeList.get(GetRightEquipe(equipeList, 9)));
                TwoVsTwo(equipeList.get(GetRightEquipe(equipeList, 10)), equipeList.get(GetRightEquipe(equipeList, 3)));
                TwoVsTwo(equipeList.get(GetRightEquipe(equipeList, 5)), equipeList.get(GetRightEquipe(equipeList, 2)));
                TwoVsTwo(equipeList.get(GetRightEquipe(equipeList, 4)), equipeList.get(GetRightEquipe(equipeList, 1)));
                
                resultat(equipeList);
                break;
                
            case 12:
                System.out.println("----- 1ere partie -----");
                TwoVsTwo(equipeList.get(GetRightEquipe(equipeList, 1)), equipeList.get(GetRightEquipe(equipeList, 2)));
                TwoVsTwo(equipeList.get(GetRightEquipe(equipeList, 3)), equipeList.get(GetRightEquipe(equipeList, 4)));
                TwoVsTwo(equipeList.get(GetRightEquipe(equipeList, 5)), equipeList.get(GetRightEquipe(equipeList, 6)));
                TwoVsTwo(equipeList.get(GetRightEquipe(equipeList, 7)), equipeList.get(GetRightEquipe(equipeList, 8)));
                TwoVsTwo(equipeList.get(GetRightEquipe(equipeList, 9)), equipeList.get(GetRightEquipe(equipeList, 10)));
                TwoVsTwo(equipeList.get(GetRightEquipe(equipeList, 11)), equipeList.get(GetRightEquipe(equipeList, 12)));
                System.out.println("----- 2eme partie -----");
                TwoVsTwo(equipeList.get(GetRightEquipe(equipeList, 1)), equipeList.get(GetRightEquipe(equipeList, 12)));
                TwoVsTwo(equipeList.get(GetRightEquipe(equipeList, 2)), equipeList.get(GetRightEquipe(equipeList, 11)));
                TwoVsTwo(equipeList.get(GetRightEquipe(equipeList, 3)), equipeList.get(GetRightEquipe(equipeList, 10)));
                TwoVsTwo(equipeList.get(GetRightEquipe(equipeList, 4)), equipeList.get(GetRightEquipe(equipeList, 9)));
                TwoVsTwo(equipeList.get(GetRightEquipe(equipeList, 5)), equipeList.get(GetRightEquipe(equipeList, 8)));
                TwoVsTwo(equipeList.get(GetRightEquipe(equipeList, 6)), equipeList.get(GetRightEquipe(equipeList, 7)));
                System.out.println("----- 3eme partie -----");
                TwoVsTwo(equipeList.get(GetRightEquipe(equipeList, 1)), equipeList.get(GetRightEquipe(equipeList, 3)));
                TwoVsTwo(equipeList.get(GetRightEquipe(equipeList, 2)), equipeList.get(GetRightEquipe(equipeList, 4)));
                TwoVsTwo(equipeList.get(GetRightEquipe(equipeList, 5)), equipeList.get(GetRightEquipe(equipeList, 7)));
                TwoVsTwo(equipeList.get(GetRightEquipe(equipeList, 6)), equipeList.get(GetRightEquipe(equipeList, 8)));
                TwoVsTwo(equipeList.get(GetRightEquipe(equipeList, 12)), equipeList.get(GetRightEquipe(equipeList, 9)));
                TwoVsTwo(equipeList.get(GetRightEquipe(equipeList, 10)), equipeList.get(GetRightEquipe(equipeList, 11)));
                System.out.println("----- 4eme partie -----");
                TwoVsTwo(equipeList.get(GetRightEquipe(equipeList, 12)), equipeList.get(GetRightEquipe(equipeList, 6)));
                TwoVsTwo(equipeList.get(GetRightEquipe(equipeList, 3)), equipeList.get(GetRightEquipe(equipeList, 8)));
                TwoVsTwo(equipeList.get(GetRightEquipe(equipeList, 11)), equipeList.get(GetRightEquipe(equipeList, 7)));
                TwoVsTwo(equipeList.get(GetRightEquipe(equipeList, 1)), equipeList.get(GetRightEquipe(equipeList, 9)));
                TwoVsTwo(equipeList.get(GetRightEquipe(equipeList, 4)), equipeList.get(GetRightEquipe(equipeList, 10)));
                TwoVsTwo(equipeList.get(GetRightEquipe(equipeList, 5)), equipeList.get(GetRightEquipe(equipeList, 2)));
                
                resultat(equipeList);
                break;
               
        }
    }
    
    public int GetRightEquipe(ArrayList<Equipe> eList, int number){
        int index = 0;
        for(Equipe e: eList){
            if(e.getNumero() == number){
                index = eList.indexOf(e);
                break;
            }
        }
        return index;
    }
    
    public void TwoVsTwo(Equipe e1, Equipe e2){
        int score1 = 0;
        int score2 = 0;
        do{
            score1 = new Random().nextInt(14);
            score2 = new Random().nextInt(14);
        } while(score1 == score2);
        
        if(score1 > score2){
            System.out.println("L'équipe n°" + e1.getNumero() + " a gagné cette manche!");
            e1.setScore((e1.getScore()+score1));
            e2.setScore((e2.getScore()+score2));
        }else if(score1 < score2){
            System.out.println("L'équipe n°" + e2.getNumero() + " a gagné cette manche!");
            e1.setScore((e1.getScore()+score1));
            e2.setScore((e2.getScore()+score2));
        }
        System.out.println("Score totaux: Equipe n°"+ e1.getNumero()+" "+ e1.getScore()+" points. Equipe n°"+ e2.getNumero()+" "+ e2.getScore()+" points.");
    }
    
    public void resultat(ArrayList<Equipe> equipe){
        Equipe vainqueur = new Equipe(13);
        for (Equipe e: equipe){
            if(e.getScore() > vainqueur.getScore()){
                vainqueur = e;
            }
        }
        
        System.out.println("L'équipe n°" + vainqueur.getNumero() + " a gagné le tournoi avec " + vainqueur.getScore() + " points.");
    }
}
