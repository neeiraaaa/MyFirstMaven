package suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import people.AutomatedEngineerTest;
import people.ManualTestAge;

@Suite.SuiteClasses({ManualTestAge.class, AutomatedEngineerTest.class})
@RunWith(Suite.class)

public class PeopleSuite {


}
