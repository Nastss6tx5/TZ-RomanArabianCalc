import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) throws Exception {
        System.out.println("Калькулятор умеет выполнять операции сложения, вычитания, умножения ");
        System.out.println("и деления с двумя числами: a+b, a-b, a*b, a/b.");
        System.out.println("Калькулятор умеет работать одновременно только с арабскими (1,2,3,4,5…),");
        System.out.println("или с римскими (I,II,III,IV,V…) целыми числами от 1 до 10.");

        Scanner s = new Scanner(System.in);
        System.out.println("Введите выражение: ");
        String input = s.nextLine();
        System.out.println("Результат выражения: " + ExpressionProcessor.processExpression(input));
    }
}
