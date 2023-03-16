package pro.sky.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    @GetMapping("/data")
    String showData(@RequestParam (required = false) String num1, @RequestParam (required = false) String num2) {
        return "1: " + num1 + ", 2:" + num2;
    }
}
