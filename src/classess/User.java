package classess;
public class User {
    public String name;
    public int age = 0;

    private User(String name) {
        this.name = name;
    }
    
    public static User createUser(String name) { // Factory pattern
        return new User(name);
    }

    public String getName() {
        return this.name;
    }
}
