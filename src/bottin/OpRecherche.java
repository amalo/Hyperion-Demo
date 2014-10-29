/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bottin;

import java.util.ArrayList;

/**
 *
 * @author Julie
 */
public class OpRecherche implements IOperation{
    private Enregistrement m_Registre;
    private ArrayList<String> options = new ArrayList<>();

    public OpRecherche(Enregistrement registre) {
        m_Registre = registre;
        
        options.add("nom");
    }
    
    public String GetName()
    {
        return "Recherche";
    }
    public int Execute(ArrayList<String> args)
    {
        int result = -1;
        
        String commande = args.get(0);
        args.remove(0);
        
        if (commande.matches(options.get(0)))
        {
            result = RechercheParNom(args);
        }
        return result;
    }
    
    public ArrayList<String> GetOption() {
        return options;
    }    
    
    private int RechercheParNom(ArrayList<String> args)
    {
        if (m_Registre.GetRecords().contains(args.get(0)))
        {
            System.out.println("Le bottin contient l'élément " + args.get(0));
            
        }
        else
        {
            System.out.println("Le bottin ne contient pas l'élément " + args.get(0));
        }
        
        return 1;
    }
}
