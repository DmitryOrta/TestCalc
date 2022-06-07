import java.util.Scanner;
public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int operand1 = getInt();
        int operand2 = getInt();
        char operation = getOperation();
        int result = calc(operand1, operand2, operation);
        System.out.println("��������� "+result);
    }

    public static int getInt() {
        System.out.println("������� �����");
        int operand1;
        if(scanner.hasNextInt()) {
            operand1 = scanner.nextInt();
        } else {
            System.out.println("�� ��������� ������, ������� ��� ���");
            scanner.next();
            operand1 = getInt();
        }
        return operand1;

    }
    public static char getOperation() {
        System.out.println("������� ��������");
        char operation;
        if(scanner.hasNext()) {
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("�� ��������� ������, ������� ��� ���");
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
                System.out.println("���� �������� �� ������, ���������� ��� ���.");
                result = calc(operand1, operand2, getOperation());
            }
        }
        return result;
    }
}
