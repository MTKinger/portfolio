package com.swcguild.largenumbers.dao;

import java.util.ArrayList;
import java.util.Collections;

public class CalculatorImpl implements Calculator {
    

    @Override
    public String add(String numtoBeAdded) {
        numtoBeAdded = numtoBeAdded.replace('+', ',');
        String[] twoStrings = new String[2];
        twoStrings = numtoBeAdded.split(",");
        char[] firstNumber = twoStrings[0].toCharArray();
        char[] secondNumber = twoStrings[1].toCharArray();
        char[] newFirstNumber = firstNumber;
        char[] newSecondNumber = secondNumber;

        if (firstNumber.length > secondNumber.length) {
            char[] zeroesToAdd = new char[(firstNumber.length - secondNumber.length)];
            for (int i = 0; i < (firstNumber.length - secondNumber.length); i++) {
                zeroesToAdd[i] = 48;
            }
            newSecondNumber = new char[firstNumber.length];
            for (int i = 0; i < zeroesToAdd.length; i++) {
                newSecondNumber[i] = zeroesToAdd[i];
            }
            for (int i = zeroesToAdd.length; i < firstNumber.length; i++) {
                newSecondNumber[i] = secondNumber[(i - zeroesToAdd.length)];
            }
        }

        if (secondNumber.length > firstNumber.length) {
            char[] zeroesToAdd = new char[(secondNumber.length - firstNumber.length)];
            for (int i = 0; i < (secondNumber.length - firstNumber.length); i++) {
                zeroesToAdd[i] = 48;
            }
            newFirstNumber = new char[secondNumber.length];
            for (int i = 0; i < zeroesToAdd.length; i++) {
                newFirstNumber[i] = zeroesToAdd[i];
            }
            for (int i = zeroesToAdd.length; i < secondNumber.length; i++) {
                newFirstNumber[i] = firstNumber[(i - zeroesToAdd.length)];
            }
        }

        String sum;
        boolean carryThe1 = false;
        ArrayList<Byte> sumArray = new ArrayList<>();
        for (int i = newFirstNumber.length - 1; i >= 0; i--) {
            byte firstNumberDigit = (byte) newFirstNumber[i];
            byte secondNumberDigit = (byte) newSecondNumber[i];
            if (carryThe1 == true) {
                firstNumberDigit++;
            }
            byte sumDigit = (byte) (firstNumberDigit + secondNumberDigit);
            if ((byte) (sumDigit-96) > 9 && i!=0) {
                sumDigit = (byte) (sumDigit - 10);
                carryThe1 = true;
            } else {
                carryThe1 = false;

            }
            sumDigit = (byte)(sumDigit-96);
            sumArray.add(sumDigit);
        }
        Collections.reverse(sumArray);
        StringBuilder sb = new StringBuilder();
        for(Byte current : sumArray){
            if(current > 9){
                sb.append(1);
                sb.append(current%10);
            }else{
            sb.append((int)current);
            }
        }
        return sb.toString();
    }

    @Override
    public String subtract(String string
    ) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String multiply(String string
    ) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String divide(String string
    ) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
