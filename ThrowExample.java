package com.java.exceptions;

public class ThrowExample {



    public static void checkAge(int age){


        if(age<18){
           throw new IllegalArgumentException("invalid");
        }
        else {
            System.out.println("ok");
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(12);

        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
