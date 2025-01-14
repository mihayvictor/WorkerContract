package org.example;

import org.example.entities.Department;
import org.example.entities.HourContract;
import org.example.entities.Worker;
import org.example.entities.enums.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter department's name: ");
        String departament =input.nextLine();
        System.out.print("Name: ");
        String workerName = input.nextLine();
        System.out.print("Level: ");
        String workerLevel = input.nextLine();
        System.out.print("Base Salary: ");
        double baseSalary = input.nextDouble();
        Worker worker = new Worker(new Department(departament), workerName, WorkerLevel.valueOf(workerLevel), baseSalary);
        System.out.print(" How many contracts to this worker? ");
        input.nextLine();
        int n =input.nextInt();
        input.nextLine();

        for (int i = 1; i <= n; i++){
            String stringDate;
            System.out.print("#" + i +"Date: ");
            System.out.print("Date (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(input.next());
            System.out.print("Value Per Hour: ");
            double valuePerHour = input.nextDouble();
            input.nextLine();
            System.out.print("Duration (hours): ");
            int hours = input.nextInt();
            HourContract contract = new HourContract(contractDate, valuePerHour, hours);
            worker.addcontract(contract);
        }

        System.out.println();
        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = input.next();
        int month = Integer.parseInt(monthAndYear.substring(0,2));
        int year = Integer.parseInt(monthAndYear.substring(3));
        System.out.println("Name: " + worker.getName());
        System.out.println("Departament: " + worker.getDepartment().getName());
        System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year,month)));
        input.close();
    }
}
