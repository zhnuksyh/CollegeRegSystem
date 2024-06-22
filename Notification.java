import java.util.Date;

public class Notification {
    private String notificationId;
    private String userId;
    private String message;
    private Date date;

    public Notification(String notificationId, String userId, String message, Date date) {
        this.notificationId = notificationId;
        this.userId = userId;
        this.message = message;
        this.date = date;
    }

    public void sendNotification() {
        System.out.println("Notification sent to user ID: " + userId);
    }

    public void viewNotifications() {
        System.out.println("Notifications viewed for user ID: " + userId);
    }

    // Getters and Setters
    public String getNotificationId() {
        return notificationId;
    }

    public void setNotificationId(String notificationId) {
        this.notificationId = notificationId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
