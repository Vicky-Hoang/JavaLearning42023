package exceJavaOOP3.Common;

public class BaseTest {

    public void createDriver(){
        System.out.println("This is driver " + Constants.browser);
        System.out.println("This is report" + Constants.report);
        System.out.println("This is headless" + Constants.headless);
    }

    public void closeDriver(){
        System.out.println("This is close Driver" + Constants.browser);
    }
}
