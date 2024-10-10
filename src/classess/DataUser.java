package classess;

public class DataUser {

    public User[] Poblado;

    private DataUser(Integer len) {
        this.Poblado = new User[len];
    }

    public Integer getLength() {
        return this.Poblado.length;
    }

    public static DataUser setPoblado(Integer totalUsers) {
        return new DataUser(totalUsers);
    }

    // imprimir poblado
    public void getPoblado() {
        for (User user : Poblado) {
            System.out.println("Nombre: " + user.getName());
            System.out.println("Edad: " + user.age);
        }
    }

    public void AddToPoblado(Integer index, User usuario) {
        this.Poblado[index] = usuario;
    }
}
