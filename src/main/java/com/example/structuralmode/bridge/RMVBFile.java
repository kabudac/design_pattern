package com.example.structuralmode.bridge;

/**
 * @Author: kabudac
 * @Date: 2022-04-17 20:25:39
 * @Description:
 */
public class RMVBFile implements VideoFile{

    @Override
    public void decode(String filename) {
        System.out.println("RMVB视频文件: "+filename);

    }

}
