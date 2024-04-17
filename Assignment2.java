/*
A publishing company deals with marketing of books and audio cassettes. For each book and the audio cassette the company needs to record a title and price of publication. Also a page count should be recorded for each book and a play-time in minutes should be recorded for each cassette. Design a suitable class hierarchy. Write a menu driven program that instantiates the book and tape class, allows users to manipulate and display the information about books and cassettes. The program should catch exceptions and if an exception is caught, it should replace all the values of data members with zeroes.
*/

import java.util.Scanner;

interface Publication{
    void values(String n, double p, int m);
}

class Book implements Publication {
    void values(String title, double price, int page_count) {
        
    }
}

class Audio implements Publication{
    void values(String title, double price, int time) {

    }
}

class Assignment2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the title of the book: ");
        String title_book = s.nextLine();
        System.out.println(("Enter the price of book: "));
        
    }
}