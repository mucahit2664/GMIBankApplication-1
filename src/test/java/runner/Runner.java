package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        strict = true,
        plugin = {
                "html:target/default-cucumber-reports",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml"
        },
        //plugin = "html:target\\default-cucumber-reports",//for windows
        features ="src/test/resources/features",
        glue = "stepdefinitions",

//        tags = "@berati",
//        tags = "@baris",
//       tags = "@US11",
//        tags = "@tugba",
//        tags = "@deniz1",
//        tags = "@fatih",
        tags = "@US22",

        dryRun = false
)
public class Runner {
}