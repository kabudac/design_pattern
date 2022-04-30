package com.example.structuralmode.adaptor;

/**
 * @Author: kabudac
 * @Date: 2022-04-17 15:58:32
 * @Description:
 */
public class SDCardImpl implements SDCard{

    @Override
    public String readSD() {
        String msg = "sd card read a msg: hello SD!";

        return msg;
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("sd card write msg: "+msg);

    }

}
