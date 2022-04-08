package pr.dao;

import org.springframework.stereotype.Component;
import pr.exseption.CalcDAOExseption;
import pr.model.Calc;

import java.util.ArrayList;
import java.util.List;

@Component
public class CalcDAO {
    private List<Calc> calcList;
    private List<Double> resultList;

    private double result;

    public List<Double> index() {
        return resultList;
    }

    public void calcNumber(Calc calc) throws CalcDAOExseption {
        calcList = new ArrayList<>();
        resultList = new ArrayList<>();

        calcList.add(calc);

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
        resultList.add(result);
    }
}
