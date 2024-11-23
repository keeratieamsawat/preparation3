package org.example;

import java.util.ArrayList;
import java.util.List;

public class Patient {

    private String name;
    private int age;
    private String PicURL;
    private List<Investigation> investigation;

    public Patient(String name, int age, String PicURL) {
        this.name = name;
        this.age = age;
        this.PicURL = PicURL;
        this.investigation = new ArrayList<Investigation>();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPicURL() {
        return PicURL;
    }

    public void addInvestigation(Investigation investigate) {
        this.investigation.add(investigate);
    }

    public List<Investigation> getInvestigation() {
        return investigation;
    }


}
