package com.example.structuralmode.bridge;

/**
 * @Author: kabudac
 * @Date: 2022-04-17 20:26:45
 * @Description:
 */
public abstract class OpratingSystem {
    protected VideoFile videoFile;

    public OpratingSystem(VideoFile videoFile) {
        this.videoFile = videoFile;
    }

    public abstract void play(String filename);
}
