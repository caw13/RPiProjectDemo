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
            Led led = new Led(3);
            led.turnOn();
            Thread.sleep(1000);
            led.turnOff();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
