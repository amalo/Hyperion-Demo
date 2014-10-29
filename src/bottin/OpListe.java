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
public class OpListe implements IOperation{
    private Enregistrement m_Registre;
    private ArrayList<String> options = new ArrayList<>();

    public OpListe(Enregistrement registre) {
        m_Registre = registre;
        
        options.add("tous");
    }
    
    public String GetName()
    {
        return "Liste";
    }
    public int Execute(ArrayList<String> args)
    {
        int result = -1;
        
        String command = args.get(0);
        args.remove(0);
        
        if (command.matches(options.get(0)))
        {
            result = ListeTous();
        }
        return result;
    }
    
    public ArrayList<String> GetOption() {
        return options;
    }    
    
    private int ListeTous()
    {
        int result = -1;
        if (m_Registre.GetRecords().size() > 0)
        {
            for (String records : m_Registre.GetRecords())
            {
                System.out.println("Record found: " + records);
            }

            System.out.println("Done printing record.");
            result = 1;
        }
        
        return result;
    }
}
