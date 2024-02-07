package JavaSE.TestTryCatch;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Book book1 = null;
        library.addBook(book1);
        library.printBooks();
    }

}
