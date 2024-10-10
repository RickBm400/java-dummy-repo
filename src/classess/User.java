package classess;

import java.util.Optional;

public class User {
    public String name;
    public int age;

    private User(String name, Optional<Integer> age) {
        this.age = age.orElse(0);
        this.name = name;
    }

    public static User createUser(String name, Integer age) { // Factory pattern
        return new User(name, Optional.of(age));
    }

    public String getName() {
        return this.name;
    }

    static void classOla() {
        System.out.println("olasas");
    }

}
