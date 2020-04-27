package com.java.mentor.task.calculate.entity;

import com.java.mentor.task.calculate.constants.ConstantCalculate;
import com.java.mentor.task.calculate.exception.ExceptionCalculate;
import com.java.mentor.task.calculate.constants.MessageConstant;

/**
 *
 * @author Valera Malyshov
 */
public class ArabicCalculate extends Calculate {

    private double resultArabic;

    public ArabicCalculate() {
    }

    public ArabicCalculate(double resultArabicExpression, String nameCalculate,
            String operator, int operandOne, int operandTwo) {
        super(nameCalculate, operator, operandOne, operandTwo);
        this.resultArabic = resultArabicExpression;
    }

    public double getResultArabicExpression() {
        return resultArabic;
    }

    @Override
    public void calculaateExpression() throws ExceptionCalculate {
        switch (getOperator()) {
            case ConstantCalculate.PLUS:
                resultArabic = getOperandOne() + getOperandTwo();
                break;
            case ConstantCalculate.MINUS:
                resultArabic = getOperandOne() - getOperandTwo();
                break;
            case ConstantCalculate.MULTIPLY:
                resultArabic = getOperandOne() * getOperandTwo();
                break;
            case ConstantCalculate.DIVIDE:
                resultArabic = (double) (getOperandOne()) / getOperandTwo();
                break;
            default:
                throw new ExceptionCalculate(MessageConstant.ERROR_OPERARATOR);
        }

    }
}
