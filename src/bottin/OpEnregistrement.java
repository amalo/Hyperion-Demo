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
    private ArrayList<String> options = new ArrayList<>();

    public OpEnregistrement(Enregistrement registre) {
        m_Registre = registre;
        
        options.add("ajouter");
        options.add("retirer");
        options.add("modifier");
    }
    
    public String GetName()
    {
        return "Enregistrement";
    }
    
    public int Execute(ArrayList<String> args)
    {
        int result = -1;
        
        String command = args.get(0);
        args.remove(0);
        
        if (command.matches(options.get(0)))
        {
            result = AjouterEnregistrement(args);
        }
        else if (command.matches(options.get(1)))
        {
            result = RetirerEnregistrement(args);
        }
        else if (command.matches(options.get(3)))
        {
            result = ModifierEnregistrement(args);
        }
        
        return result;
    }
    
    public ArrayList<String> GetOption() {
        return options;
    }    
        
    private int AjouterEnregistrement(ArrayList<String> args)
    {
        int result = -1;
                
        if (args.size() == 1)
        {
            result = m_Registre.AddRecord(args.get(0));
        }
        
        return result;
    }
    
    private int RetirerEnregistrement(ArrayList<String> args)
    {
        int result = -1;
        System.out.println("Not implemented yet.");
        return result;
    }
    
    private int ModifierEnregistrement(ArrayList<String> args)
    {
        int result = -1;
        System.out.println("Not implemented yet.");
        return result;
    }
}
