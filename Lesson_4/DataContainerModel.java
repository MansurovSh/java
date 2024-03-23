package Lesson_4;

import java.util.ArrayList;
import java.util.List;

public class DataContainerModel<T>{
    private List<T> container;

    public DataContainerModel(){
        container = new ArrayList<>();
    }    

    public void Add(T item){
        container.add(item);
    }

    public T get(int index){
        if(index > container.size())
            return null;
        return container.get(index);
    }

    public void remove(int index){
        container.remove(index);
    }

    public int getSize(){
        return container.size();
    }

    
}
