package com.pb.zayka.hw5;

public class Library {
    public static void main(String[] args) {

        Book book1 = new Book("Приключения", "Иванов И. И.", "2000 г.");
        Book book2 = new Book("Словарь", "Сидоров А. В.", "1980 г.");
        Book book3 = new Book("Энциклопедия", "Гусев К. В.", "2010 г.");

        Book[] books = {book1, book2, book3};

        System.out.println("Книги:");
        for (Book x: books)
            System.out.println(x.getTitle().toString() + " (" + x.getAuthor().toString() + " " + x.getPublished().toString() + ")");

        Reader reader1  = new Reader("Шевченко Т.Г.", "3584", "Филологический", "09.03.1814", "099888777");
        Reader reader2  = new Reader("Коцюбинский М.М.", "7432", "Экономический", "17.09.1864", "077666555");
        Reader reader3  = new Reader("Костенко Л.В.", "2189", "Право", "19.03.1930", "044999222");
        Reader reader4  = new Reader("Франко И.Я.", "1265", "Горный", "27.08.1856", "033777888");

        Reader[] readers = {reader1, reader2, reader3, reader4};

        System.out.println("\n");
        System.out.println("Читатели:");
        for (Reader x: readers)
            System.out.println(x.getFullName().toString() + " Номер билета " + x.getCardNumber().toString()
                    + ". Факультет: " + x.getFaculty().toString() + ". Дата рождения: " + x.getDateOfBirth().toString()+ ". Телефон: " + x.getPhoneNumber().toString() );



        System.out.println("\n");
        reader1.takeBook(3);
        reader2.takeBook(book1.getTitle(), book2.getTitle(), book3.getTitle());
        reader3.takeBook(book2, book3);

        System.out.println("\n");
        reader3.returnBook(2);
        reader2.returnBook(book2.getTitle(),book3.getTitle());
        reader1.returnBook(book1, book3);

    }
}
