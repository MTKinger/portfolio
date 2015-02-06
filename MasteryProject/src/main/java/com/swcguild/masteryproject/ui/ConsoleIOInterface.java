/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.masteryproject.ui;

/**
 *
 * @author apprentice
 */
public interface ConsoleIOInterface {
    
    public int getInt(String prompt);
    public int getInt(String prompt, int min, int max);
    public String getString(String prompt);
    public float getFloat(String prompt);
    public float getFloat(String prompt, float min, float max);
    public double getDouble(String prompt);
    public double getDouble(String prompt, double min, double max);
    public void printMessage(String prompt);
    public void printMessageNoReturn(String prompt);
    
}
