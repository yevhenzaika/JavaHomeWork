package com.pb.zayka.hw5;

public class Library {
    public static void main(String[] args) {

        Reader reader1  = new Reader();
        reader1.setFullName("Петров В. В");

        Book book1 = new Book("Приключения", "Иванов И. И.", "2000 г.");
        Book book2 = new Book("Словарь", "Сидоров А. В.", "1980 г.");
        Book book3 = new Book("Энциклопедия", "Гусев К. В.", "2010");

        Book[] books = {book1, book3, book3};

        for (Book x: books)
            System.out.println(x.toString());

        reader1.takeBook(3);
        reader1.takeBook("Приключения", "Словарь", "Энциклопедия");

    }
}
