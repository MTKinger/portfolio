/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.serverinventory.ui;

import java.time.LocalDate;


public interface UserIO {

    double getDouble(String prompt);

    double getDouble(String prompt, double min, double max);

    float getFloat(String prompt);

    float getFloat(String prompt, float min, float max);

    int getInt(String prompt);

    int getInt(String prompt, int min, int max);

    String getString(String prompt);

    void printMessage(String prompt);

    void printMessageNoReturn(String prompt);
    
    LocalDate getIsoDate(String prompt);
    
}
