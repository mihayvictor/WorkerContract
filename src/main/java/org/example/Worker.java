package org.example;

public class Worker {
    private String name;
    private WorkerLevel level;
    private Double baseSalary;
    private Department department;
    private int contract;

    public Worker(Department department, String name, WorkerLevel level, Double baseSalary, int contract) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
        this.contract = contract;
    }

    public Worker() {
    }

    public int getContract() {
        return contract;
    }

    public void setContract(int contract) {
        this.contract = contract;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public void addcontract(HourContract contrac){

    }
    public void removeContract(HourContract contract){

    }
    public Double income(Integer year, Integer month){

        return 0.0;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\n" +
                "Departament: " + department + "\n" +
                " Level: " + level  + "\n" +
                String.format("Base Salary: %.2f", baseSalary);
    }
}
