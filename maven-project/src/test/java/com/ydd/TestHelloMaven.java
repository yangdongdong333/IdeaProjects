package com.ydd;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class TestHelloMaven
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testadd()
    {
        System.out.println("===testadd方法开始执行===");
        HelloMaven helloMaven=new HelloMaven();
        int res=helloMaven.add(10,20);
        Assert.assertEquals(30,res);
        System.out.println("===testadd方法结束执行===");
    }
    @Test
    public void testadd2()
    {
        System.out.println("===testadd 2方法开始执行===");
        HelloMaven helloMaven=new HelloMaven();
        int res=helloMaven.add(10,20);
        Assert.assertEquals(30,res);
        System.out.println("===testadd  2方法结束执行===");
    }
}
