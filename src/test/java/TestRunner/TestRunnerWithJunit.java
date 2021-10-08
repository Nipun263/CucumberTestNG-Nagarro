package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\nipunverma\\Desktop\\CucumberDemo\\src\\test\\java\\Feature\\FeatureWithTags.feature",
glue = {"StepDefination" }, tags = "@Smoke and @Sanity")



public class TestRunnerWithJunit  {

}


