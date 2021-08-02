package com.nextbase.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = "html: target/cucumber-report.html",
        features = "src/test/resources/feature",
        glue = "com/nextbase/stepDefinitions",
        dryRun = false,

        tags = "@TS_002"

       // tags = "@US2_TS-002_Berk"
        tags = "@US1_TS_002_Maria"

)

public class CukesRunners {
}

