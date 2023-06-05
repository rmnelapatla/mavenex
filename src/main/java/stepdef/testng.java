package stepdef;

import org.testng.Assert;
import org.testng.annotations.*;

public class testng {

    @BeforeSuite
    public void beforesuite(){
        System.out.println("beforesuite");
    }

    @BeforeTest
    public void beforetest(){
        System.out.println("before test");
    }

    @BeforeClass
    public void beforeclass(){
        System.out.println("before class");
    }

    @BeforeGroups
    public void beforegroup(){
        System.out.println("before group");
    }


    @AfterSuite
    public void Aftersuite(){
        System.out.println("aftersuite");
    }

    @AfterTest
    public void Aftertest(){
        System.out.println("After test");
    }

    @AfterClass
    public void afterclass(){
        System.out.println("afterclass");
    }

    @AfterGroups
    public void aftergroup(){
        System.out.println("aftergroup");
    }



    @Test(priority = 4,groups = "regression")
    public void TestCase001(){
        System.out.println("test 001");
        // Assert.assertEquals("ramana","ramana" , "Not mathced both string");
    }

    @Test(priority = 3,groups = "smoke")
    public void TestCase002(){
        System.out.println("test 002");
    }

    @Test(priority = 2,groups = "smoke")
    public void TestCase003(){
        System.out.println("test 003");
    }

    @Test(priority = 1 ,groups = "regression" ,dependsOnMethods ="TestCase005" )
    public void TestCase004(){
        System.out.println("test 004");
    }

    @Test(priority = 0,groups = "function" )
    public void TestCase005(){
        System.out.println("test 005");
        Assert.fail();
        int[][] a = new int[2][];
        int[][] b = new int[2][3];

        int [][] c =  {{2,3,4},{1},{3,9,6,7,8,9}};
    }

    @DataProvider
    public Object[][] empdata(){
        return new Object[][]{
                {29,"ramana",'M',10,"10/01/2304",50},
                {30,"bbbbb",'F',90,"01/01/2023",20},
                {31,"ccccc",null,10,"01/02/2023",30},
        };
    }
    @DataProvider
    public Object[][] register(){
        return new Object[][]{
                {"Male","Ramana","Krishna","rama@yahoo.com","SFRE@123","SFRE@123"},
                {"Female","julie","Andrews","test123@gmail.com","AA1234@","AA1234@"},
                {"Male","Kumar","selven","test@gmail.com","AA34@11","AA34@11"}
        };
    }

    @Test(dataProvider = "register")
    public void newregister(String gender,String fname,String lname,String mailid,String password,String confirmpassword){

        System.out.println(gender);
        System.out.println(fname);
        System.out.println(lname);
        System.out.println(mailid);
        System.out.println(password);
        System.out.println(confirmpassword);


    }
}
