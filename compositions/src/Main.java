import entities.Author;
import entities.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Library System");
        System.out.println("How many books do you want to register? ");
        int register = sc.nextInt();
        sc.nextLine();

        List<Book> books = new ArrayList<>();
        List<Author> authors = new ArrayList<>();

        while (books.size() < register) {

            System.out.println("Book information: ");

            System.out.println("Title: ");
            String bookName = sc.nextLine();

            System.out.println("Number of Pages: ");
            Integer bookPages = sc.nextInt();
            sc.nextLine();

            System.out.println("Publishing Year: ");
            Integer bookPublishing = sc.nextInt();
            sc.nextLine();

            System.out.println("Author's name: ");
            String authorName = sc.nextLine();

            System.out.println("Author's Nationality: ");
            String authorNationality = sc.nextLine();

            System.out.println("Author's birthyear: ");
            Integer authorBirthYear = sc.nextInt();
            sc.nextLine();

            Author author = new Author(authorName, authorNationality, authorBirthYear);

            Author authorFound = null;

            for(Author currentAuthor : authors) {
                if(currentAuthor.getName().equals(authorName)){
                    authorFound = currentAuthor;
                    break;
                }
            }

            Book book;

            if(authorFound != null) {
                book = new Book(bookName, bookPages, bookPublishing, authorFound);

            }
            else {
                authors.add(author);
                book = new Book(bookName, bookPages, bookPublishing, author);

            }

            books.add(book);
        }


//                Author author = new Author(authorName, authorNationality, authorBirthYear);


        sc.close();

    }
}

