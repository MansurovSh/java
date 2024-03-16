package Lesson_1;

class Circle extends Figura{
    double r;

    public Circle(double r){
        this.r = r;
    }

    public Circle(){
        this.r = 1;
    }

    @Override
    double calculateArea() {
        
        return Math.PI * r * r;
    }

    @Override
    double calculatePerimetr() {
        
        return 2 * Math.PI * r;
    }
    
}
