package com.java.mentor.task.calculate.entity;

import com.java.mentor.task.calculate.constants.ConstantCalculate;
import com.java.mentor.task.calculate.exception.ExceptionCalculate;
import com.java.mentor.task.calculate.constants.MessageConstant;

/**
 *
 * @author Valera Malyshov
 */
public class RomanCalculate extends Calculate {

    private int arabicNumber;
    private int resultRoman;
    private String romanNumber;

    public RomanCalculate() {
    }

    public RomanCalculate(int arabicNumber, int resultRomanExpression,
            String romanNumber, String nameCalculate, String operator,
            int operandOne, int operandTwo) {
        super(nameCalculate, operator, operandOne, operandTwo);
        this.arabicNumber = arabicNumber;
        this.resultRoman = resultRomanExpression;
        this.romanNumber = romanNumber;
    }

    public int getResultRomanExpression() {
        return resultRoman;
    }

    public int romanToArabic(String number) throws ExceptionCalculate {
        arabicNumber = 0;
        if (number != null) {
            for (int i = 0; i < ConstantCalculate.ROMAN_NUMBER.length; i++) {
                if (number.equals(ConstantCalculate.ROMAN_NUMBER[i])) {
                    arabicNumber = i;
                    break;
                }
            }
        } else {
            throw new ExceptionCalculate(MessageConstant.ERROR_NUMBER);
        }
        return arabicNumber;
    }

    public String arabicToRoman(int number) throws ExceptionCalculate {
        if (number > 0) {
            romanNumber = ConstantCalculate.ROMAN_NUMBER[number];
        } else {
            throw new ExceptionCalculate(MessageConstant.ERROR_RESULT_ROMAN);
        }
        return romanNumber;
    }

    @Override
    public void calculaateExpression() throws ExceptionCalculate {
        switch (getOperator()) {
            case ConstantCalculate.PLUS:
                resultRoman = getOperandOne() + getOperandTwo();
                break;
            case ConstantCalculate.MINUS:
                resultRoman = getOperandOne() - getOperandTwo();
                break;
            case ConstantCalculate.MULTIPLY:
                resultRoman = getOperandOne() * getOperandTwo();
                break;
            case ConstantCalculate.DIVIDE:
                resultRoman = getOperandOne() / getOperandTwo();
                break;
            default:
                throw new ExceptionCalculate(MessageConstant.ERROR_OPERARATOR);

        }
    }
}
