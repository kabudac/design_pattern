/*
 * @Author: kabudac
 * @Date: 2022-04-17 16:03:07
 * @Description: 
 */
package com.example.structuralmode.adaptor;

public class TFCardImpl implements TFCard{

    @Override
    public String readTF() {
        String msg = "tf card read msg: hello TF";
        return msg;
    }

    @Override
    public void writeTF(String msg) {
    
        System.out.println("tf card write a msg: "+msg);
    }

}