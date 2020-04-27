package com.java.mentor.task.calculate.logic;

import com.java.mentor.task.calculate.entity.ArabicCalculate;
import com.java.mentor.task.calculate.entity.RomanCalculate;
import com.java.mentor.task.calculate.console.ReadConsole;
import com.java.mentor.task.calculate.constants.ConstantCalculate;
import com.java.mentor.task.calculate.parser.ParserExpression;
import com.java.mentor.task.calculate.constants.MessageConstant;
import com.java.mentor.task.calculate.constants.RegexConstant;
import com.java.mentor.task.calculate.exception.ExceptionCalculate;
import java.util.Scanner;

/**
 *
 * @author Valera Malyshov
 */
public class LogicCalculate {

    private enum NameCalculates {

        ARABIC, ROMAN;
    }
    private String[] expression;

    public void calculateExpression(ReadConsole consoleRead,
            Scanner scanner) throws ExceptionCalculate {
        consoleRead.readStringConsole(scanner);

        NameCalculates nameCalculate
                = NameCalculates.valueOf(consoleRead.checkArabicOrRoman().toUpperCase());

        expression = ParserExpression.parserExpression(consoleRead.getConsoleString());

        switch (nameCalculate) {
            case ARABIC:
                ArabicCalculate arabicCalculate = new ArabicCalculate();

                arabicCalculate.setOperandOne(Integer.valueOf(expression[ConstantCalculate.ZERO]));
                arabicCalculate.setOperandTwo(Integer.valueOf(expression[ConstantCalculate.TWO]));
                arabicCalculate.setOperator(expression[ConstantCalculate.ONE]);
                arabicCalculate.calculaateExpression();

                System.out.printf(RegexConstant.REGEX_RESULT, arabicCalculate.getResultArabicExpression());
                break;

            case ROMAN:
                RomanCalculate romanCalculate = new RomanCalculate();

                romanCalculate.setOperandOne(romanCalculate.romanToArabic(expression[ConstantCalculate.ZERO]));
                romanCalculate.setOperandTwo(romanCalculate.romanToArabic(expression[ConstantCalculate.TWO]));
                romanCalculate.setOperator(expression[ConstantCalculate.ONE]);
                romanCalculate.calculaateExpression();

                System.out.println(romanCalculate.arabicToRoman(romanCalculate.getResultRomanExpression()));
                break;
            default:
                throw new ExceptionCalculate(MessageConstant.ERROR_EXPRESSION);

        }

    }
}
