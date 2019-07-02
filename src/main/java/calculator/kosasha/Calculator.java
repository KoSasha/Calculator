package calculator.kosasha;

import java.util.Scanner;

public class Calculator {

    int op1;
    int op2;
    int result;
    String oper;

    public Calculator(int x, int y, String operation) {
        this.op1 = x;
        this.op2 = y;
        this.oper = operation;
    }

    public int summation() {
        return op1 + op2;
    }

    public int multiplication() {
        return op1 * op2;
    }

    public int subtraction() {
        return op1 - op2;
    }

    public int division() {
        return op1 / op2;
    }

    public void calculation() {
        if (oper.compareTo("+") == 0) {
            result = this.summation();
        } else if (oper.compareTo("*") == 0) {
            result = this.multiplication();
        } else if (oper.compareTo("-") == 0) {
            result = this.subtraction();
        } else if (oper.compareTo("/") == 0) {
            result = this.division();
        } else {
            System.out.print("Такое не решаю.\n");
        }
    }

    public void getresult() {
        System.out.print("Результат вычислений:\n");
        System.out.println(result);
    }

    public static void main(String[] args) {
        int x = 0, y = 0, i = 0;
        String op = new String();
        String operation = new String();
        Scanner expression = new Scanner(System.in);
        System.out.println("Введите выражение в формате (и никак иначе): x + y, (x, y - целые числа, такие, что х < y; " +
                "доступны операции: +, *, -, /).\n");

        operation = expression.nextLine();
        for (String retval : operation.split(" ")) {
            if (i == 0) {
                x = Integer.parseInt(retval);
            } else if (i == 1) {
                op = retval;
            } else {
                y = Integer.parseInt(retval);
            }
            i++;
        }

        Calculator exp = new Calculator(x, y, op);
        exp.calculation();
        exp.getresult();
    }
}