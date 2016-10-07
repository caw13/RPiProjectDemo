
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author cw1491
 */
public class TestSuiteRunner {

    public static void main(String[] args) {
        try {
            if (args.length == 0) {
                System.out.println("Enter test suites to run");
            } else {
                for (String suiteName : args) {
                    Result result = JUnitCore.runClasses(Class.forName(suiteName));
                    for (Failure fail : result.getFailures()) {
                        System.out.println(fail.toString());
                    }
                    if (result.wasSuccessful()) {
                        System.out.println("All tests finished successfully...");
                    }

                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
