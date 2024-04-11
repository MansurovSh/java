package Last_Lesson.Contoller;

import Last_Lesson.Model.Calculator;
import Last_Lesson.View.CalculatorView;

public class CalculatorControll {
    public Calculator calculator;
    public CalculatorView view;

    public CalculatorControll(Calculator calculator, CalculatorView view) {
        this.calculator = calculator;
        this.view = view;
    }

    public void start() {
        String oper = view.operation();
        double a = view.number();
        double b = view.number();

        switch (oper) { // Почему когда я питаюсь в switch(view.operation()) пищу то в концоле просто
                        // вводится Введите операцию и недавая мне ввести операцию программа заканчивает
                        // работу
            case "+":
                System.out.println(calculator.operation_plus(a, b));
                break;
            case "-":
                System.out.println(calculator.operation_minus(a, b));
                break;
            case "*":
                System.out.println(calculator.operation_multiplication(a, b));
                break;
            case "/":
                System.out.println(calculator.operation_division(a, b));
                break;
            default:
                System.out.println("Неверная операция");

                break;
        }

    }

}
