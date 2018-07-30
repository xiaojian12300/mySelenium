package test.java.com.itcast.demo;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGDemo1 {

    @Test
    public void fun11(){
        System.out.println("@Test has execute fun11");
    }

    @Test
    public void fun01(){
        System.out.println("@Test has execute fun1");
    }

    @Test
    public void fun02(){
        System.out.println("@Test has execute fun2");
    }

    @BeforeTest
    public void beforeFun(){
        System.out.println("@BeforeTest has execute");
    }

}
