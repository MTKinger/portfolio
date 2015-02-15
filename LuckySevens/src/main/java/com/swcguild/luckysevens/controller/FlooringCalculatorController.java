package com.swcguild.luckysevens.controller;

import java.text.DecimalFormat;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FlooringCalculatorController {

    DecimalFormat df = new DecimalFormat("#.00");

    @RequestMapping(value = "displayFlooringCalculatorForm", method = RequestMethod.GET)
    public String displayLuckySevensForm() {

        return "flooringCalculatorForm";
    }

    @RequestMapping(value = "calculateOrder", method = RequestMethod.POST)
    public String placeBet(HttpServletRequest req, Model model) {

        String companyName = req.getParameter("companyName");
        double orderArea = Double.parseDouble(req.getParameter("orderArea"));
        String state = req.getParameter("orderState");
        String product = req.getParameter("orderProduct");
        double taxRate = 0;
        double costPSF = 0;
        double laborPSF = 0;
        double costTotal = 0;
        double laborTotal = 0;
        double taxTotal = 0;
        double total = 0;
        double totalAfterTax = 0;
        String orderMessage = "";

        if (state.equalsIgnoreCase("Ohio")) {
            taxRate = .0625;
        } else if (state.equalsIgnoreCase("Pennsylvania")) {
            taxRate = .0675;
        } else if (state.equalsIgnoreCase("Indiana")) {
            taxRate = .0575;
        } else if (state.equalsIgnoreCase("Michigan")) {
            taxRate = .0650;
        } else {
            taxRate = 0;
        }

        if (product.equalsIgnoreCase("Wood")) {
            costPSF = 5.15;
            laborPSF = 4.75;
        } else if (product.equalsIgnoreCase("Tile")) {
            costPSF = 3.5;
            laborPSF = 4.15;
        } else if (product.equalsIgnoreCase("Carpet")) {
            costPSF = 2.25;
            laborPSF = 2.10;
        } else if (product.equalsIgnoreCase("Laminate")) {
            costPSF = 1.75;
            laborPSF = 2.10;
        } else {
            costPSF = 0;
            laborPSF = 0;
        }

        if (taxRate == 0) {
            orderMessage = "We're sorry, but it appears the state you have entered is not in our database.";
        } else if (costPSF == 0 || laborPSF == 0) {
            orderMessage = "We're sorry, but it appears the product you have entered is not in our database.";
        } else if (taxRate == 0 && costPSF == 0 && laborPSF == 0) {
            orderMessage = "We're sorry, but it appears the product and state you have entered are not in our database.";
        } else {
            costTotal = costPSF * orderArea;
            laborTotal = laborPSF * orderArea;
            total = costTotal + laborTotal;
            taxTotal = total * taxRate;
            totalAfterTax = total + taxTotal;

            orderMessage = "-Order Details-";
        }

        String companyMessage = "Company Name: " + companyName;
        String materialMessage = "Material Total: $" + df.format(costTotal);
        String laborMessage = "Labor Total: $" + df.format(laborTotal);
        String taxMessage = "Tax Total: $" + df.format(taxTotal);
        String finalMessage = "Final Cost: $" + df.format(totalAfterTax);
        String thankYouMessage = "THANK YOU FOR YOUR ORDER!";

        model.addAttribute("orderMessage", orderMessage);
        model.addAttribute("companyMessage", companyMessage);
        model.addAttribute("materialMessage", materialMessage);
        model.addAttribute("laborMessage", laborMessage);
        model.addAttribute("taxMessage", taxMessage);
        model.addAttribute("finalMessage", finalMessage);
        model.addAttribute("thankYouMessage", thankYouMessage);
        
        return "flooringCalculatorResult";
    }
}
