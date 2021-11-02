package com.pb.zayka.hw5;

public class Reader {

    private String fullName;
    private int cardNumber;
    private String faculty;
    private String dateOfBirth;
    private String phoneNumber;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
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

    public void takeBook(Book... book) {

    }
}
