/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ccsu.cs417.grovedemo;

import edu.ccsu.cs417.grovedemo.LedDemo;
import edu.ccsu.cs417.GlobalTestVariables;
import junit.framework.TestCase;
import org.junit.Test;

/**
 * To execute this test an Led should be connected to port D3
 *
 * @author Chad Williams
 */
public class LedDemoTest extends TestCase {

    /**
     * This variable allows you to easily turn on/off all tests that are
     * dependent on the related hardware device for this test being connected
     */
    

    public LedDemoTest(String testName) {
        super(testName);
    }

    /**
     * Test of runDemo method, of class LedDemo.
     */
    @Test
    public void testRunDemo() throws Exception {
        if (GlobalTestVariables.TEST_PI_CODE && GlobalTestVariables.LED_D3_CONNECTED) {
            System.out.println("LedDemo runDemo");
            try {
                LedDemo instance = new LedDemo(3);
                instance.runDemo();
            } catch (Exception e) {
                fail("Fail runDemo, Exception " + e.getMessage() + " make sure an Led is plugged into D3");
            }
        }
    }
}
