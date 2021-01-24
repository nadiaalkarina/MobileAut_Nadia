package pages;

import io.appium.java_client.android.AndroidDriver;
import org.junit.Assert;
import org.openqa.selenium.By;

public class page_register {
    AndroidDriver driver;

    //Constructor that will be automatically called as soon as the object of the class is created
    public page_register(AndroidDriver driver){
        this.driver=driver;
    }

    //locator hide name auto fill
    By hideAutoFill = By.id("android:id/content");
    //method click hide auto fill
    public void HideAuto(){
        driver.findElement(hideAutoFill).click();
    }

    //locator clear field name
    By del = By.id("com.loginmodule.learning:id/textInputEditTextName");
    public void Clr(){
        driver.findElement(del).clear();
    }


    //locator input name
    By name = By.id("com.loginmodule.learning:id/textInputEditTextName");
    //method input name
    public void Name(String nm){
        driver.findElement(name).sendKeys(nm);
    }

    //locator input email
    By email = By.id("com.loginmodule.learning:id/textInputEditTextEmail");
    //method input email
    public void Email(String eml){
        driver.findElement(email).sendKeys(eml);
    }

    //locator password
    By pass = By.id("com.loginmodule.learning:id/textInputEditTextPassword");
    //method input password
    public void InputPass(String ps){
        driver.findElement(pass).sendKeys(ps);
    }

    //locator confirm password
    By passw = By.id("com.loginmodule.learning:id/textInputEditTextConfirmPassword");
    //method input confirm password
    public void InputConfirmPass(String psw){
        driver.findElement(passw).sendKeys(psw);
    }

    //locator click register
    By buttonR = By.id("com.loginmodule.learning:id/appCompatButtonRegister");
    //method click register button
    public void ButtonRegister(){
        driver.findElement(buttonR).click();
    }

    //Assert error invalid email
    public void AssertEmail(){
        Assert.assertEquals(driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.support.v7.widget.LinearLayoutCompat/TextInputLayout[2]/android.widget.LinearLayout/android.widget.TextView").getText(),"Enter Valid Email");
    }

    //Assert error message "email already exist"
    public void AssertEmailExist(){
        Assert.assertEquals(driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView").getText(),"Email Already Exists");
    }

    //Assert success registered message
    public void AssertSuccess(){
        Assert.assertEquals(driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView").getText(),"Registration Successful");
    }

}
