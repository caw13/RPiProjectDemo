/**
 * TODO: Implement "watch" and "stream" methods, such as the Node.js library
 */
package com.dexterind.grovepi.sensors.base;

import java.io.IOException;

import com.dexterind.grovepi.*;
import com.dexterind.grovepi.utils.*;
import com.pi4j.io.i2c.I2CFactory;

public class Sensor {
  protected Board board;
  
  public Sensor() throws IOException, InterruptedException, I2CFactory.UnsupportedBusNumberException {
    board = Board.getInstance();
  }
  
  public byte[] readBytes() throws IOException { byte[] ret = {}; return ret; }
  public boolean write() throws IOException { return true; }
}