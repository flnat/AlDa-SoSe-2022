package Aufgabe2.EmailInsertionSort;


import edu.princeton.cs.algs4.*;

public class EmailList {

    private Email[] emails;

    EmailList(String filePath) {
        In file = new In(filePath);
        String[] rawEmails = file.readAllLines();
        this.emails = new Email[rawEmails.length];

        for (int i = 0; i < rawEmails.length; i++) {
            this.emails[i] = new Email(rawEmails[i]);
        }


    }

    public void sortEmails() {
        //Implementiert InsertionSort über die einzelnen Noten
        InsertionSort.sort(this.emails);
    }


    public Email[] getEmails() {
        return this.emails;
    }


}

