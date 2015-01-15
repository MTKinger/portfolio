package com.swcguild.studentquizscores;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class StudentQuizScores {

    public static void main(String[] args) {

        HashMap<String, ArrayList> map = new HashMap<>();
        Set<String> keys = map.keySet();

        addStudentNoPrompt(map, "Mike King", 95, 81, 86);
        addStudentNoPrompt(map, "Jess Gryn", 70, 82, 74);
        addStudentNoPrompt(map, "Adam Day", 93, 89, 83);

        int menu = getMenuChoice();

        while (menu >= 1 && menu <= 8) {

            if (menu == 1) {
                printNames(map);
            } else if (menu == 2) {
                addStudent(map);
            } else if (menu == 3) {
                removeStudent(map);
            } else if (menu == 4) {
                viewAStudentsScores(map);
            } else if (menu == 5) {
                printAverage(map);
            } else if (menu == 6) {
                printClassAverage(map);
            } else if (menu == 7) {
                printHighScore(map);
            } else if (menu == 8) {
                printLowScore(map);
            }
            menu = getMenuChoice();
        }
        System.out.println("\nGOODBYE!!!");
    }

    public static String getName() {
        ConsoleIO cio = new ConsoleIO();
        String name = cio.getString("\nEnter Student Name: ");
        return name;
    }

    public static ArrayList addQuizzes() {
        ConsoleIO cio = new ConsoleIO();
        ArrayList<Double> quizScores = new ArrayList<>();
        int numQuizzes = 0;
        numQuizzes = cio.getInt("\nHow many quizzes to add: ");
        for (int i = 0; i < numQuizzes; i++) {
            quizScores.add(cio.getDouble("\nPlease enter quiz score: ", 0, 100));
        }
        return quizScores;
    }

    public static int getMenuChoice() {
        ConsoleIO cio = new ConsoleIO();
        String menu = "\n\nPlease make a choice\n\t1.View all Students\n\t2.Add a "
                + "Student\n\t3.Remove a Student\n\t4.View a Student's Quiz"
                + " Scores\n\t5.View a Students Average\n\t6.View Class Average"
                + "\n\t7.Show Highest Quiz Score\n\t"
                + "8.Show Low Quiz Score\n\t9.Quit";
        int choice = cio.getInt(menu, 1, 9);
        return choice;
    }

    public static HashMap addStudent(HashMap map) {
        String name = getName();
        ArrayList list = addQuizzes();
        map.put(name, list);
        return map;
    }

    public static void printNames(HashMap map) {
        Set<String> keys = map.keySet();
        System.out.println("");
        for (String name : keys) {
            System.out.print("\nStudent:  " + name + "");
        }
    }

    public static void viewAStudentsScores(HashMap map) {
        ConsoleIO cio = new ConsoleIO();
        String studentName = cio.getString("\nWhich "
                + "student's scores do you want to see?");
        ArrayList list = (ArrayList) map.get(studentName);
        Iterator<Double> iter = list.iterator();
        System.out.println("\n" + studentName + "'s Scores:  ");
        while (iter.hasNext()) {
            double current = iter.next();
            System.out.println(current);
        }
    }

    public static void printAverage(HashMap map) {
        ConsoleIO cio = new ConsoleIO();
        String studentName = cio.getString("\nWhich students average"
                + " would you like to view?");
        ArrayList list = (ArrayList) map.get(studentName);
        Iterator<Double> iter = list.iterator();

        double sum = 0;
        double current;
        int count = 0;
        double average = 0;

        while (iter.hasNext()) {
            current = iter.next();
            sum = sum + current;
            count++;
            average = sum / count;

        }
        System.out.println("\n" + studentName + "'s average: " + average);
    }

    public static HashMap addStudentNoPrompt(HashMap map, String name, double q1, double q2, double q3) {
        ArrayList<Double> list = new ArrayList();
        list.add(q1);
        list.add(q2);
        list.add(q3);
        map.put(name, list);
        return map;
    }

    public static HashMap removeStudent(HashMap map) {
        String name = getName();
        map.remove(name);
        return map;
    }

    public static void printClassAverage(HashMap<String, ArrayList> map) {
        double sum = 0;
        double current;
        int count = 0;
        double average = 0;

        Set<String> keys = map.keySet();
        for (String k : keys) {
            ArrayList list = map.get(k);
            Iterator<Double> iter = list.iterator();
            while (iter.hasNext()) {
                current = iter.next();
                sum = sum + current;
                count++;
                average = sum / count;

            }
        }
        System.out.println("\nClass Average: " + average);
    }

    public static void printHighScore(HashMap<String, ArrayList> map) {
        double max = 0;
        String highStudent = "";

        Set<String> keys = map.keySet();
        for (String k : keys) {
            ArrayList list = map.get(k);
            Iterator<Double> iter = list.iterator();
            while (iter.hasNext()) {
                double current = iter.next();
                if (current > max) {
                    highStudent = k;
                    max = current;
                }
            }
        }
        System.out.println("\nThe High Score for the class was: " + highStudent
                + " with a score of " + max + ".");
    }

    public static void printLowScore(HashMap<String, ArrayList> map) {
        double min = 100;
        String lowStudent = "";

        Set<String> keys = map.keySet();
        for (String k : keys) {
            ArrayList list = map.get(k);
            Iterator<Double> iter = list.iterator();
            while (iter.hasNext()) {
                double current = iter.next();
                if (current <= min) {
                    lowStudent = k;
                    min = current;
                }
            }
        }
        System.out.println("\nThe Low Score for the class was: " + lowStudent
                + " with a score of " + min + ".");
    }

}
