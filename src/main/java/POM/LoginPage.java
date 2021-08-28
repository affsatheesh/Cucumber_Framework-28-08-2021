package POM;

import Helper.GenricHelper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends GenricHelper
{
    /*
    | Singleton Design Pattern in Automated Testing For Avoiding Null Pointer Exception
     */

    private static LoginPage LoginPageInstance;

    private LoginPage() {
    }

    public static LoginPage getInstance() {
        if (LoginPageInstance == null) {
            LoginPageInstance = new LoginPage();
        }
        return LoginPageInstance;
    }


    @FindBy(id = "txtUsername")
    @CacheLookup
    WebElement usrname;

    @FindBy(id = "txtPassword")
    @CacheLookup
    private WebElement passwrd;

    @FindBy(id = "btnLogin")
    @CacheLookup
    private WebElement loginButton;

    @FindBy(xpath = "//h1[text()='Dashboard']")
    private WebElement Dashboard;

    /*
    | Login Page
    * */

    public void logincrt(String Username, String Password) {
        usrname.sendKeys(Username);
        passwrd.sendKeys(Password);
        loginButton.click();
    }


}
