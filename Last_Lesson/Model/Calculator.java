package Last_Lesson.Model;

public class Calculator implements Caculation {
    protected static Calculator calculator; // Принцип единной отвественности
                                            // Выполняеть только вычисление

    private Calculator() { // Думаю принцип откритости-закритости тоже выполняется

    }

    public static Calculator getCalculator() { // паттерн делаем так чтобы было только один калкулятор
        if (calculator == null)
            return new Calculator();

        return calculator;
    }

    @Override
    public double operation_plus(double a1, double a2) {
        return a1 + a2;
    }

    @Override
    public double operation_minus(double a1, double a2) {
        return a1 - a2;
    }

    @Override
    public double operation_multiplication(double a1, double a2) {
        return a1 * a2;
    }

    @Override
    public double operation_division(double a1, double a2) {

        return a1 / a2;
    }
}
