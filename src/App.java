import classess.*;
import java.io.Console;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("que pasa puta");
        // User Ricko = User.createUser("Rikoso");
        // System.out.println(Ricko.getName());
        // System.out.println("Hola de nuevo " + Ricko.getName());

        // Console con = System.console();
        // if (con == null) {
        // System.err.println("No console");
        // System.exit(1);
        // }

        Integer ino = Integer.parseInt("110");
        System.out.println(ino > 0 || ino < 200);
        Console input = System.console();
        Integer totalPeople = Integer.parseInt(input.readLine("Numero de personas en el poblado"));

        DataUser listaPoblado = DataUser.setPoblado(totalPeople);

        for (int i = 0; i < listaPoblado.getLength(); i++) {
            String name = input.readLine("Nombre para el usuario " + i + "\n");
            Integer age = Integer.parseInt(input.readLine("Edad del usuario: "));

            User pruebas = User.createUser(name, age);
            System.out.println("Usuario creado");

            listaPoblado.AddToPoblado(i, pruebas);
        }

        listaPoblado.getPoblado();
    }
}
