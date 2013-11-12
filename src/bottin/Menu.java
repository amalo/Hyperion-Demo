/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bottin;

import java.util.Arrays;
import java.util.Vector;

import java.util.ArrayList;


/**
 *
 * @author Julie
 */
public class Menu {
    Vector<IOperation> vecOps = new Vector<IOperation>();
    
    public void AjouterOperation(IOperation nouvelleOperation)
    {
        boolean bOperationExistante = false;
        int nOpsIndex = 0;
        for (; nOpsIndex < vecOps.size(); nOpsIndex++)
        {
            IOperation operationCourrante = vecOps.get(nOpsIndex);
            if (operationCourrante.GetName() == nouvelleOperation.GetName())
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
            int nbOption = operation.GetNbOptions();
            int indexOption = 0;
            for (; indexOption < nbOption; indexOption++)
            {
                System.out.print(" : " + operation.GetOption(indexOption));
            }
            System.out.println("");
        }
        System.out.println("Écrire \"Sortie\" pour terminer.");
    }
    
    public boolean ExecuterCommande(String commande)
    {
        boolean terminerMenu = false;
        ArrayList<String> aArguments = new ArrayList<String>(Arrays.asList(commande.split("\\s+")));
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
                    if(operation.GetName() == operationDemande)
                    {
                        operation.Execute(aArguments);
                        break;
                    }
                }
            }
        }
        
        return terminerMenu;
    }
}
