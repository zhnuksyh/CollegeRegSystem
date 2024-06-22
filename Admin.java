public class Admin extends User {
    public Admin(String userId, String name, String email, String password, String role) {
        super(userId, name, email, password, role);
    }

    public void approveRegistration() {
        System.out.println("Registration approved by admin: " + name);
    }

    public void updateRoomAvailability() {
        System.out.println("Room availability updated by admin: " + name);
    }

    public void updateRoomCondition() {
        System.out.println("Room condition updated by admin: " + name);
    }
}
