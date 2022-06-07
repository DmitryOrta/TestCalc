import java.util.Scanner;
public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int operand1 = getInt();
        int operand2 = getInt();
        char operation = getOperation();
        int result = calc(operand1, operand2, operation);
        System.out.println("Результат "+result);
    }

    public static int getInt() {
        System.out.println("Введите число");
        int operand1;
        if(scanner.hasNextInt()) {
            operand1 = scanner.nextInt();
        } else {
            System.out.println("Вы допустили ошибку, введите еще раз");
            scanner.next();
            operand1 = getInt();
        }
        return operand1;

    }
    public static char getOperation() {
        System.out.println("Введите операцию");
        char operation;
        if(scanner.hasNext()) {
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Вы допустили ошибку, введите еще раз");
            scanner.next();
            operation = getOperation();
        }
        return operation;

    }
    public static int calc (int operand1, int operand2, char operation) {
        int result;
        switch (operation) {
            case '+':
                result = operand1 + operand2;
                break;
            case '-':
                result = operand1 - operand2;
                break;
            case '*':
                result = operand1 * operand2;
                break;
            case '/':
                result = operand1 / operand2;
                break;
            default: {
                System.out.println("Ввод операции не верный, попробуйте еще раз.");
                result = calc(operand1, operand2, getOperation());
            }
        }
        return result;
    }
}
