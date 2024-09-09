
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner s = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter departament's name: ");
        String departamentName = s.nextLine();

        System.out.println("Enter worker Data: ");
        System.out.println("Name: ");
        String workerName = s.nextLine();

        System.out.println("Worker Level");
        String workerLevel = s.nextLine();

        System.out.println("Base Salary: ");
        double baseSalary = s.nextDouble();

        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary,
                new department(departamentName));

        System.out.println("How many contract to this worker :");
        int n = s.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter contract #" + i + "data: ");
            System.out.print("Date (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(s.next());

            System.out.print("Value per hour: ");
            double valuePerHour = s.nextDouble();

            System.out.print("Duration (hours)");
            int hours = s.nextInt();

            contract contracts = new contract(contractDate, valuePerHour, hours);
            worker.addContract(contracts);

        }
        System.out.println();
        System.out.println("Enter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = s.next();
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));

        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartment().getName());
        System.out.println("Income for: " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));

    }
}
