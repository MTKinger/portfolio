package com.swcguild.fileinputandoutput;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class SimpleFileInput {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(new BufferedReader(new FileReader("Name.txt")));

        System.out.println("Using my powers I have figured out your name is");
        while (sc.hasNextLine()) {
            String currentLine = sc.nextLine();
            System.out.println(currentLine);
        }
    }

}
