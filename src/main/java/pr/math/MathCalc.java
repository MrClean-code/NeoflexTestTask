package pr.math;

import pr.exseption.CalcDAOExseption;
import pr.model.Calc;


public class MathCalc {
    private double result;

    public Double calcNumber(Calc calc) throws CalcDAOExseption {
        switch (calc.getOperation()) {
            case '+':
                result = calc.getFirstNumber() + calc.getSecondNumber();
                break;

            case '-':
                result = calc.getFirstNumber() - calc.getSecondNumber();
                break;

            case '*':
                result = calc.getFirstNumber() * calc.getSecondNumber();
                break;

            case '/':
                result = calc.getFirstNumber() / calc.getSecondNumber();
                break;

            default:
                throw new CalcDAOExseption("no operation, please write +, -, *, /.");
        }
        System.out.println(result);
        return result;
    }
}
