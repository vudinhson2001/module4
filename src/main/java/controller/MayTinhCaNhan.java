package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class MayTinhCaNhan {
    @GetMapping("/maytinh")
    public String loadIndex() {
        return ("index");
    }

    @GetMapping("/result")
    public String loadResult(@RequestParam double first, double second,String operator, Model model) {
        double result;

        try {
            result = 0;
            switch (operator) {
                case "+":
                    result = first + second;
                    break;
                case "-":
                    result = first - second;
                    break;
                case "*":
                    result = first * second;
                    break;
                case "/":
                    result = first / second;
                    break;
            }
            model.addAttribute("result", result);
        } catch (Exception ex) {
            ex.printStackTrace();

        }
        return "index";
    }
}

