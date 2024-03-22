package Lesson_3.task2;

public class Employee implements Comparable<Employee> {
    private String name;
    private int age;
    private int salary;

    public Employee(String name, int age, int salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }


    @Override
    public int compareTo(Employee o) {
        return Integer.compare(this.age, o.age);
    }
}
