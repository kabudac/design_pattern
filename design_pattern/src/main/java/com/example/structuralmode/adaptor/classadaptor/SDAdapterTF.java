package com.example.structuralmode.adaptor.classadaptor;

import com.example.structuralmode.adaptor.SDCard;
import com.example.structuralmode.adaptor.TFCardImpl;

/*
 * @Author: kabudac
 * @Date: 2022-04-17 16:05:24
 * @Description: 适配器类（SD兼容TF） 
 */
public class SDAdapterTF extends TFCardImpl implements SDCard {

    @Override
    public String readSD() {
        System.out.println("adapter read TF card");
        return readTF();
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("adapter write TF card");
        writeTF(msg);
        
    }   
}
