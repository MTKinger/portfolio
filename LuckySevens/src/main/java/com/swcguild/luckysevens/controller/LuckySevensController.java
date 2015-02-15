package com.swcguild.luckysevens.controller;

import java.util.Random;
import java.util.Scanner;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LuckySevensController {

    @RequestMapping(value="displayLuckySevensForm", method=RequestMethod.GET)
    public String displayLuckySevensForm(){
        
        return "luckySevensForm";
    }
    
    @RequestMapping(value="placeBet", method=RequestMethod.POST)
    public String placeBet(HttpServletRequest req, Model model){
        
        String betAmmountString = req.getParameter("betAmount");
        int betAmmount = Integer.parseInt(betAmmountString);
        int ammountWagered = betAmmount;
        int gamesPlayed = 0;
        int maxGamesPlayed = 0;
        int maxDollars = betAmmount;
        Random dice1 = new Random ();
        Random dice2 = new Random ();
        int dice1Result = 0;
        int dice2Result = 0;
        Scanner kb = new Scanner (System.in);
        int sum = 0;
        
        do { 
                
                dice1Result = 1 + dice1.nextInt(6);
                dice2Result = 1 + dice2.nextInt(6);
                sum = dice1Result + dice2Result;
                
                if ( sum == 7 )
                { betAmmount += 4;
                gamesPlayed ++;
                }
                else {
                    betAmmount -- ;
                    gamesPlayed ++;
                }
                
                if ( betAmmount > maxDollars ) {
                    maxDollars = betAmmount;
                    
                }
                
                if ( maxDollars == betAmmount ) {
                    maxGamesPlayed = gamesPlayed;
                }
                
            } while (betAmmount > 0);
        
        
        
        
        
        String message = "You bet $" + ammountWagered + ".";
        String maxMoneyMessage = "The maximum ammount you had was " + maxDollars + " , which you had after " + maxGamesPlayed + " games.";
        
        model.addAttribute("resultMessage", message);
        model.addAttribute("maxMoneyMessage", maxMoneyMessage);
        return "luckySevensResult";
    }

}
