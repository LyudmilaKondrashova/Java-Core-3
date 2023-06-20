import ru.gb.jcore.office.AgeComparator;
import ru.gb.jcore.office.Chief;
import ru.gb.jcore.office.Employee;
import ru.gb.jcore.office.SalaryComparator;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Chief employee0 = new Chief("Kurafeev", "Oleg", "Sergeevich",
                "CHIEF", 43, 150_000, 89032654123L);
        Employee employee1 = new Employee("Sokolov", "Stepan", "Petrovich",
                "engineer", 37, 75_000, 89045672345L);
        Employee employee2 = new Employee("Kubikov", "Lev", "Nikolaevich",
                "technologist", 29, 63_000, 89045781278L);
        Employee employee3 = new Employee("Kalinin", "Igor", "Alexeevich",
                "technologist", 44, 66_000, 89085627954L);
        Employee employee4 = new Employee("Tihonov", "Alexandr", "Sergeevich",
                "engineer", 42, 78_500, 89275632865L);
        Employee employee5 = new Employee("Guzhov", "Dmitry", "Andreevich",
                "senior engineer", 38, 92_750, 89254651238L);
        Employee employee6 = new Employee("Chibizov", "Nikolay", "Ignatovich",
                "deputy chief", 34, 100_000, 89046248961L);
        Employee employee7 = new Employee("Tihonov", "Sergey", "Petrovich",
                "engineer", 30, 75_000, 89047563214L);
        Employee employee8 = new Employee("Zuev", "Nikita", "Igorevich",
                "manager", 27, 55_000, 890489532164L);
        Employee employee9 = new Employee("Goncharova", "Olga", "Vladimirovna",
                "senior manager", 44, 78_500, 89032658942L);
        Employee employee10 = new Employee("Naumovich", "Anna", "Sergeevna",
                "engineer", 31, 77_300, 89054267892L);

        Employee[] employees = new Employee[]{employee0, employee1, employee2, employee3, employee4, employee5,
            employee6, employee7, employee8, employee9, employee10};

        System.out.println("До повышения зарплаты:");
        for (int i = 0; i <employees.length ; i++) {
            System.out.println( (i + 1) + ". " + employees[i].toString());
        }
        System.out.println();

        employee0.salaryUp(employees, 0, 10_000);
        System.out.println("После повышения зарплаты:");
        for (int i = 0; i <employees.length ; i++) {
            System.out.println( (i + 1) + ". " + employees[i].toString());
        }
        System.out.println();

        Comparator<Employee> ageComp = new AgeComparator();
        Arrays.sort(employees, ageComp);
        System.out.println("Сортировка по возрасту:");
        for (int i = 0; i <employees.length ; i++) {
            System.out.println( (i + 1) + ". " + employees[i].toString());
        }
        System.out.println();

        Comparator<Employee> salaryComp = new SalaryComparator();
        Arrays.sort(employees, salaryComp);
        System.out.println("Сортировка по зарплате:");
        for (int i = 0; i <employees.length ; i++) {
            System.out.println( (i + 1) + ". " + employees[i].toString());
        }
        System.out.println();
    }
}