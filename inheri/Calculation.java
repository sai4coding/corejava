package com.corejava.inheri;

public class Calculation {
    public static void main(String[] args){
        Values cal=new Values();
        cal.message();

        AddSub call=new AddSub();
        call.add(2,4);
        call.sub(5,1);

        MultiDiv val=new MultiDiv();
        val.multi(3,5);
        val.div(3,1);
    }
}
