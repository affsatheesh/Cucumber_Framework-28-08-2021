package Utils;

import Config.DriverManager;
import Constants.CommonConstants;
import POM.LoginPage;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.util.Properties;

public class CommonUtils {

    public void loadpropertiesfile() throws IOException {

        /*
        | This is Old Code So I Commanded but This Will Also Load the Property
        * */

//        FileReader reader = null;
//        try {
//            reader = new FileReader(System.getProperty("user.dir") + "\\src\\main\\resources\\App.properties");
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//        Properties properties = new Properties();
//        try {
//            properties.load(reader);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }


        /*
        | This is New Code For Load the Property
        * */

        Properties properties = new Properties();
        try {
            properties.load(getClass().getResourceAsStream("/App.properties"));
        } catch (Exception e)
        {
            e.printStackTrace();
        }

        CommonConstants.Browser= properties.getProperty("Browser");
        CommonConstants.APP_URL= properties.getProperty("URL");
        CommonConstants.UserName =properties.getProperty("Username");
        CommonConstants.Password = properties.getProperty("Password");
    }

    /*
    | Here You Need to InitElements The only the WebElement Object will store
     */

    public static void initWebElement()
    {
        PageFactory.initElements(DriverManager.getDriver(), LoginPage.getInstance());
    }
}
