package pb.nikitiuk.HW5;
import java.util.Scanner;
public class Reader {

    Scanner input = new Scanner(System.in);
    private String FIO;
     int number;
    private String Faculty;
    private  String birth;
    private  String tel;
public int n;

    public Reader(String FIO, int number, String faculty, String birth, String tel) {
        this.FIO = FIO;
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    String getInfoReader() {
        return "Reader name:" + FIO;
    }

   public void takeBook(String FIO) {
       System.out.println("Enter id");
    number = input.nextInt();
        System.out.println("Enter How many books take" + getInfoReader());
            n = input.nextInt();
            if (n>3)
         System.out.println(getInfoReader() + "error we do not have so many book....... resttaas");
            else
       System.out.println(getInfoReader() + " take  " + n + " books ");
           }
//    public void takeBook(String FIO, String) {
//        System.out.println("Enter id");
//        number = input.nextInt();
//        System.out.println("Enter How many books take" + getInfoReader());
//        n = input.nextInt();
//        System.out.println(getInfoReader() + " take  " + n + " books ");


}