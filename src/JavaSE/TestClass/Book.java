package JavaSE.TestClass;

public class Book {
    public int id;
    public String bookName;
    public String authorName;

    public Book() {
    }

    public Book(int id, String bookName, String authorName) {
        this.id = id;
        this.bookName = bookName;
        this.authorName = authorName;
    }

    public String getData() {
        return "ID: " + id + ". Name: " + bookName + ". Author: " + authorName + ".";
    }

}
