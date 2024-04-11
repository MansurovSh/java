package Last_Lesson.View;

import java.util.Scanner;

public class CalculatorView {
    private Scanner scanner;

    public CalculatorView() {
        scanner = new Scanner(System.in);
    }

    public double number() {
        System.out.println("Введите число: ");
        return scanner.nextDouble();
    }

    public String operation() {

        // System.out.println("Выбирите операцию: "); // Не знаю что выбрать
        // System.out.println("1.Сложение(+)"); // Если так сделать что надо вибрать
        // System.out.println("2.Вычитание(-)"); // то разве не исрортится инкапсуляция?
        // System.out.println("3.Умножение(*)"); // Интерфейс будет зависит от функции
        // System.out.println("4.Деление(/)"); // что я определил в Calculator если я
        // System.out.println(0.Закрыт калкулятор); // добавлю новую функцию в
        // калкулятор
        // например вичысление корня то
        // придется и интерфейс изменить
        // добавить еще одну команду

        System.out.println("Введите операцию: "); // А так не хочется т.к. в калкуляторе
                                                  // такого не должно быть, что если мы
                                                  // введем неправилную операцию что выводить
                                                  // что не верная операция и заново запросить
                                                  // ввести операцию но так мне кажется не правильно

        return scanner.nextLine();
    }
}
