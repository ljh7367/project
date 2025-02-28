package Calculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("첫번째 숫자를 넣으시오: ");
            int num1 = scanner.nextInt();

            System.out.print("사칙연산 부호를 넣으시오 +, -, *, /:  ");
            char operator = scanner.next().charAt(0);

            System.out.print("두번째 숫자를 넣으시오: ");
            int num2 = scanner.nextInt();


            switch (operator) {
                case '+':
                    System.out.println(num1 + num2);
                    break;
                case '-':
                    System.out.println(num1 - num2);
                    break;
                case '*':
                    System.out.println(num1 * num2);
                    break;
                case '/':
                    System.out.println(num1 / num2);
                    break;

            }
            System.out.println("더 계산하시겠습니까?(yes 입력 시 계속진행) (exit 입력 시 종료)");
            String answer = scanner.next();

            if (answer.equals("exit")) {
                System.out.println("계산을 종료합니다");
                break;
            }
            if (answer.equals("yes")) {
                System.out.println("계산을 다시 시작합니다");


            }
        }


    }
}
