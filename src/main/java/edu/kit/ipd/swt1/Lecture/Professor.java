package edu.kit.ipd.swt1.Lecture;

import java.util.Observable;

/**
 * Created by Sebastian Schindler on 03.06.2014.
 */
public class Professor extends Observable{
    private String state;
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }


    public Professor(String description) {
        this.description = description;
        this.state = null;
    }
}
