package com.example.structuralmode.adaptor;

/**
 * @Author: kabudac
 * @Date: 2022-04-17 16:00:37
 * @Description:
 */
public class Computer {
    public String readSD(SDCard sdCard) {
        if(sdCard == null){
            throw new NullPointerException("sd card is null");
        }
        return sdCard.readSD();
    }
}
