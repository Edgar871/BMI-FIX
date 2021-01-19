/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idealbmi.Model;

/**
 *
 * @author Asus
 */
public class Operation extends ModelProgram{
    public double operation (double a, double b){
        return a/Math.pow(b/100, 2);
    }
    
}
