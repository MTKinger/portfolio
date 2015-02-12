package com.swcguild.fileinputandoutput;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class HighScore {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        PrintWriter out = new PrintWriter(new FileWriter("HighScore.txt"));

        System.out.println("You got a High Score!!!");
        System.out.println("");
        System.out.print("Please enter your score: ");
        int highScore = sc.nextInt();
        System.out.print("Please enter your name: ");
        String playerName = sc.next();
        System.out.println("Data stored into HighScore.txt.");
        out.println(highScore);
        out.println(playerName);
        out.flush();
        out.close();

    }

}
