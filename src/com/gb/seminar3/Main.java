package com.gb.seminar3;

import java.util.Arrays;

import static com.gb.seminar3.Supervisor.salaryIncrease;

public class Main {


    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Roma"),
                new Employee("Daria", "Bukova"),
                new Employee("Oleg", "Zhukov", 44),
                new Employee("Ivan", "Semenov", "Engineer", 45000, "+79348887474", 30),
                new Employee("Pavel", "Bakanov", "JavaDeveloper", 55000, "+79348887474", 38),
                new Employee("Olga", "Petrova", "Designer", 35000, "+79348887474", 27),
                new Employee("Anna", "Kiseleva", "Artist", 48000, "+79348887474", 34),
                new Supervisor("Dmitriy", "Lukov", 45, 100000)
        };


        salaryIncrease(employees, 30, 5000);

        for (Employee e : employees) {
            System.out.print(e);
            e.work();
        }

        System.out.println("���������� ��������� �����������: " + Employee.total + ". �� ��� �������������: " + Supervisor.totalSupervisors);

        //C��������� �� ������� (�� ��������� � ������ Employee)
        Arrays.sort(employees);
        //C��������� �� ���������� �� (���������� ���������� - ����� EmployeeSalaryComporator)
        Arrays.sort(employees, new EmployeeSalaryComporator());
        //C��������� �� ���������� �������� (���������� ���������� - ����� EmployeeAgeComporator)
        Arrays.sort(employees, new EmployeeAgeComporator());

        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}


