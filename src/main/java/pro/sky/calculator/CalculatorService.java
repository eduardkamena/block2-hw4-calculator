package pro.sky.calculator;

public interface CalculatorService { // Интерфейс для сервиса

    String calculatorHello();

    float plus(float numberOne, float numberTwo); // Метод сложения

    float minus(float numberOne, float numberTwo); // Метод вычитания

    float multiply(float numberOne, float numberTwo); // Метод умножения

    float divide(float numberOne, float numberTwo); // Метод деления

}
