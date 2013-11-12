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
public interface IOperation {
    String GetName();
    int Execute(ArrayList<String> args);
    int GetNbOptions();
    String GetOption(int nOption);
}
