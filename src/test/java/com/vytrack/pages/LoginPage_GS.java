package com.vytrack.pages;

import com.vytrack.utilities.Driver;
import static com.vytrack.pages.VytrackUtilities.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage_GS {

    public static void userLogin( String username, String password){
        WebDriver driver = Driver.get();
        driver.findElement(By.id("prependedInput")).sendKeys(username);
        driver.findElement(By.id("prependedInput2")).sendKeys(password);
        driver.findElement(By.id("_submit")).click();

        expWait_Loader();





    }
}
