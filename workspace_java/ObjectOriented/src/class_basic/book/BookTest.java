package class_basic.book;

public class BookTest {
    public static void main(String[] args) {
        Book book1 = new Book("자바", "김", 1000);
        System.out.println(book1.title);

        Book book2 = new Book("파이썬", "이", 2000);
        System.out.println(book2.title);

        Book book3 = book1;

        System.out.println(book1.title); // java
        System.out.println(book3.title); // java

        book1.title = "c++";

        System.out.println(book1.title); // c++
        System.out.println(book3.title); // c++




    }
}
