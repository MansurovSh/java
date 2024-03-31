package Lesson_4.task_1.Model;

import java.util.ArrayList;
import java.util.List;

class Container<T>{
    protected List<T> container;

    public Container(){
        this.container = new ArrayList<>();
    }


    
    public T get(int index){                //Этот класс отвечает за получение данных
        if(index > container.size())
            return null;
        return container.get(index);
    }

    
    public int getSize(){
        return container.size();
    }

}


class DataBase<T> {

    public void Add(List<T> container,T item){      //Сохранение это одна задача   
       container.add(item);                           
    }                                               



}

class DataD<T>{
    public void remove(List<T> container,int index){        //Удаление это еще одна задача
        container.remove(index);
    }
}

public class DataContainerModel<T>{         //Принцип единной отвественности
    private Container<T> container;
    private DataBase<T> dataBase;
    private DataD<T> dataD;

    public DataContainerModel(){
        container = new Container<>();
        dataBase = new DataBase<>();
        dataD = new DataD<T>();
    }

    public void Add(T item){
        dataBase.Add(container.container,item);
    }

    public T get(int index){             
        return container.get(index); 
    }

    public void remove(int index){
        dataD.remove(container.container, index);
    }

    public int getSize(){
        return container.getSize();
    }
    
}
