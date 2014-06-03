package edu.kit.ipd.swt1.Lecture;

import java.util.Observable;

/**
 * Created by Sebastian Schindler on 03.06.2014.
 */
public class Professor extends Observable{
    private String chapter;
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
        this.setChanged();
    }

    public String getChapter() {
        return chapter;
    }

    public void setChapter(String chapter) {
        this.chapter = chapter;
        this.setChanged();
    }


    public Professor(String description) {
        this.description = description;
        this.chapter = null;
        this.setChanged();
    }
}
