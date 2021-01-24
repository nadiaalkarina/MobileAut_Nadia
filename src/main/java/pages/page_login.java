package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class page_login {

    AndroidDriver driver;

    //Constructor that will be automatically called as soon as the object of the class is created
    public page_login(AndroidDriver driver){
        this.driver=driver;
    }

    //locator of button registration
    By btnRegis = By.id("com.loginmodule.learning:id/textViewLinkRegister");
    //method to click the button
    public void ClickRegis(){
        driver.findElement(btnRegis).click();
    }

    //locator auto fill data setlist
    By HideAutofill = By.id("android:id/autofill_dataset_list");
    //Method click to hide data list
    public void ClickData(){
        driver.findElement(HideAutofill).click();
       // driver.findElement(HideAutofill1).click();
    }

}
