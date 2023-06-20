package ru.gb.jcore.office;

public class Employee {
    private String name;
    private String lastName;
    private String patronymic;
    private String post;
    private int age;
    private int salary;
    private long phone;


    public Employee(String lastName, String name, String patronymic, String post, int age, int salary, long phone) {
        this.lastName = lastName;
        this.name = name;
        this.patronymic = patronymic;
        this.post = post;
        this.age = age;
        this.salary = salary;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return  "name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", lastName='" + lastName + '\'' +
                ", post='" + post + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", phone=" + phone;
    }
}
