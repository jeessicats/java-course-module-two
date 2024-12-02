package exercicio1.application;

import exercicio1.entities.Employee;
import exercicio1.entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) { // Ajustei o loop para começar do 1 (mais usual para exibição de números de empregados)
            System.out.println("Employee #" + i + ": ");
            System.out.print("Outsourced Employee (y/n)? ");
            char ch = sc.next().charAt(0);

            System.out.print("Name: ");
            sc.nextLine(); // Consome a quebra de linha
            String name = sc.nextLine();

            System.out.print("Hours: ");
            int hours = sc.nextInt();

            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();

            if (ch == 'y') {
                System.out.print("Additional charge: ");
                double additionalCharges = sc.nextDouble();
                // Adiciona um OutsourcedEmployee
                list.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharges));
            } else {
                // Adiciona um Employee comum
                list.add(new Employee(name, hours, valuePerHour));
            }
        }

        System.out.println();
        System.out.println("Payments: ");
        for (Employee employee : list) {
            System.out.println(employee.getName() + " - $" + String.format("%.2f", employee.payment()));
        }

        sc.close();
    }
}
