package BaiTap.TestCases;

import BaiTap.Actions.PageObjects.ProjectPageObject;
import ThucHanh.Actions.Commons.BaseTest;
import ThucHanh.Actions.PageObjects.LoginPageObject;
import ThucHanh.Actions.PageObjects.LogoutPageObject;
import ThucHanh.Utilities.Listeners.TestListener;
import jdk.jfr.Description;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.util.HashMap;

@Listeners({TestListener.class})
public class TC01_AddLabel extends BaseTest {
    private static WebDriver driver;
    @BeforeClass
    public void beforeClass() {
        driver = getDriver();
    }

    @Test(priority = 0)
    public void Test_Login() {
        LoginPageObject.Login(driver, "admin@demo.com", "riseDemo");
    }

    @Test (priority = 1, dataProvider = "RISE_Login", dataProviderClass = ThucHanh.Utilities.Helpers.PropertiesFile.class)
    @Description("Verify the login function")
    public void Test_AddLabel(HashMap<String, String> data){
        ProjectPageObject.AddLabel(driver, data.get("label"));
    }
    @Test (priority = 2)
    public void Test_Logout() {
        LogoutPageObject.Logout(driver);
    }

    @AfterClass
    public void afterClass() throws Exception{
        tearDown();
    }
}
