package com.swcguild.luckysevens.controller;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class InterestCalculatorController {
    
    DecimalFormat df = new DecimalFormat("#.00");

    @RequestMapping(value = "displayInterestCalculatorForm", method = RequestMethod.GET)
    public String displayLuckySevensForm() {

        return "interestCalculatorForm";
    }

    @RequestMapping(value = "calculateInterest", method = RequestMethod.POST)
    public String placeBet(HttpServletRequest req, Model model) {
        
        double interestRate = .015;
        double moneyDeposited = Double.parseDouble(req.getParameter("moneyDeposited"));
        int yearsInvested = Integer.parseInt(req.getParameter("yearsInvested"));
        int timesCompounded = Integer.parseInt(req.getParameter("timesCompounded"));
        double endOfPeriodTotal =moneyDeposited;
        int numberOfPeriods = yearsInvested*timesCompounded;
        
        for(int i = 0; i <numberOfPeriods; i++){
            double interestEarnedThisPeriod = endOfPeriodTotal*interestRate;
            endOfPeriodTotal = endOfPeriodTotal + interestEarnedThisPeriod;
        }
        
        String initialTotal = "You began with $" + df.format(moneyDeposited) + " in your account.";
        String investmentDetails = "Interest was compounded " + timesCompounded + " times a year" +
                " over a period of " + yearsInvested + " years.";
        String finalTotal = "At the end of " + yearsInvested + " years, your account now has "
                + "a total of $" + 
                df.format(endOfPeriodTotal) + ".";
        String thankYouMessage = "Thank you for using Kinger Federal Credit Union.";
        
        model.addAttribute("initialTotal", initialTotal);
        model.addAttribute("investmentDetails", investmentDetails);
        model.addAttribute("finalTotal", finalTotal);
        model.addAttribute("thankYou", thankYouMessage);
        
        return "interestCalculatorResult";
    }
}
