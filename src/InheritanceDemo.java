import java.util.ArrayList;

public class InheritanceDemo {
    public static void main(String[] args) {
        Worker worker1, worker2, worker3;
        SalaryWorker salaryWorker1, salaryWorker2, salaryWorker3;
        ArrayList<Worker> workerList = new ArrayList<Worker>();

        worker1 =  new Worker("000001", "John", "Doe", "Mr.", 1980, 20.50);
        worker2 = new Worker("000002", "Jane", "Doe", "Mrs.", 1985, 25.00);
        worker3 = new Worker("000003", "Joe", "Doe", "Dr.", 1990, 30.00);
        workerList.add(worker1);
        workerList.add(worker2);
        workerList.add(worker3);
        salaryWorker1 = new SalaryWorker("000004", "Jill", "Doe", "Prof.", 1995, 35.00, 50000.00);
        salaryWorker2 = new SalaryWorker("000005", "Jack", "Doe", "Assoc. Prof.", 2000, 40.00, 100000.00);
        salaryWorker3 = new SalaryWorker("000006", "Jolene", "Doe", "Assoc. Prof.", 2005, 45.00, 150000.00);
        workerList.add(salaryWorker1);
        workerList.add(salaryWorker2);
        workerList.add(salaryWorker3);

        int weekNumber = 1;
        int[] hoursWorked = {40, 50, 40};

        for (int hours : hoursWorked) {
            System.out.println("Week " + weekNumber);
            for (Worker eachWorker : workerList) {
                System.out.println(eachWorker.getFirstName() + " " + eachWorker.getLastName());
                System.out.println(eachWorker.displayWeeklyPay(hours));
            }
            weekNumber++;
        }
    }
}
