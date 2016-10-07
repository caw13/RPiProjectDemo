
import edu.ccsu.cs416.GlobalTestVariables;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Suite of tests that must be on RPi to run.
 * Add relevant classes below
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
    edu.ccsu.cs416.grovedemo.LedDemoTest.class
})
public class RPiTestSuite {

    public RPiTestSuite() {
        GlobalTestVariables.TEST_PI_CODE = true;
        edu.ccsu.cs416.grovedemo.LedDemoTest.HARDWARE_CONNECTED = true;
    }
}
