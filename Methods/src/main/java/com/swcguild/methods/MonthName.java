package com.swcguild.methods;

public class MonthName {

    public static void main(String[] args) throws Exception {
        System.out.println("Month 1: " + month_name(1));
        Thread.sleep(500);
        System.out.println("Month 2: " + month_name(2));
        Thread.sleep(500);
        System.out.println("Month 3: " + month_name(3));
        Thread.sleep(500);
        System.out.println("Month 4: " + month_name(4));
        Thread.sleep(500);
        System.out.println("Month 5: " + month_name(5));
        Thread.sleep(500);
        System.out.println("Month 6: " + month_name(6));
        Thread.sleep(500);
        System.out.println("Month 7: " + month_name(7));
        Thread.sleep(500);
        System.out.println("Month 8: " + month_name(8));
        Thread.sleep(500);
        System.out.println("Month 9: " + month_name(9));
        Thread.sleep(500);
        System.out.println("Month 10: " + month_name(10));
        Thread.sleep(500);
        System.out.println("Month 11: " + month_name(11));
        Thread.sleep(500);
        System.out.println("Month 12: " + month_name(12));
        Thread.sleep(500);
        System.out.println("Month 43: " + month_name(43));
    }
    public static String month_name(int month){
        String result = "";
        if ( month == 1){
            result = "January.";
        }
        if (month == 2){
            result = "February.";
        }
        if (month == 3){
            result = "March.";
        }
        if (month ==4){
            result = "April.";
        }
        if (month == 5 ){
            result ="May.";
        }
        if (month == 6){
            result = "June.";
        }
        if (month == 7){
            result = "July.";
        }
        if (month == 8){
            result = "August.";
        }
        if (month == 9){
            result = "September.";
        }
        if (month == 10){
            result = "October.";
        }
        if (month == 11){
            result = "November.";
        }
        if (month == 12){
            result = "December.";
        }
        if (month > 12){
            result = "ERROR.";
        }
        return result;
    }

}
