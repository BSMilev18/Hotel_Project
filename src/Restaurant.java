public class Restaurant extends Rooms{

    public String dailyMenu;
    public String openingHour;
    public String closingHour;
    public String employees;
    private int serviceId;

    public Restaurant(String dailyMenu, String openingHour, String closingHour, String employees, int serviceId) {
        this.dailyMenu = dailyMenu;
        this.openingHour = openingHour;
        this.closingHour = closingHour;
        this.employees = employees;
        this.serviceId = serviceId;
    }

    public String getDailyMenu() {
        return dailyMenu;
    }

    public void setDailyMenu(String dailyMenu) {
        this.dailyMenu = dailyMenu;
    }

    public String getOpeningHour() {
        return openingHour;
    }

    public void setOpeningHour(String openingHour) {
        this.openingHour = openingHour;
    }

    public String getClosingHour() {
        return closingHour;
    }

    public void setClosingHour(String closingHour) {
        this.closingHour = closingHour;
    }

    public String getEmployees() {
        return employees;
    }

    public void setEmployees(String employees) {
        this.employees = employees;
    }

    public int getServiceId() {
        return serviceId;
    }

    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
    }

    public void serveFood(){}

    public void throwAwayFood(){}

    private void deliverFood(){}
}
