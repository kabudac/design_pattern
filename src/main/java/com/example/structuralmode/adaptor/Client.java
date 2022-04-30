package com.example.structuralmode.adaptor;

import com.example.structuralmode.adaptor.objectadaptor.SDAdapterTF;

/*
 * @Author: kabudac
 * @Date: 2022-04-17 16:11:56
 * @Description: 
 */
public class Client {
    public static void main(String[] args) {
        Computer computer = new Computer();
        SDCard sdCard = new SDCardImpl();

        System.out.println(computer.readSD(sdCard));

        System.out.println("----------------");

        TFCard tfCard = new TFCardImpl();
        SDAdapterTF adapter = new SDAdapterTF(tfCard);
        System.out.println(computer.readSD(adapter));
    }
}
