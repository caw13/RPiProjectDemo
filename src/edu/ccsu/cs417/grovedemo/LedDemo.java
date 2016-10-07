package edu.ccsu.cs417.grovedemo;

import com.dexterind.grovepi.sensors.Led;
import com.pi4j.io.i2c.I2CFactory;
import java.io.IOException;

/**
 * Simple demo of interacting with LED in GrovePi board Default is for LED to be
 * connected to D3
 *
 * @author caw13
 */
public class LedDemo {

    private final int boardNumber;

    public LedDemo(int boardNumber) {
        this.boardNumber = boardNumber;
    }

    public void runDemo() throws IOException, InterruptedException, I2CFactory.UnsupportedBusNumberException {
        Led led = new Led(boardNumber);
        led.turnOn();
        Thread.sleep(1000);
        led.turnOff();
        for (float brightness = 0; brightness <= 100; brightness += 10) {
            led.setBrightness(brightness);
            Thread.sleep(100);
        }
        led.turnOff();
    }

    public static void main(String[] args) {
        try {
            // Default is D3
            int boardNumber = 3;
            if (args.length == 1) {
                boardNumber = Integer.parseInt(args[0]);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
