package Aufgabe2;

import java.util.Random;

public class Email implements Comparable<Email> {
    private String emailAddress;
    private double note;
    private static final double[] possibleGrades = {1.0, 1.3, 1.7, 2.0, 2.3, 2.7, 3.0, 3.3 , 3.7, 4.0, 5.0};

    Email(String emailAddress) {
        this.emailAddress = emailAddress;
        if (emailAddress.equals("fl121nat@htwg-konstanz.de")) {
            this.note = 1.0;
        } else {
            this.note = possibleGrades[new Random().nextInt(possibleGrades.length)];
        }
    }

    public double getNote() {
        return this.note;
    }

    public String getEmailAddress() {
        return this.emailAddress;
    }



    @Override
    public int compareTo(Email email) {
        return Double.compare(this.note, email.note);
    }
}
