public class Worker {

    public int workerId;
    public String workerJob;
    private double workerSalary;

    public Worker(int workerId, String workerJob, double workerSalary) {
        this.workerId = workerId;
        this.workerJob = workerJob;
        this.workerSalary = workerSalary;
    }

    public Worker() {}

    public int getWorkerId() {
        return workerId;
    }

    public void setWorkerId(int workerId) {
        this.workerId = workerId;
    }

    public String getWorkerJob() {
        return workerJob;
    }

    public void setWorkerJob(String workerJob) {
        this.workerJob = workerJob;
    }

    public double getWorkerSalary() {
        return workerSalary;
    }

    public void setWorkerSalary(double workerSalary) {
        this.workerSalary = workerSalary;
    }

    private void clockIn(){}

    private void clockOut(){}
}