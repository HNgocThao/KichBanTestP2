package BaiTap.Interfaces;

import org.openqa.selenium.WebDriver;

public class ProjectPageUI {
    public static WebDriver driver;
    public static String ProjectPage_txt = "//a[@href='https://rise.fairsketch.com/projects/all_projects']";
    public static String Project_show = "//h1";

    public static String AddManage_btn = "//a[@title='Manage labels']";
    public static String Color_tick = "//span[@data-color='#ad159e']";
    public static String Label_txt = "//input[@id='title']";
    public static String Save_btn = "//button[text()=\" Save\"]";
    public static String Close_btn = "//button[text()=\" Close\"]";

    public static String AddProject_btn = "//a[text()=\" Add project\"]";
    public static String Title_txt = "//input[@name=\"title\"]";
    public static String Project_drop = "//span[text()=\"Client Project\"]";
    public static String Project_drop2 = "(//input[@type='text' and @role='combobox'])[4]";
    public static String Client_drop = "//span[text()=\"Demo Client\"]";
    public static String Client_drop2 = "(//input[@type='text' and @role='combobox'])[4]";
    public static String Description_area = "//textarea";
    public static String Description_area2 = "//div[@role='textbox']";
    public static String Start_date_txt = "//input[@name='start_date']";
    public static String Deadline_txt = "//input[@name='deadline']";
    public static String Price_txt = "//input[@name='price']";
    public static String Label_list = "//label[text()='Labels']//following-sibling::input";
    public static String Save_btn2 = "//button[text()=\" Save\"]";
    public static String Close_btn2 = "//button[text()=\" Close\"]";

    public static String Search_txt = "//input[@type='search']";
    public static String Title_txt2 = "//span[text()='Thầy Bói']";

}
