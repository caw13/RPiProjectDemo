package edu.ccsu.cs416.grovedemo;

import com.dexterind.grovepi.sensors.Led;

/**
 * Simple demo of interacting with LED in GrovePi board
 * Default is for LED to be connected to D3
 * 
 * @author caw13
 */
public class LedDemo {
    public static void main(String[] args){
        try{
            // Default is D3
            int boardNumber = 3;
            if (args.length == 1){
              boardNumber = Integer.parseInt(args[0]);
            }
            Led led = new Led(boardNumber);
            led.turnOn();
            Thread.sleep(1000);
            led.turnOff();
            for (float brightness=0;brightness<=100;brightness+=10){
                led.setBrightness(brightness);
                Thread.sleep(100);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
