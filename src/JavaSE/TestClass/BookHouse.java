package JavaSE.TestClass;

public class BookHouse {
    public Book[] books = new Book[1000];
    public int size = 0;

    public void addBook(Book book) {
        books[size] = book;
        size++;
    }

    public void printBooks() {
        for (int i = 0; i < size; i++) {
            System.out.println(books[i].getData());
        }
    }

    public void searchBook(String name){
        int a = -1;
        for (int i = 0; i < size; i++) {
            if (books[i].bookName==name) {
                a = i;
            }
        }
        if (a>=0){
            System.out.println(books[a].getData());
        } else {
            System.out.println("Data Not Found");
        }
    }

}
