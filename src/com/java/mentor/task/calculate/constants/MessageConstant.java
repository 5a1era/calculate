package com.java.mentor.task.calculate.constants;

/**
 *
 * @author Valera Malyshov
 */
public class MessageConstant {

    public static final String ERROR_EXPRESSION = "Выражение не соответствует примеру.";
    public static final String ERROR_SCANNER = "Сканер равен null";
    public static final String ERROR_NUMBER = "Number равен null";
    public static final String ERROR_RESULT_ROMAN = "Результат выражения меньше нуля";
    public static final String ERROR_OPERAND_EXPRESSION = "Один из опрандов не соответствует условию калькулятора.";
    public static final String ERROR_OPERARATOR = "Не верный оператор";

    public static final String MESSAGE_TO_CONSOLE_ABOUT_CALCULATE = "Этот калькулятор может производить решения арифмитических операний на: '+', '-', '*', '/', так же работать, как с арабскими, так и с римскими цифрами.";
    public static final String MESSAGE_EXPRESSION_RULE_CALCULATE = "Введите выражение: Пример 1 + 5 или V * II, где число не должно превышать 10(X) и не должно быть меньше 1(I).";
}
