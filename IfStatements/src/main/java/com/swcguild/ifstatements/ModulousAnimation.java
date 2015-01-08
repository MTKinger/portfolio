package com.swcguild.ifstatements;

public class ModulousAnimation {
    public static void main(String[] args) throws Exception
    {
        for ( int i =0; i<80; i++){
            if(i%10 == 0)
                System.out.println("M.........");
            else if (i%10 == 1)
                System.out.println(".I........");
            else if(i%10 == 2)
                System.out.println("..K.......");
            else if(i%10 == 3)
                System.out.println("...E......");
            else if(i%10 == 4)
                System.out.println("....*.....");
            else if(i%10 == 5)
                System.out.println(".....K....");
            else if(i%10 == 6)
                System.out.println("......I...");
            else if(i%10 == 7)
                System.out.println(".......N..");
            else if(i%10 == 8)
                System.out.println("........G.");
            else if(i%10 == 9)
                System.out.println(".........!");
            
            Thread.sleep(200);
     }
}}
