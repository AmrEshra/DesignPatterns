package com.code.observer;

public class TextArea implements Observer {

    public void setValue(String value){
        System.out.println("Set TextArea value : "+value);
    }


    @Override
    public void update() {
    	setValue("ANCNCNCNJN");
    }
}
