package linnbank51.stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import linnbank51.utilities.Driver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


public class Hooks {
    /*
     * Hooks has @Before and @After methods
     * We use hooks for taking screenshots
     * In our framework, our hooks is taking the screenshots of failed scenarios.
     * */
    @Before
    public void setUp(){
//        System.out.println("This is @Before Method");
    }

    @After
    public void tearDown(Scenario scenario){
//        System.out.println("This is @After Method");
        /*
         * This method will take the screenshot IF THE SCENARIO FAILS*/
//        Taking screenshot
        final byte[] screenshot=((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
//        Attaching the screenshot to the reports if scenario fails
        if (scenario.isFailed()){
            scenario.attach(screenshot,"image/png","ScreenShot ");
        }
    }
}