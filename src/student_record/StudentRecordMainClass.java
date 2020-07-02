package student_record;

import java.io.IOException;
import java.util.*;

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
            TreeSet<Student> listOfStudentRecord = studentRanks.sortedStudentRecord(instantSubject);
            Iterator<Student> iterator = listOfStudentRecord.iterator();
            List<Student> listOfStudentRecord1 = new ArrayList<>();
            while (iterator.hasNext()) {
                listOfStudentRecord1.add(iterator.next());
            }
            for (int i = 0; i < noOfRecords; i++) {
                try {
                    Student student = listOfStudentRecord1.get(i);
                    System.out.println(student);
                } catch (IndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                    break;
                }
            }
            System.out.println();
        }
    }
}
