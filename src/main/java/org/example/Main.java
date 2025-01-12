package org.example;

import org.example.entities.Department;
import org.example.entities.HourContract;
import org.example.entities.Worker;
import org.example.entities.enums.WorkerLevel;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Worker worker = new Worker();
        Department department = new Department();
        HourContract horacontract = new HourContract();

        System.out.print("Enter department's name: ");
        department.setName(input.nextLine());
        System.out.print("Name: ");
        worker.setName(input.nextLine());
        System.out.print("Level: ");
        worker.setLevel(WorkerLevel.valueOf(input.nextLine()));
        System.out.print("Base Salary: ");
        worker.setBaseSalary(input.nextDouble());
        System.out.print(" How many contracts to this worker? ");
        input.nextLine();
        worker.setContract(input.nextInt());
        input.nextLine();

        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("DD/MM/YYYY");
        TimeZone timeZone = TimeZone.getTimeZone("UTC-3:00");
        sdf.setTimeZone(timeZone);
        for (int i = 0; i < worker.getContract(); i++){
            String stringDate;
            System.out.println("Date: ");
            stringDate = input.nextLine();


        }



        System.out.println(worker);
        System.out.println(date);

    }
}
