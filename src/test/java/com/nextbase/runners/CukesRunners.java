package com.nextbase.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "html: target/cucumber-report.html",
        features = "src/test/resources/feature",
        glue = "com/nextbase/stepDefinitions",
        dryRun = true,
        tags = "@wip"
)


public class CukesRunners {
}

