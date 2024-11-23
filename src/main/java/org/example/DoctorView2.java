package org.example;
import javax.swing.*;
import java.awt.*;
import java.net.MalformedURLException;
import java.util.List;
import java.net.URL;

public class DoctorView2 {

    public void displayDoctorView(List<Patient> patients) {
        JFrame frame = new JFrame("Doctor View");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLayout(new GridLayout(patients.size(), 1));

        for (Patient patient : patients) {
            frame.add(createPanelRow(patient));
        }

        frame.setVisible(true);
    }

    private JLabel createLabelImage(String ImageURL) {
        JLabel label = new JLabel();
        URL imageURL = null;
        try {
            imageURL = new URL(ImageURL);
        } catch (MalformedURLException e) {
            System.out.println(e.getMessage());
        }
        ImageIcon thisImageIcon = new ImageIcon(imageURL);
        label.setIcon(thisImageIcon);
        return label;
    }

    private JPanel createPanelRow(Patient patient) {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1, 4));

        // column 1
        JLabel PatientImg = createLabelImage(patient.getPicURL());
        panel.add(PatientImg);

        // column 2
        JLabel DetailPat = new JLabel("<html>Name " + patient.getName() + "<br>" + " Age " + patient.getAge() + "</html>");
        panel.add(DetailPat);

        // column 3
        boolean mriFound = false;
        for (Investigation investigate : patient.getInvestigation()) {
            if (investigate instanceof MRI) {
                MRI mri = (MRI) investigate;
                panel.add(createLabelImage(mri.getURL()));
                mriFound = true;
                break;
            }
            if (!mriFound) {
                panel.add(new JLabel("No MRI IMAGE FOUND"));
            }

        }
        // column 4
        boolean bpFound = false;
        for (Investigation investigate : patient.getInvestigation()) {
            if (investigate instanceof BP) {
                BP bp = (BP) investigate;
                panel.add(new JLabel("<html>Blood pressure " + "<br>" + bp.getSystolic() + " over " + bp.getDiastolic() + "</html>"));
                bpFound = true;
                break;

            }
        }
        if (!bpFound) {
            panel.add(new JLabel("No BP image found"));
        }

        return panel;
    }
}



