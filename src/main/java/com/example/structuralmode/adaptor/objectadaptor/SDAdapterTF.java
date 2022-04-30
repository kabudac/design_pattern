package com.example.structuralmode.adaptor.objectadaptor;

import com.example.structuralmode.adaptor.SDCard;
import com.example.structuralmode.adaptor.TFCard;

/**
 * @Author: kabudac
 * @Date: 2022-04-17 16:08:53
 * @Description:
 */
public class SDAdapterTF implements SDCard {

    private TFCard tfCard;

    public SDAdapterTF(TFCard tfCard) {
        this.tfCard = tfCard;
    }

    @Override
    public String readSD() {
        System.out.println("adapter read tf card");
        return tfCard.readTF();
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("adapter write tf card");
        tfCard.writeTF(msg);
    }

}
