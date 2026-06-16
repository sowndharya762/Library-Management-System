
import model.Book;
import service.LibraryService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LibraryService library = new LibraryService();

        while (true) {

            System.out.println("\n===== LIBRARY MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. Delete Book");
            System.out.println("6. Exit");

            System.out.print("Enter Choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter Book ID: ");
                    int id = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter Author: ");
                    String author = sc.nextLine();

                    library.addBook(
                            new Book(id, title, author, false)
                    );

                    break;

                case 2:
                    library.viewBooks();
                    break;

                case 3:

                    System.out.print("Enter Book ID: ");
                    library.issueBook(sc.nextInt());

                    break;

                case 4:

                    System.out.print("Enter Book ID: ");
                    library.returnBook(sc.nextInt());

                    break;

                case 5:

                    System.out.print("Enter Book ID: ");
                    library.deleteBook(sc.nextInt());

                    break;

                case 6:

                    System.out.println("Thank You");
                    System.exit(0);

                default:

                    System.out.println("Invalid Choice");
            }
        }
    }
}