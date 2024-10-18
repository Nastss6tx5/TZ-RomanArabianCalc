public class ExpressionProcessor {

    public static String processExpression(String input) throws Exception {
        char operator = OperatorFinder.findOperator(input);
        String operatorStr = OperatorFinder.OperatorToString(operator);

        String[] numbers = ExpressionSplitter.splitExpression(input, operatorStr);

        Validator.CheckNumberTypes(numbers);

        int num1 = NumberParses.parseNumber(numbers[0]);
        int num2 = NumberParses.parseNumber(numbers[1]);
        int result = Calculation.calculate(num1, num2, operator);

        if (Roman.isRoman(numbers[0])&&Roman.isRoman(numbers[1])){
            if (result<=0) {
                throw new Exception("Результат римских чисел должен быть больше 0.");
            } return  Roman.romanSolution(result);
        } else {
            return Integer.toString(result);
        }
    }
}

