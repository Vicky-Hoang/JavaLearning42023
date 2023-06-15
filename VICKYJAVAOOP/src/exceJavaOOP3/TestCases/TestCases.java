package exceJavaOOP3.TestCases;

import exceJavaOOP3.Common.BaseTest;

public class TestCases extends BaseTest {

    public void loginTC(){
        createDriver();
        System.out.println("-------This is Login test case--------");
        System.out.println("1. Navigate to the URL");
        System.out.println("2. Enter email and password");
        System.out.println("3. Clicks on the Login button");
        System.out.println("4. Observe the result");
        closeDriver();

    }

    public void addCategory(){
        createDriver();
        System.out.println("------This is Add category Test case--------");
        System.out.println("1. Navigate to the URL");
        System.out.println("2. Enter email and password");
        System.out.println("3. Clicks on the Login button");
        System.out.println("4. Navigate to the Menu");
        System.out.println("5. Clicks on the Category Tab");
        System.out.println("6. Clicks on the Add Category button");
        System.out.println("7. Fill data into all fields");

        closeDriver();

    }

    public static void main(String[] args) {
        TestCases displayTestCase = new TestCases();
        displayTestCase.loginTC();
        displayTestCase.addCategory();
    }
}
