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
public class Mytime {

    private int minute;
    private int hours;
    private int second;
    private int meridian;// 0 as AM; 1 as Noon; 2 as PM; 3 as Midnight

    public Mytime() {

    }

    public Mytime(int hours, int minute, int second) {
        this.setHour(hours);
        this.setMinute(minute);
        this.setSecond(second);
    }

    //Setter
    public void setHour(int hours) {
        this.hours = hours < 24 && hours >= 0 ? hours : 0;
    }


    public void setMinute(int minute) {
        this.minute = minute <60 && minute >= 0 ? minute : 0;
    }

    
    public void setSecond(int second) {
        this.second = second < 60 && second >= 0 ? second : 0;
    }

    

    //Getter
    public int getHour() {
        return hours;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public Mytime(int minute, int hours, int second, int meridian) {
        this.minute = minute;
        this.hours = hours;
        this.second = second;
        this.meridian = meridian;
    }

    public void displayTime24() {
        System.out.printf("%02d:%02d:%02d\n" ,hours,minute,second);
    }
     public void tickBySecond() {
       second++;
       if (second > 59) {
           second=0;
           tickByMinute();
       }

   }

   public void tickByHours() {
       hours++;
       if (hours > 24) {
           hours=0;

       }
   }

   public void tickByMinute() {
       minute++;
       if (minute > 59) {
           minute = 0;
           tickByHours();
       }
   }
}
   

