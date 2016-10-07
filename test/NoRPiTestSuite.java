
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Suite of tests that can be run local without RPi.
 * Add relevant classes below
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
    edu.ccsu.cs417.grovedemo.LedDemoTest.class
})
public class NoRPiTestSuite {
}
