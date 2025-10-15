package library.User;
import library.Printing;
import java.util.ArrayList;

public class UserManager  {
    static ArrayList<User> userList = new ArrayList<User>();

    // добавить пользователя


     public static User add() {
        System.out.println("Введите имя читателя");
        User user = new User(Printing.printScanner().toLowerCase());
        userList.add(user);
        System.out.println("Пользователь добавлен: " + user.getUserName());
        return user;
    }

    // напечатать список пользователей
      public static void printList() {
        for (User user : userList) {
            if (user != null) {
                System.out.println(user.getUserName());
            }
            else {
                System.out.println("Нет пользователей");
            }
        }
    }

    // поиск пользователя как объекта
     public static User search() {
        System.out.println("Введите имя пользователя");
        String name = Printing.printScanner().toLowerCase();
        for (User user : userList) {
            if (user.getUserName().equals(name)) {
                return user;
            }
        }
        System.out.println("Пользователь не найден, добавьте его? y/n");
        if (Printing.printScanner().equalsIgnoreCase("y")) {
                return add();
        }
        return null;
    }



}


