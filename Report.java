import java.util.Date;

public class Report {
    private String reportId;
    private String studentId;
    private String roomId;
    private String issueType;
    private String description;
    private Date reportDate;
    private String status;

    public Report(String reportId, String studentId, String roomId, String issueType, String description,
            Date reportDate, String status) {
        this.reportId = reportId;
        this.studentId = studentId;
        this.roomId = roomId;
        this.issueType = issueType;
        this.description = description;
        this.reportDate = reportDate;
        this.status = status;
    }

    public void submitReport() {
        System.out.println("Report submitted by student ID: " + studentId);
    }

    // Getters and Setters
    public String getReportId() {
        return reportId;
    }

    public void setReportId(String reportId) {
        this.reportId = reportId;
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

    public String getIssueType() {
        return issueType;
    }

    public void setIssueType(String issueType) {
        this.issueType = issueType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getReportDate() {
        return reportDate;
    }

    public void setReportDate(Date reportDate) {
        this.reportDate = reportDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
