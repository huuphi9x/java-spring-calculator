package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {
    @RequestMapping("/calculate")
    public String calculate(@RequestParam(name = "firstOperand", required = false, defaultValue = "0") double firstOperand,
                            @RequestParam(name = "secondOperand", required = false, defaultValue = "0") double secondOperand,
                            @RequestParam(name = "operator", required = false, defaultValue = "+") String operator,
                            ModelMap model) {

        double result = 0;
        switch (operator) {
            case "+": {
                result = firstOperand + secondOperand;
                operator = "Addition";
                break;
            }
            case "-": {
                result = firstOperand - secondOperand;
                operator = "Subtraction";
                break;
            }
            case "*": {
                result = firstOperand * secondOperand;
                operator = "Multiplication";
                break;
            }
            case "/": {
                result = firstOperand / secondOperand;
                operator = "Division";
                break;
            }
        }
        model.addAttribute("result", result);
        model.addAttribute("operator", operator);
        model.addAttribute("firstOperand", firstOperand);
        model.addAttribute("secondOperand", secondOperand);
        return "index";
    }
}