
import java.util.ArrayList;

class BookManager{
    int isbn ;
    String title;
    String author;
    boolean availability;
    BookManager(int isbn, String title, String author, boolean availability){
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.availability = availability;
    }
}

class Library{
    ArrayList<BookManager> books;
    Library(){
        books = new ArrayList<BookManager>();
    }
}

public class LibraryBookManagementSystem {
    public static void main(String[] args) {

    }
}
