package com.example.structuralmode.bridge;

/**
 * @Author: kabudac
 * @Date: 2022-04-17 20:28:04
 * @Description:
 */
public class Windows extends OpratingSystem{

    public Windows(VideoFile videoFile) {
        super(videoFile);
    }

    @Override
    public void play(String filename) {
        videoFile.decode(filename);;
    }

}
