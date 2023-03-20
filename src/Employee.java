public class Employee extends Worker{

    public String employeeName;
    public String employeeAddress;
    public String employeeManager;
    private String dateOfHire;
    private int employeeAge;

    public Employee(String employeeName, String employeeAddress, String employeeManager, String dateOfHire, int employeeAge) {
        this.employeeName = employeeName;
        this.employeeAddress = employeeAddress;
        this.employeeManager = employeeManager;
        this.dateOfHire = dateOfHire;
        this.employeeAge = employeeAge;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeAddress() {
        return employeeAddress;
    }

    public void setEmployeeAddress(String employeeAddress) {
        this.employeeAddress = employeeAddress;
    }

    public String getEmployeeManager() {
        return employeeManager;
    }

    public void setEmployeeManager(String employeeManager) {
        this.employeeManager = employeeManager;
    }

    public String getDateOfHire() {
        return dateOfHire;
    }

    public void setDateOfHire(String dateOfHire) {
        this.dateOfHire = dateOfHire;
    }

    public int getEmployeeAge() {
        return employeeAge;
    }

    public void setEmployeeAge(int employeeAge) {
        this.employeeAge = employeeAge;
    }

    public void clean(){}

    public void cook(){}

    public void serveClients(){}

    private void communication(){}
}
