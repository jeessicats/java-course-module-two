package composicao.application;

import composicao.entities.Department;
import composicao.entities.HourContract;
import composicao.entities.Worker;
import composicao.entities.enums.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter department's name: ");
        String departmentName = sc.nextLine();
        System.out.println("Enter worker data: ");
        System.out.println("Name: ");
        String workerName = sc.nextLine();
        System.out.println("Enter level: ");
        String level = sc.nextLine();
        System.out.println("Base salary: ");
        double baseSalary = sc.nextDouble();

        Worker worker = new Worker(workerName, WorkerLevel.valueOf(level), baseSalary, new Department(departmentName));

        System.out.println("How many contracts to this worker? ");
        int numberOfContracts = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < numberOfContracts; i++) {
            System.out.println("Enter contract # " + i + "data:");
            System.out.print("Date (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(sc.next());
            System.out.println("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            sc.nextLine();
            System.out.println("Duration (hours): ");
            int duration = sc.nextInt();

            HourContract contract = new HourContract(contractDate, valuePerHour, duration);
            worker.addContract(contract);
        }

        System.out.println("Enter with month and year to calculate the income (MM/YYYY): ");
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));
        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartment().getName());
        System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.calculateSalary(year, month)));

        sc.close();
    }
}
