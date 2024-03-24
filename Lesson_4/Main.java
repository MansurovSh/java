package Lesson_4;

public class Main {
    public static void main(String[] args) {
        
        DataContainerModel<String> model = new DataContainerModel<>();
        DataContainerView view = new DataContainerView();
        DataContainerControll controll = new DataContainerControll(model, view);
        
        controll.getUserInput();
    }
}
