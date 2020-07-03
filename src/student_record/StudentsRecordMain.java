package student_record;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class StudentsRecordMain {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String filePath = "/home/shubh/IdeaProjects/Java_Conceptual_code/resources/student_record";
        System.out.println("Enter No Of Data u want fetch:");
        int noOfRecords = scanner.nextInt();
        StudentRanks studentRanks = new StudentRanks(filePath);
        Set<String> allSubject = studentRanks.getSubjects();
        for (String eachSubject : allSubject) {
            System.out.println("Top " + noOfRecords + " Student Of " + eachSubject);
            List<Student> studentsRecord = studentRanks.sortedStudentsRecord(eachSubject);
            for (int i = 0; i < noOfRecords && i < studentsRecord.size(); i++) {
                Student student = studentsRecord.get(i);
                System.out.println(student);
            }
            System.out.println();
        }
    }
}
