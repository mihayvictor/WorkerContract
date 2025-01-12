package org.example;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Worker worker = new Worker();
        Department department = new Department();
        HourContract horacontract = new HourContract();

        System.out.println("Enter department's name: ");
        department.setName(input.nextLine());
        System.out.println("Name: ");
        worker.setName(input.nextLine());
        System.out.println("Level: ");
        worker.setLevel(WorkerLevel.valueOf(input.nextLine()));
        System.out.println("Base Salary: ");
        worker.setBaseSalary(input.nextDouble());
        System.out.print(" How many contracts to this worker? ");
        input.nextLine();
        worker.setContract(input.nextInt());
        input.nextLine();

        for (int i = 0; i < worker.getContract(); i++){





        }


        System.out.println(worker);


    }
}
