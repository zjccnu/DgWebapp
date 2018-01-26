package com.dgy.demo;

/**
 * Created by zjccnu on 2018/1/25.
 */
public class ExceptionOne extends Exception {
   public ExceptionOne(){
        super();
    }
    public ExceptionOne(String msg){
         super(msg);
    }
    public ExceptionOne(String msg,Throwable cause){
        super(msg,cause);
    }
    public ExceptionOne(Throwable cause){
        super(cause);
    }

}
