public class OperatorFinder {

    public static char findOperator (String input) throws Exception {
        for (int i=0; i<input.length();i++){
            char currentChar = input.charAt(i);
            if (isOperator(currentChar))
                return currentChar;
        } throw new Exception("Нет символа для операции.");
    }

    public static boolean isOperator(char ch){
        return ch=='+' || ch=='-' || ch=='*' || ch=='/';
    }

    public static String OperatorToString(char operator) throws Exception{
        switch (operator){
            case '+':
                return "\\+";
            case '-':
                return "-";
            case '*':
                return "\\*";
            case '/':
                return "/";
            default:
                throw new Exception("Некорректный оператор.");
        }
    }
}
