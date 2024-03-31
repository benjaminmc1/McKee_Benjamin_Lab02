public class Worker extends Person {
    private double hourlyPay;

    public Worker(String idNum, String firstName, String lastName, String title, int YOB, double hourlyPay) {
        super(idNum, firstName, lastName, title, YOB);
        this.hourlyPay = hourlyPay;
    }

    public double getHourlyPay() {
        return hourlyPay;
    }

    public double calculateWeeklyPay(double hoursWorked) {
        double overtime = 0;
        double regular = 0;
        
        if (hoursWorked > 40) {
            overtime = (hoursWorked - 40) * (hourlyPay * 1.5);
            regular = 40 * hourlyPay;
            return regular + overtime;
        } else {
            regular = hoursWorked * hourlyPay;
            return regular;
        }
    }

    public String displayWeeklyPay(double hoursWorked) {
        if (hoursWorked > 40) {
            System.out.println("Regular Pay Hours: 40.0");
            System.out.println("Total Regular Pay: $" + (40 * hourlyPay));
            System.out.println("Overtime Hours: " + (hoursWorked - 40));
            System.out.println("Total Overtime Pay: $" + ((hoursWorked - 40) * (hourlyPay * 1.5)));
            System.out.println("Total Weekly Pay: $" + calculateWeeklyPay(hoursWorked));
        } else {
            System.out.println("Regular Pay Hours: " + hoursWorked);
            System.out.println("Total Pay: $" + calculateWeeklyPay(hoursWorked));
        }
        return "";
    }
}
