/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bottin;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Julie
 */
public class Menu {
    private ArrayList<IOperation> vecOps = new ArrayList<>();
    
    public void AjouterOperation(IOperation nouvelleOperation)
    {
        boolean bOperationExistante = false;
        for (IOperation operation : vecOps)
        {
            if (operation.GetName().matches(nouvelleOperation.GetName()))
            {
                bOperationExistante = true;
                break;
            }
        }
        
        if (!bOperationExistante)
        {
            vecOps.add(nouvelleOperation);
        }
    }
    
    public void PresenterMenu()
    {
        for (IOperation operation : vecOps)
        {
            System.out.print(operation.GetName());
            for (String option : operation.GetOption())
            {
                System.out.print(" : " + option);
            }
            System.out.println("");
        }
        System.out.println("Écrire \"Sortie\" pour terminer.");
    }
    
    public boolean ExecuterCommande(String commande)
    {
        boolean terminerMenu = false;
        ArrayList<String> aArguments = new ArrayList<>(Arrays.asList(commande.split("\\s+")));
        if (aArguments.size() > 0)
        {
            String operationDemande = aArguments.get(0);
            aArguments.remove(0);
            if (operationDemande.matches("Sortie"))
            {
                terminerMenu = true;
            }
            else
            {
                for (IOperation operation : vecOps)
                {
                    if(operation.GetName().matches(operationDemande))
                    {
                        if (operation.Execute(aArguments) <0 )
                        {
                            System.out.println("Could not execute command");
                        }
                        break;
                    }
                }
            }
        }
        
        return terminerMenu;
    }
}
