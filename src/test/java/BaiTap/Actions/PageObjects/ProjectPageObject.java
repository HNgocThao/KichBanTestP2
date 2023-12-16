package BaiTap.Actions.PageObjects;

import BaiTap.Interfaces.ProjectPageUI;
import ThucHanh.Actions.Commons.BasePage;
import org.openqa.selenium.WebDriver;

public class ProjectPageObject {
    private static BasePage basePage = new BasePage();

    public static void AddLabel(WebDriver driver, String label){

        basePage.clickToElement(driver, ProjectPageUI.ProjectPage_txt);
        basePage.isElementDisplayed(driver, ProjectPageUI.Project_show);

        basePage.clickToElement(driver, ProjectPageUI.AddManage_btn);
        basePage.clickToElement(driver, ProjectPageUI.Color_tick);
        basePage.sendKeyToElement(driver, ProjectPageUI.Label_txt, label);
        basePage.clickToElement(driver, ProjectPageUI.Save_btn);
        basePage.clickToElement(driver, ProjectPageUI.Close_btn);
    }

    public static void AddProject(WebDriver driver, String title, String project, String client, String area,
                                String date, String deadline, String price, String list){
        basePage.clickToElement(driver, ProjectPageUI.ProjectPage_txt);
        basePage.isElementDisplayed(driver, ProjectPageUI.Project_show);

        basePage.waitForElementVisible(driver, ProjectPageUI.AddProject_btn);
        basePage.clickToElement(driver, ProjectPageUI.AddProject_btn);
        basePage.sendKeyToElement(driver, ProjectPageUI.Title_txt, title);
        basePage.clickToElement(driver, ProjectPageUI.Project_drop);
        basePage.sendKeyToEnter(driver, ProjectPageUI.Project_drop2, project);
        if(basePage.isElementDisplayed(driver,ProjectPageUI.Client_drop)){
            basePage.clickToElement(driver, ProjectPageUI.Client_drop);
            basePage.sendKeyToEnter(driver, ProjectPageUI.Client_drop2, client);
        }
        basePage.clickToElement(driver, ProjectPageUI.Description_area);
        basePage.sendKeyToElement(driver, ProjectPageUI.Description_area2, area);
        basePage.sendKeyToEnter(driver, ProjectPageUI.Start_date_txt, date);
        basePage.sendKeyToEnter(driver, ProjectPageUI.Deadline_txt, deadline);
        basePage.sendKeyToElementClick(driver, ProjectPageUI.Price_txt, price);
        basePage.sendKeyToEnter(driver, ProjectPageUI.Label_list, list);
        basePage.clickToElement(driver, ProjectPageUI.Save_btn2);
        basePage.clickToElement(driver, ProjectPageUI.Close_btn2);
    }
    public static void Search(WebDriver driver, String title){
        basePage.sendKeyToEnter(driver, ProjectPageUI.Search_txt, title);
        basePage.isElementDisplayed(driver, ProjectPageUI.Title_txt2);
    }
}
