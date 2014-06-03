package edu.kit.ipd.swt1.Lecture;

import java.util.Observer;

/**
 * Created by Sebastian Schindler on 03.06.2014.
 */
public class Student implements Observer {
    private String state;
    private String description;
    private boolean isMale;

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean isMale) {
        this.isMale = isMale;
    }

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


    public Student(boolean male, String description) {
        this.isMale = male;
        this.description = description;
        this.state = null;
    }
}
