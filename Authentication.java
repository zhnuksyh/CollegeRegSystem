public class Authentication {
    public void authenticateUser(User user) {
        System.out.println("User authenticated: " + user.name);
    }

    public void resetPassword(User user) {
        System.out.println("Password reset for user: " + user.name);
    }

    public void registerNewUser(User user) {
        System.out.println("New user registered: " + user.name);
    }
}
