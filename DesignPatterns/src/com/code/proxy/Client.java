package com.code.proxy;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {

        ImageProxy image = new ImageProxy("test image");
        ImageProxy image2 = new ImageProxy("second image");
        ImageProxy image3 = new ImageProxy("3 image");
        ImageProxy image4 = new ImageProxy("4 image");
        ImageProxy image5 = new ImageProxy("5 image");
        ImageProxy image6 = new ImageProxy("6 image");
        ImageProxy image7 = new ImageProxy("7 image");
        ImageProxy image8 = new ImageProxy("8 image");

        List<Image> images = new ArrayList<Image>();
        images.add(image);
        images.add(image2);
        images.add(image3);
        images.add(image4);
        images.add(image5);
        images.add(image6);
        images.add(image7);
        images.add(image8);

        Application application = new Application(images);


        System.out.println("Application setup");

        application.draw();

    }

}
