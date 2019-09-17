import java.util.ArrayList;
import java.util.Scanner;

public class Book {

    public static void main(String arg[]){

        //ArrayList<BookdataApp> bookdatas= new ArrayList<BookdataApp>();
        //Scanner sc = new Scanner(System.in);
        //BookdataApp bookdata = new BookdataApp();

        BookdataApp book= new BookdataApp();
        book.setSKU("Java1001");
        book.setTitle("Head First Java");
        book.setAuthor("Kathy Sierra and Bert Bates");
        book.setDescription("Easy to read Java workbook");
        book.setPrice(47.50);
        book.diplayTxt();
        System.out.println();
        book.setSKU("Java1002");
        book.setTitle("Thinking in Java");
        book.setAuthor("Bruce Eckel");
        book.setDescription("Details about Java under the hood");
        book.setPrice(20.00);
        book.diplayTxt();
        System.out.println();
        book.diplayTxt();

        book.setSKU("Java1002");
        book.setTitle("Thinking in Java");
        book.setAuthor("Bruce Eckel");
        book.setDescription("Details about Java under the hood");
        book.setPrice(20.00);
        book.diplayTxt();
        System.out.println();



   /* public BookdataApp populateStr(String sku){
        BookdataApp bookdataApp= new BookdataApp("","","","",0.0);
        if(sku.equalsIgnoreCase("Java1001")){
            bookdataApp=new BookdataApp("Java1001","Head First Java","Kathy Sierra and Bert Bates","Easy to read Java workbook",47.50);
        }
        if(sku.equalsIgnoreCase("Java1002")){
            bookdataApp=new BookdataApp("Java1002","Thinking in Java","Bruce Eckel","Jeanne Boyarsky",20.00);
        }
        if(sku.equalsIgnoreCase("Orcl1003")){
            bookdataApp=new BookdataApp("Orcl1003","Certified Professional Java","Kathy Sierra and Bert Bates","Easy to read Java workbook",47.50);
        }

        if(sku.equalsIgnoreCase("Java1001")){
            bookdataApp=new BookdataApp("Java1001","Head First Java","Kathy Sierra and Bert Bates","Easy to read Java workbook",47.50);
        }
        if(sku.equalsIgnoreCase("Java1001")){
            bookdataApp=new BookdataApp("Java1001","Head First Java","Kathy Sierra and Bert Bates","Easy to read Java workbook",47.50);
        }
        if(sku.equalsIgnoreCase("Java1001")){
            bookdataApp=new BookdataApp("Java1001","Head First Java","Kathy Sierra and Bert Bates","Easy to read Java workbook",47.50);
        }
        if(sku.equalsIgnoreCase("Java1001")){
            bookdataApp=new BookdataApp("Java1001","Head First Java","Kathy Sierra and Bert Bates","Easy to read Java workbook",47.50);
        }else {bookdataApp=new BookdataApp("wrong sku number","not available","not available","not available",0.00);}

        return bookdataApp;
    }*/
}}
