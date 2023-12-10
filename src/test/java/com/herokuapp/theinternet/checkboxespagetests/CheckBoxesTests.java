package com.herokuapp.theinternet.checkboxespagetests;

import base.TestUtilities;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CheckboxesPage;
import pages.WelcomePageObject;

public class CheckBoxesTests extends TestUtilities {
    @Test
    public void selectingTwoCheckboxesTest(){
        log.info("Starting selectingTwoCheckboxesTest");

        //open main page
        WelcomePageObject welcomePage = new WelcomePageObject(driver,log);
        welcomePage.openPage();

        //click on Checkbox link
        CheckboxesPage checkboxesPage = welcomePage.clickCheckboxesLink();

        //select all checkboxes
        checkboxesPage.selectAllCheckboxes();

        //verify all checkboxes checked
        Assert.assertTrue(checkboxesPage.allCheckboxesChecked(),"Not all checkboxes are checked");
    }

}
