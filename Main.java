import library.Library;
import library.User.UserManager;


public class Main {
    public static void main(String[] args) {


       for (int i = 0; i < 2; i++) {
           UserManager.add();
       }
        Library.bookManagerLibrary.addBook();
        Library.addUserAndBook();
        Library.addUserAndBook();

        Library.bookManagerLibrary.printList();
        Library.printMap();
        Library.removeUserList();
        Library.printMap();
        Library.bookManagerLibrary.printList();
    }
}
