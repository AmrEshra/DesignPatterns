package com.code.factory;

public class Client {

    public static void main(String [] args){

        TransportFactory factory = new CarFactory();
        Transport transport = factory.create();
        System.out.println(transport.drive());
    }
}
