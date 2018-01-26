package com.dgy.demo;

import org.testng.annotations.Test;

/**
 * Created by zjccnu on 2018/1/25.
 */
public class ExceptionDemo {
    public static void g() throws ExceptionOne{
        throw new ExceptionOne("here");

    }

    public static void  f() throws ExceptionTwo{
        try {
            g();
        } catch (ExceptionOne exceptionOne) {
            exceptionOne.printStackTrace();
            throw new ExceptionTwo(exceptionOne);
        }
    }
    @Test
    public void test(){
        try {
            f();
        } catch (ExceptionTwo exceptionTwo) {
            exceptionTwo.printStackTrace();
        }
    }
}

