package com.swcguild.classroster;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class RosterBook {

    public static final String ROSTER_FILE = "roster.txt";
    public static final String DELIMITER = "::";

    private HashMap<String, Student> studentMap = new HashMap<>();

    public Student addStudent(String studentId, Student student) {
        return studentMap.put(studentId, student);
    }

    public Student getStudent(String studentId) {
        return studentMap.get(studentId);
    }

    public Student removeStudent(String studentId) {
        return studentMap.remove(studentId);
    }

    public ArrayList<String> getAllStudentIds() {
        Set<String> studentIdSet = studentMap.keySet();
        ArrayList<String> studentIdList = new ArrayList<String>(studentIdSet);
        return studentIdList;
    }

    public void loadRoster() throws FileNotFoundException {
        Scanner sc = new Scanner(new BufferedReader(new FileReader(ROSTER_FILE)));
        String currentLine;
        String[] currentTokens;

        while (sc.hasNextLine()) {
            currentLine = sc.nextLine();
            currentTokens = currentLine.split(DELIMITER);
            Student currentStudent = new Student(currentTokens[0]);
            currentStudent.setFirstName(currentTokens[1]);
            currentStudent.setLastName(currentTokens[2]);
            currentStudent.setCohort(currentTokens[3]);
            studentMap.put(currentStudent.getStudentId(), currentStudent);
        }
        sc.close();
    }

    public void writeRoster() throws IOException {
        PrintWriter out = new PrintWriter(new FileWriter(ROSTER_FILE));

        ArrayList<String> studentIds = getAllStudentIds();
        for (String currentId : studentIds) {
            Student currentStudent = this.getStudent(currentId);

            out.println(currentStudent.getStudentId() + DELIMITER + currentStudent.getFirstName()
                    + DELIMITER + currentStudent.getLastName() + DELIMITER + currentStudent.getCohort());
            
            out.flush();
            
        }
        out.close();
    }
}
