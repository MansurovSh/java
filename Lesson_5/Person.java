package Lesson_5;

public class Person {
    protected int id;
    protected String firstName;
    protected String lastName;
    protected int age;

    public int getId(){
        return id;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public int getAge(){
        return age;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setFirstName(String firstNmae){
        this.firstName = firstNmae;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setAge(int age){
        this.age = age;
    }

}

