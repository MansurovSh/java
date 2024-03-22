package Lesson_3.task1;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class MyLinkedList<T> implements Iterable<T> {
    private List<T> list;

    public MyLinkedList(){
        this.list = new LinkedList<>();
    }
        public void Add(T element){
            list.add(element);
        }

         public void Del(int index){
             list.remove(index);
         }
        
        @Override
        public Iterator<T> iterator() {
            return list.iterator();
        }

}
