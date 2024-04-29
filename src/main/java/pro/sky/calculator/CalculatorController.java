package pro.sky.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController // Контроллер
@RequestMapping(path = "/calculator") // Аннотация общей части на уровне класса
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    // Методы для Web вывода результата по одноименным названиям из Сервисной части

    @GetMapping
    public String calculatorHello() {
        return calculatorService.calculatorHello();
    }

    @GetMapping(path = "/plus")
    public String plus(@RequestParam("num1") float numberOne, @RequestParam("num2") float numberTwo) {
        return String.format("%.0f", numberOne) + " + " + String.format("%.0f", numberTwo) + " = "
                + calculatorService.plus(numberOne, numberTwo);
    }

    @GetMapping(path = "/minus")
    public String minus(@RequestParam("num1") float numberOne, @RequestParam("num2") float numberTwo) {
        return String.format("%.0f", numberOne) + " - " + String.format("%.0f", numberTwo) + " = "
                + calculatorService.minus(numberOne, numberTwo);
    }

    @GetMapping(path = "/multiply")
    public String multiply(@RequestParam("num1") float numberOne, @RequestParam("num2") float numberTwo) {
        return String.format("%.0f", numberOne) + " * " + String.format("%.0f", numberTwo) + " = "
                + calculatorService.multiply(numberOne, numberTwo);
    }

    @GetMapping(path = "/divide")
    public String divide(@RequestParam("num1") float numberOne, @RequestParam("num2") float numberTwo) {
        if (numberTwo == 0) return "На ноль делить нельзя";
        else return String.format("%.0f", numberOne) + " / " + String.format("%.0f", numberTwo) + " = "
                + calculatorService.divide(numberOne, numberTwo);
    }

}
