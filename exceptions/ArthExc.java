package com.java.exceptions;

import static com.interfaces.Calculator.a;

public class ArthExc {

    int  a=5;
    int b=0;

    public void div(){

        try{
            System.out.println(a/b);
        }
        catch (ArithmeticException e){
            System.out.println("division by zero is not possible");
        }

    }
    public static void main(String[] args) {
        ArthExc ex=new ArthExc();
        ex.div();

    }
}
