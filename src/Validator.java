public class Validator {

    public static void CheckNumberTypes(String[] numbers) throws Exception {
        boolean isFirstRoman = Roman.isRoman(numbers[0]);
        boolean isSecondRoman = Roman.isRoman(numbers[1]);

        if(isFirstRoman != isSecondRoman) {
            throw new Exception("Калькулятор работает либо с римскими, либо с арабскими числами одновременно");
        }
    }
}
