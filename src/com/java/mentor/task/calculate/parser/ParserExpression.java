package com.java.mentor.task.calculate.parser;

import java.util.regex.Pattern;
import com.java.mentor.task.calculate.constants.RegexConstant;
import com.java.mentor.task.calculate.exception.ExceptionCalculate;
import com.java.mentor.task.calculate.constants.MessageConstant;

/**
 *
 * @author Valera Malyshov
 */
public class ParserExpression {

    private static String[] consoleString;

    public ParserExpression() {
    }

    public static String [] parserExpression(String consoleStringLine)
            throws ExceptionCalculate {
        if (consoleStringLine != null) {
            Pattern patternSplit = Pattern.compile(RegexConstant.REGEX_SPLIT);
            consoleString = patternSplit.split(consoleStringLine);
        } else {
            throw new ExceptionCalculate(MessageConstant.ERROR_EXPRESSION);
        }
        return consoleString;
    }
}
