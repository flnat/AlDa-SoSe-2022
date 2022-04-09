package Aufgabe2;

public class EmailListClient {
    public static void main(String[] args) {
        EmailList emailList = new EmailList("resources//emails.txt");
        emailList.sortEmails();


        for (Email email : emailList.getEmails()) {
            System.out.printf("%s : %.1f\n ", email.getEmailAddress(), email.getNote());
        }


    }
}
