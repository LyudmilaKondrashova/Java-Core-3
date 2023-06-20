package ru.gb.jcore.office;

public class Chief extends Employee{
    public Chief(String lastName, String name, String patronymic,
                 String post, int age, int salary, long phone) {
        super(lastName, name, patronymic, post, age, salary, phone);
    }

    public static void salaryUp(Employee[] employees, int age, int addSalary) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getAge() > age && !(employees[i] instanceof Chief)) {
                employees[i].setSalary(employees[i].getSalary() + addSalary);
            }
        }
    }
}
