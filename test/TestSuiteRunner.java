
import edu.ccsu.cs417.GlobalTestVariables;
import java.io.FileInputStream;
import java.lang.reflect.Field;
import java.util.Properties;
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
            // Read environment configuration from "environment.properties"
            FileInputStream environmentProperties = new FileInputStream("config/environment.properties");
            Properties props = new Properties();
            props.load(environmentProperties);
            for (String key : props.stringPropertyNames()) {
                Field environmentSetting = GlobalTestVariables.class.getField(key);
                environmentSetting.setBoolean(null, Boolean.parseBoolean(props.getProperty(key)));
                System.out.println("Set " + key + " to " + Boolean.parseBoolean(props.getProperty(key)));
            }
            // If no test suites specified run a default test suite
            if (args.length == 0) {
                System.out.println("You can specify multiple test suites to run space separated");
                System.out.println("None specified, running default: NoRPiTestSuite");
                args = new String[]{"NoRPiTestSuite"};
            }
            // Loop through and execute all specified suites
            for (String suiteName : args) {
                Result result = JUnitCore.runClasses(Class.forName(suiteName));
                for (Failure fail : result.getFailures()) {
                    System.out.println(fail.toString());
                }
                if (result.wasSuccessful()) {
                    System.out.println("All tests finished successfully...");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
