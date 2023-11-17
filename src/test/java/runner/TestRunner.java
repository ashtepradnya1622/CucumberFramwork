package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        features = {"src\\test\\java\\feature"},
        glue = {"runner","stepDefinitions"},
        tags = " @Test4",
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)
public class TestRunner extends AbstractTestNGCucumberTests
{
    @Override
    @DataProvider(parallel = false)
    public Object[][] scenarios()
    {
        return super.scenarios();
    }

}
