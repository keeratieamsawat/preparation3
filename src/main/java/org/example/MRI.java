package org.example;

import java.time.LocalDate;

public class MRI extends Investigation {

    private String URL;
    private int MagField;
    private LocalDate date;

    public MRI(String URL, int MagField, LocalDate date) {
        this.date = date;
        this.URL = URL;
        this.MagField = MagField;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getURL() {
        return URL;
    }

    public int getMagField() {
        return MagField;
    }


    @Override
    public String getDetails(){
        return "Image : " + URL + "\n" + "Field Strength : " + MagField + "Tesla" + "\n" + "Scan date :" + date;
    }

}
