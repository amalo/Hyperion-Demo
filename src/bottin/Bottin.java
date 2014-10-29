/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bottin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Julie
 */
public class Bottin 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException
    {
        Enregistrement registreBottin = new Enregistrement();
        Menu menuBottin = new Menu();
        menuBottin.AjouterOperation(new OpEnregistrement(registreBottin));
        
        menuBottin.AjouterOperation(new OpListe(registreBottin));

        boolean bSortir = false;
        while (!bSortir) 
        {
            menuBottin.PresenterMenu();

            String commande = "";

            try 
            {
                InputStreamReader converter = new InputStreamReader(System.in);
                BufferedReader in = new BufferedReader(converter);
                commande = in.readLine();
            } 
            catch (IOException ex) 
            {
                Logger.getLogger(Bottin.class.getName()).log(Level.SEVERE, null, ex);
            }

            bSortir = menuBottin.ExecuterCommande(commande);
            Thread.sleep(1);
        }
    }
    // Testing 12 12 12
}
