package ThucHanh.Interfaces;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClientsPageUI {
    public static WebDriver driver;
    public static String ClientPage_txt = "//a[@href='https://rise.fairsketch.com/clients']";
    public static String ClientPage_show = "//div[contains(@class ,'card-body')]//span[normalize-space()='Total clients']";

    public static String AddClient_btn = "//a[text()=\" Add client\"]";
    public static String Type_chbox = "//label[text()='%s']";
    public static String CompanyName_txt = "//input[@id='company_name']";
    public static String Owner_drop = "//a[@href='javascript:void(0)' and @class='select2-choice']";
    public static String Owner_drop2 = "(//input[@role='combobox'])[2]";
    public static String Address_txt = "//textarea";
    public static String City_txt = "//input[@id='city']";
    public static String State_txt = "//input[@id='state']";
    public static String Zip_txt = "//input[@id='zip']";
    public static String Country_txt = "//input[@id='country']";
    public static String Phone_txt = "//input[@id='phone']";
    public static String Website_txt = "//input[@id='website']";
    public static String VAT_txt = "//input[@id='vat_number']";
    public static String GST_txt = "//input[@id='gst_number']";
    public static String ClientGroup_list = "(//label[text()='Client groups']//following::input)[1]";
//    public static String ClientGroup_list2 = "(//span[@class='select2-match'])[2]";
    public static String Currency_drop = "//span[text()=\"Keep it blank to use the default (USD)\"]";
    public static String Currency_drop2 = "(//label[text()=\"Currency\"])[3]//following-sibling::input";
    public static String CurrencySymbol = "//input[@placeholder='Keep it blank to use the default ($)']";
    public static String Label_list = "//label[text()=\"Labels\"]//following-sibling::input";
    public static String Payment_chbox = "//input[@type='checkbox']";
    public static String Save_btn = "//button[text()=\" Save\"]";
    public static String Close_btn = "//button[text()=\" Close\"]";


}
