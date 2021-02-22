/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabata;

/**
 *
 * @author 2ndyrGroupC
 */
public class Test {
    
    public static void main (String args[]){
        
        Mytime t1 = new Mytime(12,59,53); 
        t1.tickBySecond();
        
        t1.displayTime24();
    }
    
}
