package Lesson_5;
import java.util.List;

public class StudyGroup {
    private Teacher teacher;
    private List<Student> students;

    public StudyGroup(){
        this.teacher = null;
        this.students = null;
    }

    public Teacher getTeacher(){
        return teacher;
    }

    public List<Student> getStudents(){
        return students;
    }

    public void setTeacher(Teacher teacher){
        this.teacher = teacher;
    }

    public void setStudents(List<Student> students){
        this.students = students;
    }

    
    
}
