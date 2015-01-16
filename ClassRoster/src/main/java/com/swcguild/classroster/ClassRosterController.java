package com.swcguild.classroster;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ClassRosterController {

    ConsoleIO cio = new ConsoleIO();
    RosterBook rosterBook = new RosterBook();

    public void run() {
        boolean keepGoing = true;
        int menuSelection = 0;
        try{
        rosterBook.loadRoster();

        while (keepGoing) {
            printMenu();
            menuSelection = cio.getInt("Please select for the above choices.", 1, 5);

            switch (menuSelection) {
                case 1:
                    listStudents();
                    break;
                case 2:
                    createStudent();
                    break;
                case 3:
                    viewStudent();
                    break;
                case 4:
                    removeStudent();
                    break;
                case 5:
                    cio.printMessage("Exiting....");
                    keepGoing = false;
                    break;
                default:
                    cio.printMessage("Unknown Command...");
            }

        }
        cio.printMessage("Thank you for using our software.");
        rosterBook.writeRoster();
    }catch(FileNotFoundException ex){
    cio.printMessage("Error loading roster: Could not find file.");
}
    catch(IOException ex){
    cio.printMessage("Error writing to file.");
}
    }
    private void printMenu() {
        cio.printMessage("MAIN MENU");
        cio.printMessage("1. List Student IDs");
        cio.printMessage("2. Create New Student");
        cio.printMessage("3. View a Student");
        cio.printMessage("4. Remove a Student");
        cio.printMessage("5. Exit");
    }

    private void listStudents() {
        cio.printMessage("LIST STUDENTS");
    }

    private void createStudent() {
        String studentId = cio.getString("Please Enter Student ID:");
        String firstName = cio.getString("Please Enter Student's First Name:");
        String lastName = cio.getString("Please enter Student's last name:");
        String cohort = cio.getString("Please enter cohort:");
        Student currentStudent = new Student(studentId);
        currentStudent.setFirstName(firstName);
        currentStudent.setLastName(lastName);
        currentStudent.setCohort(cohort);
        rosterBook.addStudent(studentId, currentStudent);
        cio.getString("Student successfully created. Please press enter to continue.");
    }

    private void viewStudent() {
        String studentID = cio.getString("Please enter the student ID of the student you wish to view.");
        Student currentStudent = rosterBook.getStudent(studentID);
        if (currentStudent != null) {
            cio.printMessage(currentStudent.toString());
        } else {
            cio.printMessage("No student with Id: " + studentID);
        }
        cio.getString("Plese hit enter to continue.");
    }

    private void removeStudent() {
        String studentId = cio.getString("Please enter the student ID for the student you wish to remove");
        rosterBook.removeStudent(studentId);
        cio.getString("Please hit enter to continue.");
    }

}
