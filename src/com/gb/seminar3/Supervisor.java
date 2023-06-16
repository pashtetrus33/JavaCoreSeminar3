package com.gb.seminar3;

public class Supervisor extends Employee {
    static int totalSupervisors;

    {
        ++totalSupervisors;
        this.setposition("supervisor");
        this.setSalary(60000);
    }

    public Supervisor(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public Supervisor(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
    }


    public Supervisor(String firstName, String lastName, int age, int salary) {
        super(firstName, lastName, age);
        this.setSalary(salary);
    }

    public Supervisor(String firstName, String lastName, String position, int salary, String phone, int age) {
        super(firstName, lastName, position, salary, phone, age);
    }

    @Override
    public void work() {
        System.out.println("Руководитель контролирует");
    }

    public static void salaryIncrease(Employee[] workers, int age, int addSalary) {
        for (Employee e : workers) {
            if (!(e instanceof Supervisor)){
                if (e.getAge() > age) {
                    e.setSalary(e.getSalary() + addSalary);
                }
            }
        }
    }
}
