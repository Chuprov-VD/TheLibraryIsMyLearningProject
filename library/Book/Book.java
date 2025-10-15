package library.Book;

public class Book {


    String bookName;


    public Book(String bookName) {
        setBookName(bookName);
    }


    private void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookName() {
        return bookName;
    }

}
