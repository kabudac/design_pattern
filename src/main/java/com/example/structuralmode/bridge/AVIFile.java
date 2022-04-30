package com.example.structuralmode.bridge;

/**
 * @Author: kabudac
 * @Date: 2022-04-17 20:24:32
 * @Description:
 */
public class AVIFile implements VideoFile{

    @Override
    public void decode(String filename) {
        System.out.println("avi视频文件: "+filename);

    }

}
