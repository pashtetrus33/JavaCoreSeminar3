package com.gb.seminar3;

/**
 * Класс с описанием сотрудника
 **/
public class Employee implements Comparable {

    private final String firstName;
    private String lastName;
    private String phone;
    private String position;
    private int salary;
    private int age;
    private int id;
    static int total;


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhone() {
        return phone;
    }

    public String getPosition() {
        return position;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    {
        ++total;
        id = total;
        this.lastName = "";
        this.position = "trainee";
        this.salary = 20000;
        this.phone = "-";
        this.age = 18;
    }

    public Employee(String firstName) {
        this.firstName = firstName;
    }

    public Employee(String firstName, String lastName) {
        this(firstName);
        this.lastName = lastName;
    }

    public Employee(String firstName, String lastName, int age) {
        this(firstName, lastName);
        this.age = age;
    }

    public Employee(String firstName, String lastName, String position, int salary, String phone, int age) {
        this(firstName, lastName, age);
        this.position = position;
        this.salary = salary;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return id + ") Fullname: " + firstName + " " + lastName + " Position: " + position + " Salary: " + salary + " Phone: " + phone + " Age: " + age + ". ";
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    protected void setposition(String position) {
        this.position = position;
    }

    public void work() {
        System.out.println("Работник работает");
    }

    @Override
    public int compareTo(Object o) {
        return this.lastName.compareTo(((Employee) o).getLastName());
    }
}
