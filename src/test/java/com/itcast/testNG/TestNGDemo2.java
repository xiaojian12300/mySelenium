package com.itcast.testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGDemo2 {

    @Test
    public void fun1(){
        Assert.assertEquals(3,3);
        System.out.println("aaa");
        Assert.assertEquals(4,5);
    }

    @Test
    public void fun2(){
        Assert.assertNotEquals(1,2);
    }

    @Test
    public void fun3(){
        Assert.assertNotNull(null);
    }

}
