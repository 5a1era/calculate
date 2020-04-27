package com.java.mentor.task.calculate.entity;

import com.java.mentor.task.calculate.exception.ExceptionCalculate;
import com.java.mentor.task.calculate.constants.MessageConstant;

/**
 *
 * @author Valera Malyshov
 */
public class Calculate {

    private String operator;
    private int operandOne;
    private int operandTwo;

    public Calculate() {
    }

    public Calculate(String nameCalculate, String operator, int operandOne, int operandTwo) {
        this.operator = operator;
        this.operandOne = operandOne;
        this.operandTwo = operandTwo;
    }

    public void setOperandOne(int operandOne) throws ExceptionCalculate {
        if (operandOne > 0 & operandOne < 11) {
            this.operandOne = operandOne;
        } else {
            throw new ExceptionCalculate(MessageConstant.ERROR_OPERAND_EXPRESSION);
        }

    }

    public void setOperandTwo(int operandTwo) throws ExceptionCalculate {
        if (operandTwo > 0 & operandTwo < 11) {
            this.operandTwo = operandTwo;
        } else {
            throw new ExceptionCalculate(MessageConstant.ERROR_OPERAND_EXPRESSION);
        }
    }

    public void setOperator(String operator) throws ExceptionCalculate {
        if (operator != null) {
            this.operator = operator;
        } else {
            throw new ExceptionCalculate(MessageConstant.ERROR_OPERARATOR);
        }
    }

    public int getOperandOne() {
        return operandOne;
    }

    public int getOperandTwo() {
        return operandTwo;
    }

    public String getOperator() {
        return operator;
    }

    public void calculaateExpression() throws ExceptionCalculate {
    }

}
