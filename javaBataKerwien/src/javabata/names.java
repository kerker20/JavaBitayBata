/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabata;

import java.util.Random;

/**
 *
 * @author 2ndyrGroupC
 */
public class names {  
      static String[] words = {"junmar","kerwien","melchor","juan","rehnan","dave","patrick","martin","dexter","miguel","joselito","guian"};
      static String[] hints = {"Bansay kaayo bisan asa ibutang sa Ginoo","Ganahan og anime...hentai","dakog tiyan...pero bansay","I could be the Laaastttt!","Naay uyab sa C2 javahog","Sigeg padakog lawas","Randy Boyy","babayedor","Sungogan nga taas kusog mukatawa..naa sa Java","taas pag tiil ni dave","Javascript","putol kamot"}; 
      int attempts = 0;
      static int lives = 5;
      //static boolean gameOver=false;
      boolean focalPoint = true;
      
    public int generateVal(){
            Random value = new Random();
            int randomGuess=value.nextInt(words.length); 
            return randomGuess;
        }
}
