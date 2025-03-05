package homework;

import java.util.Scanner;

public class Main {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            Calculator calculator = new Calculator("kiki");

            //반복문
            while (true) {

                System.out.println(" 첫번째 숫자 입력");
                int num1 = sc.nextInt();
                if (num1 < 0) {
                    System.out.println("잘못입력");
                    continue;
                }

                System.out.println(" 두번째 숫자 입력");
                int num2 = sc.nextInt();
                if (num2 < 0) {
                    System.out.println("잘못입력");
                    continue;
                }

                System.out.println("산술 연산자입력(+,-,*,/)");
                char operator = sc.next().charAt(0);

                int result = calculator.calculate(num1, num2, operator);
                if (result != Integer.MIN_VALUE) {
                    System.out.println("결과: " + result);
                }

                System.out.println("저장된 연산 결과: ");
                System.out.println(calculator.getResults());

                System.out.println("더 계산하시겠습니까? 다른 계산을 원하시면 아무문자나 누르세요.(exit 입력 시 종료)");
                if (sc.next().equals("exit")) {
                    System.out.println("종료");
                    break;


                }


            }


            sc.close();

        }
    }

