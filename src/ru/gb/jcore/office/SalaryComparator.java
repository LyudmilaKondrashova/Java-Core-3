package ru.gb.jcore.office;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Employee> {
    public int compare(Employee o1, Employee o2) {
        return o1.getSalary() - (o2.getSalary());
    }
}
