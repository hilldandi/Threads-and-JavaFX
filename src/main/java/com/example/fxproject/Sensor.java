package com.example.fxproject;


import javafx.scene.control.TextArea;

import java.util.Random;

public class Sensor extends java.lang.Thread {
    TextArea textaa;
    int temperature;

    public Sensor(TextArea textArea){
        //this.temperature=0;
        this.textaa = textArea;
    }



    public void run(){
        while(true){
            Random rand = new Random();
            int temp = rand.nextInt(50);
            String s = "" + temp;
            textaa.deleteText(0, textaa.getText().length());
            textaa.appendText(s);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }


    public void func1() {
        System.out.println(currentThread().getName());
    }
}