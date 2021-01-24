package Register;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import pages.page_login;
import pages.page_register;
import java.net.MalformedURLException;
import java.net.URL;

public class Registration_invalid_email {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "32010317f60a168f");
        caps.setCapability("platformName", "android");
        caps.setCapability("appPackage", "com.loginmodule.learning");
        caps.setCapability("appActivity", ".activities.LoginActivity");
        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),caps );

        page_login Login = new page_login(driver);
        Thread.sleep(1000);
        Login.ClickData();
        Login.ClickRegis();

        page_register Register = new page_register(driver);
        Thread.sleep(1000);
        Register.HideAuto();
        Register.Clr();
        Register.Name("alka");
        Register.Email("hello.com");
        Register.InputPass("hello");
        Register.InputConfirmPass("hello");
        Register.ButtonRegister();
        Register.AssertEmail();

        Thread.sleep(2000);
        driver.quit();

    }
}
