package com.example.structuralmode.bridge;

/**
 * @Author: kabudac
 * @Date: 2022-04-17 20:31:02
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        OpratingSystem os = new Windows(new AVIFile());

        os.play("filename");
    }
}
