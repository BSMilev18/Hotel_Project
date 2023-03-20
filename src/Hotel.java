public class Hotel {

    public String hotelName;
    public int hotelId;
    public String hotelLocation;
    private double hotelBudget;

    public Hotel(String hotelName, int hotelId, String hotelLocation, double hotelBudget) {
        this.hotelName = hotelName;
        this.hotelId = hotelId;
        this.hotelLocation = hotelLocation;
        this.hotelBudget = hotelBudget;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public int getHotelId() {
        return hotelId;
    }

    public void setHotelId(int hotelId) {
        this.hotelId = hotelId;
    }

    public String getHotelLocation() {
        return hotelLocation;
    }

    public void setHotelLocation(String hotelLocation) {
        this.hotelLocation = hotelLocation;
    }

    public double getHotelBudget() {
        return hotelBudget;
    }

    public void setHotelBudget(double hotelBudget) {
        this.hotelBudget = hotelBudget;
    }

    public String giveService(){
        Client c1 = new Client();
        return "The hotel staff has provided service to client number " + c1.getClientId() + "!";
    }

    public String manages(){
        Worker w1 = new Worker();
        return "Worker number " + w1.getWorkerId() + " has been updated!";
    }

    public String maintains(){
        Rooms r1 = new Rooms();
        return "Room number " + r1.getRoomNumber() + " has been maintained!";
    }

    public String loadWithFood(){
        return "The restaurant has been loaded with food!";
    }
}
