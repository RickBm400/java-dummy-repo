import classess.*;
import java.io.Console;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("que pasa puta");
        User Ricko = User.createUser("Rikoso");
        System.out.println(Ricko.getName());
        System.out.println("Hola de nuevo " + Ricko.getName());

        Console con = System.console();
        if (con == null) {
            System.err.println("No console");
            System.exit(1);
        }

        String log = con.readLine("\n Enter logoso:");
        System.out.println(log + "> thafk logoso ");
    }
}
