package pr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pr.dao.CalcDAO;
import pr.exseption.CalcDAOExseption;
import pr.model.Calc;

import javax.validation.Valid;

@Controller
@RequestMapping("/calculator")
public class CalcController {
    private final CalcDAO calcDAO;

    @Autowired
    public CalcController(CalcDAO calcDAO) {
        this.calcDAO = calcDAO;
    }

    // all calc
    @GetMapping("")
    public String index(Model model) {
        model.addAttribute("calculator", calcDAO.index());
        return "calculatorList";
    }

    // new calc
    @GetMapping("/new")
    public String newCalculator(Model model){
        model.addAttribute("calculator", new Calc());
        return "new";
    }

    // add
    @PostMapping()
    public String create(@ModelAttribute("calculator") @Valid Calc calc, BindingResult bindingResult) throws CalcDAOExseption {
        if (bindingResult.hasErrors()) {
            return "new";
        }
        calcDAO.save(calc);
        return "redirect:/calculator";
    }



}
