package com.code.observer;

public class Client {

    public static void main(String[] args) {
        Button button = new Button();
        InputText text = new InputText();
        List list = new List();
        TextArea area = new TextArea();

        button.attachObserver(text);
        button.attachObserver(list);
        button.attachObserver(area);

        button.clicked();

    }

}
