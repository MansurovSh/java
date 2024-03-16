package Lesson_1;

class Rectangle extends Figura {
    double length;
    double width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    
    public Rectangle(){
        this.length = 2;
        this.width = 1;
    }

    @Override
    double calculateArea() {
        
        return length * width;
    }

    @Override
    double calculatePerimetr() {
        
        return 2 * (length + width );
    }
}
