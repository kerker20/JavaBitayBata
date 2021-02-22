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
public class newGame extends names{
        names n = new names();
        int randomGuess = n.generateVal();
        String word = n.words[randomGuess];
        String word1 = word.toLowerCase();
        boolean[] guessList = new boolean[word1.length()];
        
        game g = new game();
        
        public void check(){
            
            System.out.println("\nWelcome to Hikog Challenge");
            System.out.println("Try to guess this person: ");
            System.out.println("\n");
            
            System.out.println("Hints: "+n.hints[randomGuess]);   
            
            
            
            while(lives>0&&focalPoint){
                g.displayCurrentWork(word1,guessList);
            if(!g.checkUp(guessList)&&g.focalPoint){
                System.out.println("\n\nCongrats you guess the name: "+words[randomGuess]);
                
                g.displayGameOver();
                break;
            }
            if(g.checkUp(guessList)){
                
               
            if(!g.checkGuess(word1,guessList,g.guess())){
                System.out.println("You have "+(--g.lives)+" left");
                if ( (g.lives) == 5) {
               System.out.println("         ____________");
                System.out.println("        |      |     |");
               System.out.println("         |      😛    |");
              System.out.println("          |      👘     |");
                System.out.println("        |            |");
                System.out.println("        |            |");
                System.out.println("         ____________");
                System.out.print("\n");
                }else if ((g.lives) == 4) {
                System.out.println("         ____________");
                System.out.println("        |      |     |");
                System.out.println("        |      😛     |");
                System.out.println("        |      👘     |");
                System.out.println("        |            |");
               System.out.println("         |            |");
                System.out.println("         ____________");
               System.out.print("\n");
            } else if ((g.lives) == 3) {
                System.out.println("         ____________");
                System.out.println("        |      |     |");
                System.out.println("        |      😛     |");
                System.out.println("        |     -👘>    |");
                System.out.println("        |            |");
                System.out.println("        |            |");
                System.out.println("        |____________");
                System.out.print("\n");
            } else if ((g.lives) == 2) {
                System.out.println("         ____________");
                System.out.println("        |      |     |");
                System.out.println("        |      😛     |");
                System.out.println("        |     -👘>    |");
                System.out.println("        |      👖     |");
                System.out.println("        |            |");
                System.out.println("        |____________");
                System.out.print("\n");
            }else if ((g.lives) == 1) {
                System.out.println("         ____________");
                System.out.println("        |      |     |");
                System.out.println("        |      😛     |");
                System.out.println("        |     -👘>    |");
                System.out.println("        |      👖     |");
                System.out.println("        |     👢 👢   |");
                System.out.println("        |____________");
                System.out.print("\n");
            }
            if ((g.lives) == 0) {
            System.out.println("         ____________");
            System.out.println("        |      |     |");
            System.out.println("        |  👻  💀   👻 |");
            System.out.println("        |     -👘>    |");
            System.out.println("        |      👖     |");
            System.out.println("        |  👻  //  \\ |");
            System.out.println("         ____________");
            System.out.print("\n");
            System.out.println("Sorry, The Bata was Bitay2x and Patay2x. GAME OVER!");
            System.out.println("\nThe right name was: "+words[randomGuess]);
            //gameOver=true;
            g.displayGameOver();
            
        }
            
    }
            }else{
               // System.out.println("jhjh");
                g.displayGameOver();
               // break;
                    
            }
                    //
         
            }
            
        }
}
        


      
