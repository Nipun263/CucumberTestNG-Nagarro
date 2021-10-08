package TestRunner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


//@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\nipunverma\\Desktop\\CucumberDemo\\src\\test\\java\\Feature\\FeatureWithTags.feature",
glue = {"StepDefination" }, tags = "@Smoke and @Sanity")



public class TestRunnerWithTestNG extends AbstractTestNGCucumberTests {

}



//Notes :

//Always extends AbstractClass as we did on line 15 - to run the testRunner with testNG
//When ever you want to run your Cuucmber Project with TestNG then first change the annotation at top (import io.cucumber.testng.AbstractTestNGCucumberTests;)
//Comment @RunWith(Cucumber.class)
//Add dependencies for testNG and Cucumber TestNG 
//Add testNG.xml file for testRunner file 

