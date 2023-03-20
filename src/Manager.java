public class Manager extends Worker{

    public String managerName;
    public String managerAddress;
    private int dateOfHire;
    private int managerAge;

    public Manager(String managerName, String managerAddress, int dateOfHire, int managerAge) {
        this.managerName = managerName;
        this.managerAddress = managerAddress;
        this.dateOfHire = dateOfHire;
        this.managerAge = managerAge;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public String getManagerAddress() {
        return managerAddress;
    }

    public void setManagerAddress(String managerAddress) {
        this.managerAddress = managerAddress;
    }

    public int getDateOfHire() {
        return dateOfHire;
    }

    public void setDateOfHire(int dateOfHire) {
        this.dateOfHire = dateOfHire;
    }

    public int getManagerAge() {
        return managerAge;
    }

    public void setManagerAge(int managerAge) {
        this.managerAge = managerAge;
    }

    public void manageStuff(){}
}
