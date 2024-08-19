package class_basic.book;

public class Book {
    String title;
    String writer;
    int price;

    public Book(){
        title = "";
        writer = "";
        price = 0;
    }

    public Book(String title, String writer, int price) {
        this.title = title;
        this.writer = writer;
        this.price = price;
    }
}
