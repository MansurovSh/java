package Last_Lesson.Model;

/**
 * Caculation
 */ // Принцип разделение интерфейсов
public interface Caculation { // Все калкуляторы имеют эти четире операции
    double operation_plus(double a1, double a2);

    double operation_minus(double a1, double a2);

    double operation_multiplication(double a1, double a2);

    double operation_division(double a1, double a2);

}

/**
 * InnerCaculation
 */
interface InnerCaculation extends Caculation {
    double operation_div();

}