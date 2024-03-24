package Lesson_4;

public class DataContainerControll {
    private DataContainerModel<?> model;
    private DataContainerView view;

    public DataContainerControll(DataContainerModel<?> model, DataContainerView view){
        this.model = model;
        this.view = view;
    }

    public void getUserInput(){
        boolean running = true;
        while (running) {
            int choise = view.getUserChoise();

            switch (choise) {
                case 1:
                    //model.Add(view.getT());
                    break;
                case 2:
                    System.out.println(model.get(view.getindex()));
                    break;
                case 3:
                    model.remove(view.getindex());
                    break;
                case 4:
                    System.out.println(model.getSize());
                    break;
                case 5:
                    running = false;
                    break;
                default:
                    System.out.println("Неверная команда");
            }
        }
    }
}
