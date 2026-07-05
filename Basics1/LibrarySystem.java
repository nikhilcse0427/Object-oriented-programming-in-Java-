import java.util.*;

class Book{
  private String bookId;
  private String title;
  private String author;
  private boolean isIssued;
  public static int numOfObj = 0;

  Book(String bookId, String title, String author){
    this.bookId = bookId;
    this.title = title;
    this.author = author;
    this.isIssued = false;
    numOfObj++;
  }

  void setBookId(String bookId){
    this.bookId = bookId;
  }

  String getBookId(){
    return this.bookId;
  }

  void setTitle(String title){
    this.title = title;
  }

  String getTitle(){
    return this.title;
  }

  void setAuthor(String author){
    this.author = author;
  }

  String getAuthor(){
    return this.author;
  }

  void displayBookInfo(){
    System.out.println("Book details: ");
    System.out.println("Book Id: "+ this.bookId);
    System.out.println("Book Title: "+ this.title);
    System.out.println("Book Author: "+ this.author);
    System.out.println("Book Issued: "+ this.isIssued);
  }
}

public class LibrarySystem{
  
  public static void main(String[] args){
    Book book1 = new Book("bk12", "AI Engineer", "Nikhil Verma");
    book1.displayBookInfo();
    Book book2 = new Book("bk12", "AI Engineer", "Nikhil Verma");
    Book book3 = new Book("bk12", "AI Engineer", "Nikhil Verma");
    Book book4 = new Book("bk12", "AI Engineer", "Nikhil Verma");
    Book book5 = new Book("bk12", "AI Engineer", "Nikhil Verma");
    System.out.println("count: "+Book.numOfObj);

  }
}