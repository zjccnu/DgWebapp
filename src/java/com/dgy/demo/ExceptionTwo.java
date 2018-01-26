package com.dgy.demo;

/**
 * Created by zjccnu on 2018/1/25.
 */
public class ExceptionTwo extends Exception {
    public ExceptionTwo(){
        super();
    }
    public ExceptionTwo(String msg){
        super(msg);
    }
    public ExceptionTwo(String msg,Throwable cause){
        super(msg,cause);
    }
    public ExceptionTwo(Throwable cause){
        super(cause);
    }

}
