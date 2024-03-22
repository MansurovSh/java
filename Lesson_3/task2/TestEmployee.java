package Lesson_3.task2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

public class TestEmployee {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add( new Employee("Дмитрий", 22, 30000));
        employees.add(new Employee("Иван", 25, 25000));
        employees.add(new Employee("Иван", 23, 22000));
        employees.add(new Employee("Иван", 28, 15000));
        employees.add(new Employee("Иван", 30, 23000)); 

        Comparator<Employee> EmployeeSalaryComparator = new Comparator<Employee>() {
            public int compare(Employee o1, Employee o2){
                return Integer.compare(o1.getSalary(), o2.getSalary());
            }
        };

        Comparator<Employee> EmployeeAgeComparator = new Comparator<Employee>() {
            public int compare(Employee o1, Employee o2){
                return Integer.compare(o1.getAge(), o2.getAge());
            }
        };
        
        Collections.sort(employees, EmployeeSalaryComparator);

        
        for (Employee employee : employees) {
            System.out.println(employee.getSalary());
            
        }
        
        Collections.sort(employees, EmployeeAgeComparator);
        for (Employee employee : employees) {
            System.out.println(employee.getAge());
            
        }
    

    }
}
