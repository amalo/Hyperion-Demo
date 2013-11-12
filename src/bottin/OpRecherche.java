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

    public OpRecherche(Enregistrement registre) {
        m_Registre = registre;
    }
    
    public enum EOption
    {
        eNOM,
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
    public int GetNbOptions()
    {
        return EOption.values().length;
    }
    public String GetOption(int nOption)
    {
        switch (nOption)
        {
            case 0: return "nom";
        }
        return "";
    }
    
    private int RechercheParNom(ArrayList<String> args)
    {
        int result = -1;
        return result;
    }
}
