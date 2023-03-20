public class Client {

    public int clientId;
    public String clientName;
    private double payment;

    public Client(int clientId, String clientName, double payment) {
        this.clientId = clientId;
        this.clientName = clientName;
        this.payment = payment;
    }

    public Client() {}

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public double getPayment() {
        return payment;
    }

    public void setPayment(double payment) {
        this.payment = payment;
    }

    public void payForRoom(){}

    public void amountOfStays(){}
}
