package Lesson_5;

import java.util.List;
import java.util.Scanner;

public class StudyGroupServis {
    Scanner scanner;
    
    public StudyGroupServis(){
            scanner = new Scanner(System.in);
    }

    public StudyGroup newStudyGroup(Teacher teacher, List<Student> students){
        System.out.print("Введите ID преподователя: ");
        teacher.id = scanner.nextInt();
        System.out.print("Введите количество студентов: ");
        int count = scanner.nextInt();
        for(; count > 0; count--){
            System.out.print("Введите ID студента:");
            students.add(new Student(scanner.nextInt()));
        }

        
        StudyGroup newGroup = new StudyGroup();
        newGroup.setTeacher(teacher);
        newGroup.setStudents(students);

        return newGroup;

    }

}
