package Last_Lesson.Source;

import Last_Lesson.Contoller.CalculatorControll;
import Last_Lesson.Model.Calculator;
import Last_Lesson.View.CalculatorView;

public class Main {

    public static void main(String[] args) {
        Calculator calculator = Calculator.getCalculator();
        CalculatorView view = new CalculatorView();
        CalculatorControll calculatorControll = new CalculatorControll(calculator, view);
        calculatorControll.start();
    }
}