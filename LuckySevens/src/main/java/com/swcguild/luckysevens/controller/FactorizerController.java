package com.swcguild.luckysevens.controller;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FactorizerController {

    @RequestMapping(value = "displayFactorizerForm", method = RequestMethod.GET)
    public String displayLuckySevensForm() {

        return "factorizerForm";
    }

    @RequestMapping(value = "factorNumber", method = RequestMethod.POST)
    public String placeBet(HttpServletRequest req, Model model) {

        String numberToBeFactoredString = req.getParameter("numberToFactor");
        int numberToBeFactored = Integer.parseInt(numberToBeFactoredString);
        int numberOfFacctors = 1;
        int sumOfFactors = 0;
        List<Integer> factorList = new ArrayList<>();
        

        for (int i = 1; i < numberToBeFactored; i++) {
            if (numberToBeFactored % i == 0) {
                numberOfFacctors++;
                sumOfFactors += i;
                factorList.add(i);
            }
        }
        factorList.add(numberToBeFactored);

            String primeMessage = "";
            String perfectMessage = "";
            String factorListString = "";

            if (numberOfFacctors == 2) {
                primeMessage = numberToBeFactored + " is a prime number.";
            } else {
                primeMessage = numberToBeFactored + " is not a prime number.";
            }

            if (sumOfFactors == numberToBeFactored) {
                perfectMessage = numberToBeFactored + " is a perfect number.";
            } else {
                perfectMessage = numberToBeFactored + " is not a perfect number.";
            }


        factorListString = "List of Factors for " + numberToBeFactored + ":";
        
        model.addAttribute("primeMessage", primeMessage);
        model.addAttribute("perfectMessage", perfectMessage);
        model.addAttribute("factorString", factorListString);
        model.addAttribute("factorList", factorList);

        return "factorizerResult";
    }

}
