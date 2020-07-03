package student_record;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class StudentRecordMainClass {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String filepath = "/home/shubh/IdeaProjects/Java_Conceptual_code/resources/student_record";
        System.out.println("Enter No Of Data u want fetch:");
        int noOfRecords = scanner.nextInt();
        StudentRanks studentRanks = new StudentRanks(filepath);
        Set<String> getAllSubjects = studentRanks.subjects;
        for (String instantSubject : getAllSubjects) {
            System.out.println("Top " + noOfRecords + " Student Of " + instantSubject);
            List<Student> listOfStudentRecord = studentRanks.getListOfSortedStudents(instantSubject);

            for (int i = 0; i < noOfRecords; i++) {
                try {
                    Student student = listOfStudentRecord.get(i);
                    System.out.println(student);
                } catch (IndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                    break;
                }
            }
            System.out.println();
        }
    }
}
