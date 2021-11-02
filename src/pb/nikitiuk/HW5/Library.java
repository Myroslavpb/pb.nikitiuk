package pb.nikitiuk.HW5;
import java.util.Scanner;
public class Library {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        Reader reader = new Reader();
        Reader reader1 = new Reader();
        Reader reader2 = new Reader();

        reader.FIO = "Smith A.A";
        reader.birth= "12.12.2000";
        reader.Faculty = "Filfack";
        reader.number = 1;
        reader.tel = "+380934455567";

        reader1.FIO = "John A.A";
        reader1.birth= "12.12.2001";
        reader1.Faculty = "ekonomika";
        reader1.number = 2;
        reader1.tel = "+3809345567";

        reader2.FIO = "Chan J.A";
        reader2.birth= "12.12.2001";
        reader2.Faculty = "ekonomika";
        reader2.number = 2;
        reader2.tel = "+3809345567";


        Book book = new Book();
        Book book1 = new Book();
        Book book2 = new Book();

        book.name = "The Inhabited Island";
        book.author = "Arkady and Boris Strugatskie";
        book.year = 1969;

        book1.name = "Night Watch";
        book1.author = "SIR TERRY PRATCHETT";
        book1.year =  2020;

        book2.name = " The Adventures of Sherlock Holmes";
        book2.author = "Conan Doyle";
        book2.year = 1891;
        System.out.println("what you want to do?");
        System.out.println("Print \"readres\" to find out readers name;");
        System.out.println("Print \"books\" which books left");
        System.out.println("Print \"exit\" to left");
        String x = input.next();
 if ("readers".equals(x))
 System.out.println(reader.FIO+"\t"+ reader1.FIO+"\t"+reader2.FIO);

if ("books".equals(x))
    System.out.println(book.name + "\t" + book1.name + "\t" + book2.name);

if ("exit".equals(x))
    System.out.println("Bye!");




    }

}
