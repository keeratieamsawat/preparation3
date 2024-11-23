package org.example;
import java.time.LocalDate;

public class BP extends Investigation {

    private LocalDate date;
    private int Systolic;
    private int Diastolic;
    private String duration;

    public BP( int Systolic, int Diastolic, String duration, LocalDate date) {
        this.date = date;
        this.Systolic = Systolic;
        this.Diastolic = Diastolic;
        this.duration = duration;
    }
    public LocalDate getDate() {
        return date;
    }

    public int getSystolic() {
        return Systolic;
    }

    public int getDiastolic() {
        return Diastolic;
    }

    public String getDuration() {
        return duration;
    }

    @Override
    public String getDetails() {
        return "Systolic : " + Systolic + "\n" + " Diastolic : " + Diastolic + "\n"+ " Duration : " + duration;
    }

}
