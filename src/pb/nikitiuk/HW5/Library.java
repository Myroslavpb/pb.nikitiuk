package pb.nikitiuk.HW5;
import java.util.Arrays;
import java.util.Scanner;

public class Library {
        private static Object Book;

        public static void main(String[] args) {
            int bookCount;

        Scanner input = new Scanner(System.in);

{


            Scanner title = new Scanner(System.in);


        }


        Reader reader = new Reader("Smith A.A", 1,"Filfack","12.12.2000","+380934455567");
        Reader reader1 = new Reader("John A.A", 2,"Ekonomika","12.12.2001","+7865285");
        Reader reader2 = new Reader("Chan J.A", 3,"Politics","12.12.2001","+45678388");

Reader [] readers = {reader,reader1,reader2};



        Book book = new Book("\"The Inhabited Island\"",  "Arkady and Boris Strugatskie",1969);
        Book book1 = new Book("Night Watch","SIR TERRY PRATCHETT",2002);
        Book book2 = new Book(" The Adventures of Sherlock Holmes","Conan Doyle",1891);
Book [] books = {book,book1,book2};
bookCount = books.length;


        System.out.println("what you want to do?");
        System.out.println("Print \"readers\" to find out readers name;");
        System.out.println("Print \"books\" which books left");
            System.out.println("Print \"take\" to find out who take which book/s");
        System.out.println("Print \"exit\" to left");
            System.out.println("Print \"take\" to enter how many books take reader");
        String x = input.next();
        if ("readers".equals(x)){
            System.out.println(reader.getInfoReader() + "\n" + reader1.getInfoReader() + "\n"+ reader2.getInfoReader() + "\n" );}

        if ("books".equals(x))
           System.out.println(book.getInfoBook() + "\n" + book1.getInfoBook()+ "\n" + book2.getInfoBook() + "\nreaders have "+ bookCount + " books");

        if ("exit".equals(x))
            System.out.println("Bye!");

          if ("take".equals(x)) {

              reader.takeBook(reader1.getInfoReader());
          }







    }

}