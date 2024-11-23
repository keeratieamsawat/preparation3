package org.example;


import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        Patient patient1 = new Patient(" Daphne Von Oram", 62, "https://martinh.netfirms.com/BIOE60010/DaphneVonOram.jpg");
        Patient patient2 = new Patient(" Sebastian Compton", 31, "https://martinh.netfirms.com/BIOE60010/SebastianCompton.jpg");

        patient1.addInvestigation(new MRI("https://martinh.netfirms.com/BIOE60010/mri1.jpg", 2, LocalDate.of(2023,9,14)));
        patient2.addInvestigation(new MRI("https://martinh.netfirms.com/BIOE60010/mri2.jpg", 4, LocalDate.of(2023,11,19)));

        patient1.addInvestigation(new BP(130, 70, "ST", LocalDate.of(2023,9,15)));
        patient2.addInvestigation(new BP(150,80,"VST", LocalDate.of(2023,11,20)));

        AdminView adminView = new AdminView();
        adminView.displayAdminView(patient1);
        adminView.displayAdminView(patient2);

        DoctorView2 doctorView2 = new DoctorView2();
        List<Patient> patients = new ArrayList<>();
        patients.add(patient1);
        patients.add(patient2);
        doctorView2.displayDoctorView(patients);



    }
}
