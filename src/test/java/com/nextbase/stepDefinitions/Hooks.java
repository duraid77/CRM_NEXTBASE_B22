package com.nextbase.stepDefinitions;

import com.nextbase.utlity.ConfigurationReader;
import com.nextbase.utlity.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {
    @Before
    public void setup(){
        Driver.getDriver().get(ConfigurationReader.getProperty("nextBaseUrl"));

    }

    @After
    public void tearDownScenario(Scenario scenario) {

        //IF MY SCENARIO FAILS
        // TAKE A SCREENSHOT


        //scenario.isFailed() --> if scenario fails : returns true

        if (scenario.isFailed()) {

            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());

        }

        //Driver.closeDriver();


    }
}
