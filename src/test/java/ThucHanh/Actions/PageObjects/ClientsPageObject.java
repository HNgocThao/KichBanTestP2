package ThucHanh.Actions.PageObjects;

import ThucHanh.Actions.Commons.BasePage;
import ThucHanh.Interfaces.ClientsPageUI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClientsPageObject {
    private static BasePage basePage = new BasePage();

    //ClientPage+Detail
    public static void AddClient(WebDriver driver, String type, String companyName, String owner, String address, String city, String state, String zip, String country, String phone, String website,
                                 String vat, String gst, String clientGroup, String curency, String symbol, String label){
        basePage.clickToElement(driver, ClientsPageUI.ClientPage_txt);
        basePage.isElementDisplayed(driver, ClientsPageUI.ClientPage_show);
        basePage.clickToElement(driver, ClientsPageUI.AddClient_btn);

        WebElement rads = driver.findElement(By.xpath(String.format(ClientsPageUI.Type_chbox, type)));
        if (!rads.isSelected()){
            rads.click();
        }

        basePage.sendKeyToElement(driver, ClientsPageUI.CompanyName_txt, companyName);
        basePage.clickToElement(driver, ClientsPageUI.Owner_drop);
        basePage.sendKeyToEnter(driver, ClientsPageUI.Owner_drop2, owner);
        basePage.sendKeyToElement(driver, ClientsPageUI.Address_txt, address);
        basePage.sendKeyToElement(driver, ClientsPageUI.City_txt, city);
        basePage.sendKeyToElement(driver, ClientsPageUI.State_txt, state);
        basePage.sendKeyToElement(driver, ClientsPageUI.Zip_txt, zip);
        basePage.sendKeyToElement(driver, ClientsPageUI.Country_txt, country);
        basePage.sendKeyToElement(driver, ClientsPageUI.Phone_txt, phone);
        basePage.sendKeyToElement(driver, ClientsPageUI.Website_txt, website);
        basePage.sendKeyToElement(driver, ClientsPageUI.VAT_txt, vat);
        basePage.sendKeyToElement(driver, ClientsPageUI.GST_txt, gst);
        basePage.sendKeyToEnter(driver, ClientsPageUI.ClientGroup_list, clientGroup);
        basePage.clickToElement(driver, ClientsPageUI.Currency_drop);
        basePage.sendKeyToEnter(driver, ClientsPageUI.Currency_drop2, curency);
        basePage.sendKeyToElement(driver, ClientsPageUI.CurrencySymbol, symbol);
        basePage.sendKeyToEnter(driver, ClientsPageUI.Label_list, label);
        basePage.checkToCheckboxRadio(driver, ClientsPageUI.Payment_chbox);
        basePage.clickToElement(driver, ClientsPageUI.Save_btn);
        basePage.clickToElement(driver, ClientsPageUI.Close_btn);

    }

}
