package Lesson_4.task_1.Core;

import Lesson_4.task_1.Controll.DataContainerControll;
import Lesson_4.task_1.Model.DataContainerModel;
import Lesson_4.task_1.View.DataContainerView;

public class Main {
    public static void main(String[] args) {
        
        DataContainerModel<String> model = new DataContainerModel<>();
        DataContainerView view = new DataContainerView();
        DataContainerControll controll = new DataContainerControll(model, view);

        controll.getUserInput();
    }
}
