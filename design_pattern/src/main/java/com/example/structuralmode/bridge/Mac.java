package com.example.structuralmode.bridge;

/**
 * @Author: kabudac
 * @Date: 2022-04-17 20:30:19
 * @Description:
 */
public class Mac extends OpratingSystem{

    public Mac(VideoFile videoFile) {
        super(videoFile);
    }

    @Override
    public void play(String filename) {
        videoFile.decode(filename);
    }

}
