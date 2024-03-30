package Lesson_5;

import java.util.ArrayList;
import java.util.List;

public class StudyGroupControll {
    private StudyGroup studyGroup;
    private StudyGroupServis servis;
    

    public StudyGroupControll(StudyGroup studyGroup, StudyGroupServis servis){
        this.studyGroup = studyGroup;
        this.servis = servis;
    }

    public void hiGroup(){
        Teacher teacher = new Teacher();
        List<Student> students = new ArrayList<>();
        studyGroup = servis.newStudyGroup(teacher, students);
        studyGroup.toString();
    }
    
}
