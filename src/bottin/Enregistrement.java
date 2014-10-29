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
public class Enregistrement {
    ArrayList<String> m_Records = new ArrayList<>();
    
    public int AddRecord(String newName)
    {
        int result = -1;
        
        if (!m_Records.contains(newName))
        {
            m_Records.add(newName);
            System.out.println("Nouvel enregistrement: " + newName);
            result = 1;
        }
        
        return result;
    }
    
    public ArrayList<String> GetRecords()
    {
        return m_Records;
    }
}
