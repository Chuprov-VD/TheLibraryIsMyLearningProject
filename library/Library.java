package library;

import library.Book.Book;
import library.Book.BookManager;
import library.User.User;
import library.User.UserManager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class Library {

    static public HashMap<User, ArrayList<Book>> map = new HashMap<>();
    static public BookManager bookManagerLibrary = new BookManager();


    static public void addUserAndBook() {
        BookManager bookManager = new BookManager();
        System.out.println("Добавить из уже зарегистрированных пользователей? y/n");
        String answer = Printing.printScanner();

        User user;
        if (answer.equalsIgnoreCase("y")) {
            user = UserManager.search();
            bookManager.addBook();
        }
        else {
            user = UserManager.add();
        }
        map.put(user, bookManager.getBookList());
        bookManagerLibrary.movingFrom(bookManager.getBookList());
    }


    static public void printMap() {
        for (Map.Entry<User, ArrayList<Book>> entry : map.entrySet()) {
            System.out.println(entry.getKey().getUserName() + ": " ); for (Book book : entry.getValue()) {
               System.out.print(book.getBookName() + " ");
            }
            System.out.println();
        }
    }

    static public void removeUserList() {
        User user = UserManager.search();
        bookManagerLibrary.setBookList(map.get(user)); // добавляем список книг обратно в библиотеку, после возврата Юзером
        boolean contains = map.containsKey(user);
        if (contains) {
            map.remove(user);
        } else {
            System.out.println("Пользователь не найден");
        }
    }

}

