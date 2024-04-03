/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import java.util.Random;

/**
 *
 * @author Axel Laisney
 */
public class NomListe {
    private static final String[]ListPrenoms = {
        "Pascal",
        "Olivier",
        "Thierry",
        "Yann",
        "Antoine",
        "Baptiste",
        "Romain",
        "Guillaume",
        "Bastien",
        "Sylvain",
        "Emile",
        "Gilles",
        "Benoît",
        "Damien",
        "Emilien",
        "Lionel",
        "Maxime",
        "Armand",
        "Rémi",
        "François",
        "Adrien",
        "Loïc",
        "Yannick",
        "Hervé",
        "Arnaud",
        "Jeanne",
        "Delphine",
        "Aurélie",
        "Claire",
        "Virginie",
        "Juliette",
        "Lucie",
        "Aurore",
        "Céline",
        "Mathilde",
        "Charline",
        "Céline",
        "Manon",
        "Amélie",
        "Christelle",
        "Marine",
        "Angélique",
        "Oceane",
        "Morgane",
        "Elodie",
        "Clémence",
        "Gwenaelle",
        "Carole",
        "Leonie",
        "Clémentine"
    };
    
    private static final String[]ListNoms = {
        "Martin",
        "Bernard",
        "Thomas",
        "Petit", 
        "Robert", 
        "Richard", 
        "Durand", 
        "Dubois", 
        "Moreau", 
        "Laurent", 
        "Simon", 
        "Michel", 
        "Lefebvre", 
        "Leroy", 
        "Roux", 
        "David", 
        "Bertrand",
        "Morel", 
        "Fournier", 
        "Girard", 
        "Bonnet",
        "Dupont", 
        "Lambert", 
        "Fontaine", 
        "Rousseau", 
        "Vincent", 
        "Muller", 
        "Lefevre", 
        "Faure", 
        "Andre", 
        "Mercier", 
        "Blanc", 
        "Guerin",
        "Boyer", 
        "Garnier", 
        "Chevalier", 
        "Francois", 
        "Legrand", 
        "Gauthier", 
        "Garcia", 
        "Perrin", 
        "Robin", 
        "Clement",
        "Morin", 
        "Nicolas", 
        "Henry", 
        "Roussel", 
        "Mathieu", 
        "Gautier", 
        "Masson", 
    };
    
    public static String RandoPrenom(){
        int rInt = new Random().nextInt(ListPrenoms.length);
        return ListPrenoms[rInt];   
    };
    
    public static String RandoNom(){
        int rInt = new Random().nextInt(ListNoms.length);
        return ListNoms[rInt];
    }
}
