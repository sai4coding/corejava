package com.java.Lambdaexpressions;

public class Main {
    public static void main(String a[]){
        Bank account=() ->{
            System.out.println("Bank");
        };
        account.display();

        SBI acc=new SBI();
        acc.display();
    }
}
