package library.Book;

import library.Printing;

import java.util.ArrayList;


public class BookManager {

    ArrayList<Book> bookList = new ArrayList<>();

    public ArrayList<Book> getBookList() {
        return new ArrayList<>(bookList);
    }

    public void setBookList(ArrayList<Book> bookList) {
        this.bookList.addAll(bookList);
    }

    public void addBook() {
        System.out.println("Введите название книги, для выхода введите exit");
        boolean flag = true;
        while (flag) {
            String answer = Printing.printScanner();
            if (answer.equalsIgnoreCase("exit")) {
                flag = false;
            } else {
                Book book = new Book(answer.toLowerCase());
                bookList.add(book);
                System.out.println("Книга добавлена: " + book.getBookName());
            }
        }
    }

    public void removal() {
        System.out.println("Введите название книги для удаления");
        Book book = search();
        bookList.remove(book);
    }

    public void movingFrom(ArrayList<Book> bookListRemove) {
        for (Book book : bookListRemove) {
            bookList.remove(search(book.getBookName()));
        }
    }

    public Book search(String nameBook) {
        for (Book book : bookList) {
            if (book.getBookName().equalsIgnoreCase(nameBook)) {
                return book;
            }
        }
        return null;
    }

    public Book search() {
        for (Book book : bookList) {
            if (book.getBookName().equals(Printing.printScanner().toLowerCase())) {
                return book;
            }
        }
        System.out.println("Book not found");
        return null;
    }

    public void printList() {
        for (Book book : bookList) {
            System.out.println(book.getBookName());
        }
    }
}
