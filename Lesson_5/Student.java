package Lesson_5;

public class Student extends Person {
    private String specialization;

    public Student(int id){
        this.id = id;
    }

    public Student(int id, String firstName, String lastName, int age){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getSpecialization(){
        return specialization;
    }

    public void setSpecialization(String specialization){
        this.specialization = specialization;
    }

}
