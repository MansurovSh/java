package Lesson_3.task1;

public class TestMyLinkedList {
    public static void main(String[] args) {
        MyLinkedList<String> list = new MyLinkedList<>();

        list.Add("Hello");
        list.Add("world");
        list.Add("Dragon");
        list.Del(1);
        
        for (String string : list) {
            System.out.println(string);
        }
    
    }
}