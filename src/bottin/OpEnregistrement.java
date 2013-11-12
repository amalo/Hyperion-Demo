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
public class OpEnregistrement implements IOperation{
    private Enregistrement m_Registre;

    public OpEnregistrement(Enregistrement registre) {
        m_Registre = registre;
    }
    
    public enum EOption
    {
        eAJOUTER,
        eRETIRER,
        eMODIFIER
    }
    public String GetName()
    {
        return "Enregistrement";
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
            case 0: return "ajouter";
            case 1: return "retirer";
            case 2: return "modifier";
        }
        return "";
    }
    
    private int AjouterEnregistrement(ArrayList<String> args)
    {
        int result = -1;
        return result;
    }
    
    private int RetirerEnregistrement(ArrayList<String> args)
    {
        int result = -1;
        return result;
    }
    
    private int ModifierEnregistrement(ArrayList<String> args)
    {
        int result = -1;
        return result;
    }
}
