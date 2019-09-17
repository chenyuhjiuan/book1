public class BookdataApp {


    String SKU;
    String title;
    String author;
    String description;
    double price;

    public BookdataApp() {
    }

    public BookdataApp(String SKU, String title, String author, String description, double price) {
        this.SKU=SKU;
        this.title = title;
        this.author = author;
        this.description = description;
        this.price = price;
    }

    public String getSKU() {
        return SKU;
    }

    public void setSKU(String SKU) {
        this.SKU = SKU;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public BookdataApp populate (String enteredSKU){
        BookdataApp bookdb= new BookdataApp("","","","",0.00);
        if(enteredSKU.contentEquals(getSKU()))
            bookdb=new BookdataApp(getSKU(),getTitle(),getAuthor(),getDescription(),getPrice());
        else {bookdb=new BookdataApp("","","","",0.00);}



        return bookdb ;

    }

    public void diplayTxt(){
        System.out.print(getSKU()+'\t'+getTitle()+'\t'+getAuthor()+'\t'+getDescription()+getPrice());
    }


}
