package homework;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

    //속성
    private String name;
    private List<Integer> results;

    //생성자
    public Calculator(String name) {
        this.name = name;
        this.results = new ArrayList<>();
    }

    //기능
    public int calculate(int num1, int num2, char operator) {

        int result = 0;


        switch (operator) {
            case '+':
                result = num1 + num2;
                break;

            case '-':
                result = num1 - num2;
                break;

            case '*':
                result = num1 * num2;
                break;

            case '/':
                if (num2 == 0) {
                    System.out.println("0으로 나눌 수 없음");
                    return Integer.MIN_VALUE;

                }
                result = num1 / num2;
                break;

            default:
                System.out.println("잘못된 연산자 입력");
                return Integer.MIN_VALUE;


        }
        results.add(result);
        return result;
    }

    public List<Integer> getResults () {
        return results;
    }
}

