/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabata;

import java.util.Scanner;

/**
 *
 * @author 2ndyrGroupC
 */
public class game extends names {

    Scanner input = new Scanner(System.in);

    public void displayCurrentWork(String word, boolean[] guessList) {
        for (int i = 0; i < word.length(); i++) {
            System.out.print((guessList[i] ? word.charAt(i) : "_") + " ");
        }
        System.out.println("");

    }

    public boolean checkGuess(String word, boolean[] guessList, char guess) {
        boolean retVal = false;
        for (int i = 0; i < word.length(); i++) {
            if (guess == word.charAt(i)) {
                guessList[i] = retVal = true;

            }
        }
        return retVal;

    }

    public char guess() {
        
        String temp;
        System.out.println("\n");
        System.out.print("Enter your guess letter: ");
        temp = input.nextLine().toLowerCase();

        return temp.charAt(0);
    }
    
    void gameAllover(int lives){
        if(lives==0){
            System.out.println("Bitay KANA!");
        }
    }

    public boolean checkUp(boolean[] guessList) {
        for (int i = 0; i < guessList.length; i++) {
            if (!guessList[i]) {
                return true;
            }
        }
        return false;
    }
    void displayGameOver(){
        if(lives!=0){
         System.out.print("\nWould you like to guess again? \nyes or no: ");
                String result=input.nextLine().toLowerCase();
                switch(result){
                    
                    case "yes":
                        newGame gameAgain = new newGame();
//                        if(gameOver){
//                            //System.out.println("jkfhk");
//                            lives=5;
//                        }
//                        
                        
                       // System.out.println("FAil!");
                        gameAgain.check();
                        break;
                    case "no":
                        System.out.println("\n🖕😡🖕");
                        focalPoint = false;
                        break;
                    default:
                        System.out.println("Invalid Input");
                        displayGameOver();
                }
                
    }
    }
 
}
