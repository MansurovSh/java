package Lesson_5;

public class Main {
    public static void main(String[] args) {
        StudyGroup studyGroup = new StudyGroup();
        StudyGroupServis servis = new StudyGroupServis();
        StudyGroupControll controll = new StudyGroupControll(studyGroup, servis);
        controll.hiGroup();
    }
    
}
