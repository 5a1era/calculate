package com.java.mentor.task.calculate.console;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import com.java.mentor.task.calculate.constants.RegexConstant;
import com.java.mentor.task.calculate.constants.ConstantCalculate;
import com.java.mentor.task.calculate.exception.ExceptionCalculate;
import com.java.mentor.task.calculate.constants.MessageConstant;

/**
 *
 * @author Valera Malyshov
 */
public class ReadConsole {

    private String consoleString;
    private String ArabicOrRoman;

    public ReadConsole() {
    }

    /**
     * @param consoleString
     * @param ArabicOrRoman
     */
    public ReadConsole(String consoleString, String ArabicOrRoman) {
        this.consoleString = consoleString;
        this.ArabicOrRoman = ArabicOrRoman;
    }

    /**
     *
     * @param scanner
     * @throws com.java.mentor.task.calculate.exception.ExceptionCalculate
     */ 
    public void readStringConsole(Scanner scanner) throws ExceptionCalculate {
        if (scanner != null) {
            consoleString = scanner.nextLine();
        } else {
            throw new ExceptionCalculate(MessageConstant.ERROR_SCANNER);
        }

    }

    public String checkArabicOrRoman() throws ExceptionCalculate {

        Pattern patternArabic = Pattern.compile(RegexConstant.REGEX_ARABIC);
        Matcher matcherArabic = patternArabic.matcher(consoleString);

        Pattern patternRoman = Pattern.compile(RegexConstant.REGEX_ROMAN);
        Matcher matcherRoman = patternRoman.matcher(consoleString);

        if (matcherArabic.matches()) {

            ArabicOrRoman = ConstantCalculate.ARABIC;
            consoleString = matcherArabic.group();
        } else {

            if (matcherRoman.matches()) {
                ArabicOrRoman = ConstantCalculate.ROMAN;
                consoleString = matcherRoman.group();

            } else {
                if (!matcherArabic.matches() & !matcherRoman.matches()) {
                    throw new ExceptionCalculate(MessageConstant.ERROR_EXPRESSION);
                }
            }
        }
        return ArabicOrRoman;
    }

    public String getConsoleString() {
        return consoleString;
    }
}
