import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
class myLibrary1{
    private String books[];
    private String returnBook[];
    private int numOfBooks;
    private int capacity;
    private String users;
    private int numOfUsers;
    private String registeredUser[];
    private int numofIssuedBooks;
    private String IssuedBooks[];
    private String IssuedBooksWithTime[];
    Scanner sc = new Scanner(System.in);
    myLibrary1(){
        capacity = 100;
        numOfBooks = 0;
        books = new String[capacity];
        returnBook = new String[capacity];
        registeredUser = new String[50];
        IssuedBooksWithTime = new String[100];
        IssuedBooks = new String[100];
        registeredUser[0] = "Prajwal Urkude";
        registeredUser[1] = "Ayush Urkude";
        registeredUser[2] = "Vilas Urkude";
        registeredUser[3] = "Sunita Urkude";
        numOfUsers = 4;
        numofIssuedBooks = 0;
        System.out.println("Hello there :)\nThis is Nate, I am the management system of the library");
        System.out.println("I will guide to manage books of the library right from adding, issuing, removing and registering user, you can stress me to any level of task that you want to commit.");
        System.out.println("The total capacity of books are " + capacity);
        System.out.println("The maximum user could be " + 50);
        System.out.println("__________________________________________________________________________\n");
        this.books[0] = "Adventures of Huckleberry Finn - by Mark Twain";
        this.books[1] = "The Alchemist - by Paulo Coelho";
        this.books[2] = "The Adventures of Sherlock Holmes - by Arthur Conan Doyle";
        this.books[3] = "The Aleph and Other Stories - by Jorge Luis Borges";
        this.books[4] = "Aesop's Fables - by Aesop";
        this.books[5] = "Alice's Adventures in Wonderland - by Lewis Carroll";
        this.returnBook[0] = "Adventures of Huckleberry Finn - by Mark Twain";
        this.returnBook[1] = "The Alchemist - by Paulo Coelho";
        this.returnBook[2] = "The Adventures of Sherlock Holmes - by Arthur Conan Doyle";
        this.returnBook[3] = "The Aleph and Other Stories - by Jorge Luis Borges";
        this.returnBook[4] = "Aesop's Fables - by Aesop";
        this.returnBook[5] = "Alice's Adventures in Wonderland - by Lewis Carroll";
        numOfBooks = 6;
    }
    void registeringUser(){
        System.out.println("Please kindy register your name");
        users = sc.nextLine();
        registeredUser[numOfUsers] = users;
        numOfUsers++;
    }
    void totalBooks1(){
        System.out.println("The pre-added books to be followed as -->\n");
        for(int i = 0; i < numOfBooks; ++i){
            System.out.println(books[i]);
        }
    }
    void displayIssuedBook(){
        System.out.println("The issued books to be followed");
        for(int i = 0; i < numofIssuedBooks; ++i){
            System.out.println(IssuedBooksWithTime[i]);
        }
    }
    void addBooks1(){
        System.out.println("Enter your Username");
        String Username;
        int count = 0;
        Username = sc.nextLine();
        for(int i = 0; i < numOfUsers; ++i){
            if(registeredUser[i].equals(Username)){
                System.out.println("Enter the name of the books");
                String bookName;
                bookName = sc.nextLine();
                books[numOfBooks] = bookName;
                returnBook[numOfBooks] = bookName;
                numOfBooks++;
                int s = 0;
                System.out.println("Press 1 to view");
                s = sc.nextInt();
                if(s == 1) totalBooks1();
                else break;
            }
            else count++;
        }
        if(count == numOfUsers){
            System.out.println("Please register yourself by entering the name - : \n");
            registeringUser();
            System.out.println("Now consider reverifying your name for adding books");
            addBooks1();
        }
        else System.out.println("BOOK ADDED SUCCESSFULLY");
        
    }
    void issueBook1(){
        System.out.println("Enter your Username");
        String Username;
        int count = 0;
        int countUsers = 0;
        sc.nextLine();
        Username = sc.nextLine();        
        for(int i = 0; i < numOfUsers; ++i){
            if(registeredUser[i].equals(Username)){
                System.out.println("Please enter the book you want");
                String bookName;
                bookName = sc.nextLine();
                for(int j = 0; j < numOfBooks; ++j){
                    if(books[j].equals(bookName)){
                        LocalDateTime dt = LocalDateTime.now();
                        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy -- E H:m a"); //* we can create any format through this but the date time symbols remains the same
                        String myDate = dt.format(df);
                        IssuedBooks[numofIssuedBooks] = bookName;
                        IssuedBooksWithTime[numofIssuedBooks] = books[j] + " issued on " + myDate;
                        numofIssuedBooks++;
                        System.out.println("The book was successfully issued on " + myDate);
                        break;
                    }
                    else count++;
                }
                if(count == numOfBooks){
                    System.out.println("Book not found");
                }
            }
            else countUsers++;
        }
        if(countUsers == numOfUsers){
            System.out.println("Please register yourself by entering the name - : \n");
            registeringUser();
        }
        else System.out.println("The work is accomplished");
    }
    void returnBook(){
        System.out.println("Enter your Username");
        String Username;
        int count = 0;
        int notFound = 0;
        Username = sc.nextLine();
        for(int i = 0; i < numOfUsers; ++i){
            if(registeredUser[i].equals(Username)){
                if(numofIssuedBooks == 0){
                    System.out.println("No book is being added");
                    break;
                }
                else{
                    System.out.println("Please enter the book you want to return");
                    String book;
                    book = sc.nextLine();
                    for(int j = 0; j < numofIssuedBooks; ++j){
                        if(IssuedBooks[j].equals(book)){
                            books[j] = returnBook[j];
                            LocalDateTime dt = LocalDateTime.now();
                            DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy -- E H:m a"); //* we can create any format through this but the date time symbols remains the same
                            String myDate = dt.format(df);
                            System.out.println("________________________________________\n");
                            System.out.println(returnBook[j] + " returned on " + myDate);
                            IssuedBooksWithTime[j] = book + "returned";
                            break;
                        }
                        else notFound++;
                    }
                    if(notFound == numofIssuedBooks){
                        System.out.println("Book not found");
                    }
                    else System.out.println("Task done");
                }
            }
            else count++;
        }
        if(count == numOfUsers){
            System.out.println("Please register yourself by entering the name - : \n");
            registeringUser();
        }
        else System.out.println("The work is accomplished");
    }
    void removeBook(){
        System.out.println("Enter your username");
        String Username;
        int countBooks = 0;
        int countUser = 0;
        Username = sc.nextLine();
        for(int i = 0; i < numOfUsers; ++i){
            if(registeredUser[i].equals(Username)){
                System.out.println("Enter the book you wanna remove");
                String book;
                book = sc.nextLine();
                if(books[numOfBooks - 1].equals(book)){
                    numOfBooks--;
                    System.out.println("The books was removed successfully");
                    break;
                }
                for(int j = 0; j < numOfBooks; ++j){
                    if(returnBook[j].equals(book)){
                        books[j] = books[numOfBooks - 1];
                        numOfBooks--;
                        System.out.println("The books was removed successfully");
                        break;
                    }
                    else countBooks++;
                }
                if(countBooks == numOfBooks){
                    System.out.println("Book not found");
                    int num = 0;
                    System.out.println("Press 1 - to re-try again");
                    num = sc.nextInt();
                    if(num == 1) removeBook();
                    else System.out.println("Re-directing to main-menu");
                }
            }
            else countUser++;
        }
        if(countUser == numOfUsers){
            System.out.println("Please register yourself by entering the name - : \n");
            registeringUser();
        }
        else System.out.println("The work is accomplished");
        
    }
}
public class LibraryManagementSystem {
    public static void main(String[] args) {
        myLibrary1 m = new myLibrary1();
        Scanner sc = new Scanner(System.in);
        int notTrue = 0;
        while(notTrue == 0){
            try{
                System.out.println("\nPlease Press ->\n1 - to register your name\n2 - to display books\n3 - to add books\n4 - to issue books\n5 - to return book\n6 - to see issued book list\n7 - to remove books\n8 - to quit");
                System.out.println("_________________________________________________________________________\n");
                int Choice = 0;
                Choice = sc.nextInt();
                switch(Choice){
                    case 1:{
                        m.registeringUser();
                        break;
                    }
                    case 2:{
                        m.totalBooks1();
                        break;
                    }
                    case 3:{
                        m.addBooks1();
                        break;
                    }
                    case 4:{
                        m.issueBook1();
                        break;
                    }
                    case 5:{
                        m.returnBook();
                        break;
                    }
                    case 6:{
                        m.displayIssuedBook();
                        break;
                    }
                    case 7:{
                        m.removeBook();
                        break;
                    }
                    case 8 :{
                        System.out.println("Thanks for joining in");
                        notTrue = 1;
                        break;
                    }
                    default :{
                        System.out.println("Invalid input\nTry again :(");
                    }
                }
            }
            catch(Exception e){
                System.out.println("Invalid input retry");
                // System.out.println("Press 1 to retry");
                
                continue;
            }
        }
        sc.close();
    }
}
// /home/synonymous/Desktop/Java Bootcamp/LibraryManagementSystem.java