public class NumberRangeValidator {
    public static int parseNumber(String number) throws Exception {
        int arabicNumber = Roman.romanNum(number);
        if (arabicNumber == 0) {
            arabicNumber = Integer.parseInt(number);
        }
        if (arabicNumber < 0 || arabicNumber > 10) {
            throw new Exception("Калькулятор работает только с числами от 1 до 10.");
        }
        return arabicNumber;
    }
}
