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
    private ArrayList<String> m_Options = new ArrayList<>();

    public OpRecherche(Enregistrement registre) {
        m_Registre = registre;
        
        m_Options.add("nom");
    }
    
    public String GetName()
    {
        return "Recherche";
    }
    public int Execute(ArrayList<String> args)
    {
        int result = -1;
        return result;
    }
    
    public ArrayList<String> GetOption() {
        return m_Options;
    }    
    
    private int RechercheParNom(ArrayList<String> args)
    {
        int result = -1;
        System.out.println("N'est pas implémenté.");
        return result;
    }
}
