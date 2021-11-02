package com.pb.zayka.hw5;

public class Reader {

    private String fullName;
    private String cardNumber;
    private String faculty;
    private String dateOfBirth;
    private String phoneNumber;

    public Reader(String fullName, String cardNumber, String faculty, String dateOfBirth, String phoneNumber) {
        this.fullName = fullName;
        this.cardNumber = cardNumber;
        this.faculty = faculty;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void takeBook(int books) {
        System.out.println(fullName + " взял " + books + " книги");
    }

    public void takeBook(String... books) {
        StringBuilder sb = new StringBuilder();
        for (String book : books)
            sb.append(book).append(". ");
        System.out.println(fullName + " взял книги: " + sb.toString());
    }

    public void takeBook(Book... books) {
        System.out.print(fullName + " взял книги: " );
        for (Book x: books)
            System.out.print(x.getTitle().toString() + " (" + x.getAuthor().toString() + " " + x.getPublished().toString() + "), ");
    }

    public void returnBook(int books) {
        System.out.println(fullName + " вернул " + books + " книги");
    }

    public void returnBook(String... books) {
        StringBuilder sb = new StringBuilder();
        for (String book : books)
            sb.append(book).append(". ");
        System.out.println(fullName + " вернул книги: " + sb.toString());
    }

    public void returnBook(Book... books) {
        System.out.print(fullName + " вернул книги: " );
        for (Book x: books)
            System.out.print(x.getTitle().toString() + " (" + x.getAuthor().toString() + " " + x.getPublished().toString() + "), ");
    }

}
