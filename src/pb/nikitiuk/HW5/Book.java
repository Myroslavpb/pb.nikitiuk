package pb.nikitiuk.HW5;

public class Book {


    String name;
      String author;
      int year;
public Book(String name, String author, int year) {
    this.name=name;
this.author=author;
}


    String getInfoBook() {
    return "Title: " +  name + "  Author: " + author;
    }
}