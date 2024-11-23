package org.example;

public class AdminView {
    public void displayAdminView(Patient patient) {
        System.out.println("Patient " + ":" + patient.getName() + ":");

        for (Investigation investigate : patient.getInvestigation()){
            if (investigate instanceof MRI){
                MRI mri = (MRI) investigate;
                System.out.println("MRI : " + mri.getMagField() + "," + mri.getDate());
            }
            else if (investigate instanceof BP) {
                BP bp = (BP) investigate;
                System.out.println("BP : " + bp.getDuration() + "," + bp.getDate());
            }
        }
    }
}
