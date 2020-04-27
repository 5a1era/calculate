package com.java.mentor.task.calculate.constants;

/**
 *
 * @author Valera Malyshov
 */
public class RegexConstant {
    public static final String REGEX_ARABIC = "([0123456789]{1,2}) [+/*-]{1} ([0123456789]{1,2})";
    public static final String REGEX_ROMAN = "[IVX]{1,4} [+/*-]{1} [IVX]{1,4}";
    public static final String REGEX_SPLIT = " \\s?";
    public static final String REGEX_RESULT = "%.2f\n";
}
