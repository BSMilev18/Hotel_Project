public class Rooms {

    public String roomType;
    public int roomNumber;
    public double pricePerNight;

    public Rooms(String roomType, int roomNumber, double pricePerNight) {
        this.roomType = roomType;
        this.roomNumber = roomNumber;
        this.pricePerNight = pricePerNight;
    }

    public Rooms() {}

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(double pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    public boolean isBookmarked(){
        return false;
    }

    public void putUnderMaintenance(){}
}
