import java.util.Scanner;

public abstract class User {
    protected String userId;
    protected String name;
    protected String email;
    protected String password;
    protected String role;

    public User(String userId, String name, String email, String password, String role) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    public void login() {
        System.out.println(name + " logged in.");
    }

    public void recoverPassword() {
        System.out.println("Password recovery email sent to " + email);
    }

    public void createAccount() {
        System.out.println("Account created for " + name);
    }
}
