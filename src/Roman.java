public class Roman {
    private static final String[] romanNumbers = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
    private static final String[] Roman_ALL = {
            "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X",
            "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
            "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX",
            "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII",
            "XXXIX", "XL", "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII",
            "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
            "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
            "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX",
            "LXXX", "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII",
            "LXXXIX", "XC", "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII",
            "XCIX", "C"
    };

    public static String romanSolution(int arabNumeral) throws Exception{
        if ((arabNumeral <= 0) || (arabNumeral > Roman_ALL.length)) {
            throw new Exception("Римские числа выходят за допустимый диапазон");
        } return Roman_ALL[arabNumeral];
    }

    public static int romanNum(String roman) {
        if (roman.equals(romanNumbers[0])) {
            return 1;
        } else if (roman.equals(romanNumbers[1])) {
            return 2;
        } else if (roman.equals(romanNumbers[2])) {
            return 3;
        } else if (roman.equals(romanNumbers[3])) {
            return 4;
        } else if (roman.equals(romanNumbers[4])) {
            return 5;
        } else if (roman.equals(romanNumbers[5])) {
            return 6;
        } else if (roman.equals(romanNumbers[6])) {
            return 7;
        } else if (roman.equals(romanNumbers[7])) {
            return 8;
        } else if (roman.equals(romanNumbers[8])) {
            return 9;
        } else if (roman.equals(romanNumbers[9])) {
            return 10;
        }
        return 0;
    }

    public static boolean isRoman(String input) {
        for (String roman : romanNumbers) {
            if (roman.equals(input)) {
                return true;
            }
        } return false;
    }
}
