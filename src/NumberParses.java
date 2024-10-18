public class NumberParses {
    public static int parseNumber(String number) throws Exception {
        int arabicNumber = Roman.romanNum(number);
        if (arabicNumber == 0) {
            arabicNumber = Integer.parseInt(number);
        }
        if (arabicNumber < 0 || arabicNumber > 10) {
            throw new Exception("Калькулятор работает только с числами ");
        }
        return arabicNumber;
    }
}
