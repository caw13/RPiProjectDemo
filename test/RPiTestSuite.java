
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Suite of tests that must be on RPi to run.
 * Add relevant classes below
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
    edu.ccsu.cs417.grovedemo.LedDemoTest.class
})
public class RPiTestSuite {

}
