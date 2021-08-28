package Config;

import Constants.CommonConstants;
import Utils.CommonUtils;
import io.cucumber.java.Before;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;

public class SeleniumBase {

    private static final Logger Logg = LogManager.getLogger(SeleniumBase.class.getName());

    /*
    | Launch the Browser
       While Using @Before and @After you should Mention the Package Name in the Glue (TestRunner Class)
    * */

    @Before
    public void launch() throws IOException, InterruptedException {
        Logg.info("Execution Started");
        try {
            Logg.info("Instantiation the CommonConstants");
            CommonUtils Utils = new CommonUtils();
            Utils.loadpropertiesfile();

            Logg.info("Loading the Properties File");
            if (DriverManager.getDriver() == null) {
                Logg.info("Check the Driver is NULL or Not");
                DriverManager.launchbrowser();
                CommonUtils.initWebElement();
            }
            DriverManager.getDriver().get(CommonConstants.APP_URL);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
