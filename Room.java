public class Room {
    private String roomId;
    private String roomType;
    private int capacity;
    private boolean availability;

    public Room(String roomId, String roomType, int capacity, boolean availability) {
        this.roomId = roomId;
        this.roomType = roomType;
        this.capacity = capacity;
        this.availability = availability;
    }

    public void viewAvailableRooms() {
        System.out.println("Available rooms viewed.");
    }

    public void selectRoom() {
        System.out.println("Room selected: " + roomId);
    }

    public void requestRoomChange() {
        System.out.println("Room change requested for room ID: " + roomId);
    }

    public void reportIssue() {
        System.out.println("Issue reported for room ID: " + roomId);
    }

    // Getters and Setters
    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }
}
