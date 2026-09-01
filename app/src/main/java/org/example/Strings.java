package org.example;

public class Strings {

    public static final String MENU =
        "Выберите операцию и введите ее номер:\n" +
        "1) Добавить новый доход\n" +
        "2) Добавить новый расход\n" +
        "3) Выбрать систему налогообложения\n";

    public static final String ENTER_EARNINGS =
        "Введите сумму дохода: ";

    public static final String ENTER_SPENDINGS =
        "Введите сумму расхода: ";

    public static final String RESULT_FMT =
        "Мы советуем вам УСН %s\n" +
        "Ваш налог составит: %d рублей\n" +
        "Налог по другой системе: %d рублей\n" +
        "Экономия: %d рублей\n";

    public static final String RESULT_TIE_FMT =
        "Можете выбрать любую систему налогообложения\n" +
        "Ваш налог составит: %d рублей\n";

    public static final String END =
        "Программа завершена!\n";

    public static final String EARNINGS =
        "доходы";

    public static final String EARNINGS_MINUS_SPENDINGS =
        "доходы минус расходы";

    public static final String ERR_MSG_MENUITEM =
        "Пожалуйста, введите число от 1 до 3\n";

    public static final String ERR_MSG_NUMBER =
        "Пожалуйста, введите целое число\n";

    public static final String ERR_MSG_NEGATIVE =
        "Пожалуйста, введите положительное число\n";
}
