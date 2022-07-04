package pr.dao;

import org.springframework.stereotype.Component;
import pr.exseption.CalcDAOExseption;
import pr.math.MathCalc;
import pr.model.Calc;

import java.util.ArrayList;
import java.util.List;

@Component
public class CalcDAO {
    private List<Double> resultList;

    private double result;
    private MathCalc mathCalc;

    public List<Double> index() {
        return resultList;
    }

    public void save(Calc calc) {
        resultList = new ArrayList<>();
        mathCalc = new MathCalc();
        try {
            result = mathCalc.calcNumber(calc);
        } catch (CalcDAOExseption e) {
            e.printStackTrace();
        }
        resultList.add(result);
    }
}
