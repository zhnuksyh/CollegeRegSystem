import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Authentication auth = new Authentication();

        System.out.println("Register a new user:");
        System.out.print("Enter user ID: ");
        String userId = scanner.nextLine();
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter email: ");
        String email = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        System.out.print("Enter role (student/admin): ");
        String role = scanner.nextLine();

        if (role.equalsIgnoreCase("student")) {
            System.out.print("Enter student ID: ");
            String studentId = scanner.nextLine();
            System.out.print("Enter course: ");
            String course = scanner.nextLine();
            System.out.print("Enter year of study: ");
            int yearOfStudy = scanner.nextInt();
            Student student = new Student(userId, name, email, password, role, studentId, course, yearOfStudy);
            auth.registerNewUser(student);
            student.login();
        } else if (role.equalsIgnoreCase("admin")) {
            Admin admin = new Admin(userId, name, email, password, role);
            auth.registerNewUser(admin);
            admin.login();
        } else {
            System.out.println("Invalid role.");
            return;
        }

        System.out.println("What would you like to do?");
        System.out.println("1. Update profile (Student only)");
        System.out.println("2. Approve registration (Admin only)");
        System.out.println("3. Update room availability (Admin only)");
        System.out.println("4. Update room condition (Admin only)");
        System.out.println("5. Book a room (Student only)");
        System.out.println("6. Submit a report (Student only)");
        System.out.println("7. View available rooms");
        System.out.println("8. Select a room");
        System.out.println("9. Request room change");
        System.out.println("10. Report an issue");
        System.out.println("11. Exit");

        boolean exit = false;

        while (!exit) {
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over

            switch (choice) {
                case 1:
                    if (role.equalsIgnoreCase("student")) {
                        System.out.print("Enter student ID to update profile: ");
                        String studentId = scanner.nextLine();
                        // Logic to update profile
                        System.out.println("Profile updated for student ID: " + studentId);
                    } else {
                        System.out.println("Only students can update their profile.");
                    }
                    break;
                case 2:
                    if (role.equalsIgnoreCase("admin")) {
                        System.out.println("Registration approved by admin.");
                    } else {
                        System.out.println("Only admins can approve registrations.");
                    }
                    break;
                case 3:
                    if (role.equalsIgnoreCase("admin")) {
                        System.out.println("Room availability updated.");
                    } else {
                        System.out.println("Only admins can update room availability.");
                    }
                    break;
                case 4:
                    if (role.equalsIgnoreCase("admin")) {
                        System.out.println("Room condition updated.");
                    } else {
                        System.out.println("Only admins can update room conditions.");
                    }
                    break;
                case 5:
                    if (role.equalsIgnoreCase("student")) {
                        System.out.print("Enter booking ID: ");
                        String bookingId = scanner.nextLine();
                        System.out.print("Enter room ID: ");
                        String roomId = scanner.nextLine();
                        Booking booking = new Booking(bookingId, userId, roomId, new Date(), "Pending");
                        System.out.println("Room booked with booking ID: " + bookingId);
                    } else {
                        System.out.println("Only students can book rooms.");
                    }
                    break;
                case 6:
                    if (role.equalsIgnoreCase("student")) {
                        System.out.print("Enter report ID: ");
                        String reportId = scanner.nextLine();
                        System.out.print("Enter room ID: ");
                        String roomId = scanner.nextLine();
                        System.out.print("Enter issue type: ");
                        String issueType = scanner.nextLine();
                        System.out.print("Enter description: ");
                        String description = scanner.nextLine();
                        Report report = new Report(reportId, userId, roomId, issueType, description, new Date(),
                                "Submitted");
                        report.submitReport();
                    } else {
                        System.out.println("Only students can submit reports.");
                    }
                    break;
                case 7:
                    System.out.println("Available rooms viewed.");
                    break;
                case 8:
                    System.out.print("Enter room ID to select: ");
                    String selectRoomId = scanner.nextLine();
                    System.out.println("Room selected: " + selectRoomId);
                    break;
                case 9:
                    System.out.print("Enter room ID to request change: ");
                    String changeRoomId = scanner.nextLine();
                    System.out.println("Room change requested for room ID: " + changeRoomId);
                    break;
                case 10:
                    System.out.print("Enter room ID to report issue: ");
                    String reportIssueRoomId = scanner.nextLine();
                    System.out.println("Issue reported for room ID: " + reportIssueRoomId);
                    break;
                case 11:
                    exit = true;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }
}
