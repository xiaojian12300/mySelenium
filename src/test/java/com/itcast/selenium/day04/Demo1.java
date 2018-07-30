package com.itcast.selenium.day04;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Demo1 {

    @DataProvider(name = "list")
    public Object[][] data(){
        return new Object[][]{
                {"user1","ps1"},
                {"user2","ps2"}
        };
    }

    @Test(dataProvider = "list")
    public void fun(String name,String ps){
        System.out.println(name+":"+ps);
    }
}
