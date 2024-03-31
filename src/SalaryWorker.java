public class SalaryWorker extends Worker {
    double annual;

    public SalaryWorker(String idNum, String firstName, String lastName, String title, int YOB, double hourlyPayRate, double annual) {
        super(idNum, firstName, lastName, title, YOB, hourlyPayRate);
        this.annual = annual;
    }

    @Override
    public double calculateWeeklyPay(double hoursWorked) {
        return (annual / 52);
    }

    @Override
    public String displayWeeklyPay(double hoursWorked) {
        System.out.println("Weekly Pay: $" + String.format("%.2f", calculateWeeklyPay(hoursWorked)));
        return "";
    }
}
