package pro.sky.calculator;

import org.springframework.stereotype.Service;

@Service // Сервисная часть
public class CalculatorServiceImpl implements CalculatorService {

    public String calculatorHello() { // Метод приветствия
        return "Добро пожаловать в калькулятор";
    }

    public float plus(float numberOne, float numberTwo) { // Метод сложения
        return numberOne + numberTwo;
    }

    public float minus(float numberOne, float numberTwo) { // Метод вычитания
        return numberOne - numberTwo;
    }

    public float multiply(float numberOne, float numberTwo) { // Метод умножения
        return numberOne * numberTwo;
    }

    public float divide(float numberOne, float numberTwo) { // Метод деления
        return numberOne / numberTwo;
    }

}
