package ThucHanh.TestCases;

import ThucHanh.Actions.Commons.BaseTest;
import ThucHanh.Actions.PageObjects.ClientsPageObject;
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
public class TC01_AddClient extends BaseTest {
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
    public void Test_AddClient(HashMap<String, String> data){
        ClientsPageObject.AddClient(driver, data.get("type"), data.get("companyName"), data.get("owner"), data.get("address"),
                data.get("city"), data.get("state"), data.get("zip"), data.get("country"), data.get("phone"),
                data.get("website"), data.get("vat"), data.get("gst"), data.get("clientGroup"), data.get("currency"),
                data.get("currencySymbol"), data.get("label"));
//        EventsPageObject.CteateEvent(driver,
//                data.get("title"), data.get("description"), data.get("start_date"),
//                data.get("start_time"), data.get("end_date"), data.get("end_time"),
//                data.get("location"), data.get("client"));
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
