package library.User;

public class User {
    public String name;


    public User(String name) {
        setName(name);
    }

    private void setName(String name) {
        this.name = name;
    }

    public String getUserName(){
        return name;
    }

}
