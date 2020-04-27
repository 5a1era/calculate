package com.java.mentor.task.calculate.runner;

import com.java.mentor.task.calculate.console.ReadConsole;
import com.java.mentor.task.calculate.logic.LogicCalculate;
import com.java.mentor.task.calculate.exception.ExceptionCalculate;
import com.java.mentor.task.calculate.constants.MessageConstant;
import java.util.Scanner;

/**
 *
 * @author Valera Malyshov
 */
public class Runner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            System.out.println(MessageConstant.MESSAGE_TO_CONSOLE_ABOUT_CALCULATE);
            System.out.println(MessageConstant.MESSAGE_EXPRESSION_RULE_CALCULATE);

            /**
             * @param
             *
             */
            LogicCalculate calculate = new LogicCalculate();
            calculate.calculateExpression(new ReadConsole(),
                    new Scanner(System.in));

        } catch (ExceptionCalculate | NullPointerException calculateException) {
            System.err.println(calculateException.getMessage());
        }
    }
}
