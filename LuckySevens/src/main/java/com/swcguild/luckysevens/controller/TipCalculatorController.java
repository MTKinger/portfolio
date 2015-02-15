package com.swcguild.luckysevens.controller;

import java.text.DecimalFormat;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TipCalculatorController {

    DecimalFormat df = new DecimalFormat("#.00");

    @RequestMapping(value = "displayTipCalculatorForm", method = RequestMethod.GET)
    public String displayLuckySevensForm() {

        return "tipCalculatorForm";
    }

    @RequestMapping(value = "calculateTip", method = RequestMethod.POST)
    public String placeBet(HttpServletRequest req, Model model) {
        
        double checkBeforeTip = Double.parseDouble(req.getParameter("checkTotal"));
        double tipPercent = Double.parseDouble(req.getParameter("tipPercent"));
        double tipPercentMath = (tipPercent/100);
        double tipTotal = (checkBeforeTip * tipPercentMath);
        double checkAfterTip = (checkBeforeTip + tipTotal);
        
        String checkBeforeTipString = "Check Before Tip: $" + df.format(checkBeforeTip);
        String tipPercentString = "Tip Percent: " + df.format(tipPercent) + "%";
        String tipTotalString = "Tip Amount: $" + df.format(tipTotal);
        String checkAfterTipString = "Check Total Including Tip: $" + df.format(checkAfterTip);
        
        model.addAttribute("beforeTipMessage", checkBeforeTipString);
        model.addAttribute("tipPercentMessage", tipPercentString);
        model.addAttribute("tipTotalMessage", tipTotalString);
        model.addAttribute("afterTipMessage", checkAfterTipString);
        
        
        return "tipCalculatorResult";
    }

}
