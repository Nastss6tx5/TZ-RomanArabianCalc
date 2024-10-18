public class Calculation {
    public static int calculate(int num1, int num2, char operator) throws Exception {
        switch (operator){
            case '+': return num1 + num2;
            case '-': return num1 - num2;
            case '*': return num1 * num2;
            case '/':
                if (num2==0) {
                    throw new Exception("Деление на ноль невозможною");
                }
                return num1 / num2;
            default: throw new Exception("Некорректная операция");
        }
    }
}
