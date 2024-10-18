public class ExpressionSplitter {
    public static String[] splitExpression(String input, String operatorStr) throws Exception {
        String numbers[] = input.split(operatorStr);
        if (numbers.length != 2) {
            throw new Exception("Калькулятор работает только с двумя числами.");
        }
        return numbers;
    }
}
