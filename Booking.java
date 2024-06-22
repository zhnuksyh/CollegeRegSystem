import java.util.Date;

public class Booking {
    private String bookingId;
    private String studentId;
    private String roomId;
    private Date bookingDate;
    private String status;

    public Booking(String bookingId, String studentId, String roomId, Date bookingDate, String status) {
        this.bookingId = bookingId;
        this.studentId = studentId;
        this.roomId = roomId;
        this.bookingDate = bookingDate;
        this.status = status;
    }

    // Getters and Setters
    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public Date getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(Date bookingDate) {
        this.bookingDate = bookingDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
