public class Student extends User {
    private String studentId;
    private String course;
    private int yearOfStudy;

    public Student(String userId, String name, String email, String password, String role, String studentId,
            String course, int yearOfStudy) {
        super(userId, name, email, password, role);
        this.studentId = studentId;
        this.course = course;
        this.yearOfStudy = yearOfStudy;
    }

    public void updateProfile() {
        System.out.println("Profile updated for student: " + name);
    }

    // Getters and Setters
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }
}
