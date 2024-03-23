package Lesson_4;

import java.util.Scanner;

public class DataContainerView {
    private Scanner scanner;

    public DataContainerView(){
        scanner = new Scanner(System.in);
    }

    public int getUserChoise(){
        System.out.println("1.Добавление в коллекцию");
        System.out.println("2.Получение элемента из коллекцию");
        System.out.println("3.Удаление из коллекцию");
        System.out.println("4.Размер коллекции");
        System.out.println("5.Выход");

        return scanner.nextInt();
    }

    // public T getT(){
    //     //TODO
    //     return ;
    // }
    
    public int getindex(){
        return scanner.nextInt();
    }

}
