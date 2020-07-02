package student_record;

import java.io.IOException;
import java.util.*;

public class StudentRanks {
    List<Student> studentRecord;
    Set<String> subjects;
    StudentRecord studentRecordClass = new StudentRecord();

    StudentRanks(String filePath) throws IOException {
        studentRecord = studentRecordClass.getStudentRecordParser(filePath);
        subjects = studentRecordClass.setOfSubject;
    }


    public List<Student> getStudentWithMarks(String instantSubject) {
        List<Student> listOfStudentWithParticularSubject = new ArrayList<>();
        for (Student student : studentRecord) {
            double subjectMarks;
            Map<String, Double> subjectWithMarks = student.getSubjectWithMarks();
            if (subjectWithMarks.containsKey(instantSubject)) {
                subjectMarks = subjectWithMarks.get(instantSubject);
                student.setSubjectMarks(subjectMarks);
                student.setSubject(instantSubject);
            } else {
                continue;
            }
            listOfStudentWithParticularSubject.add(student);
        }
        return listOfStudentWithParticularSubject;
    }

    public TreeSet<Student> sortedStudentRecord(String instantSubject) {
        List<Student> getListOfStudent = getStudentWithMarks(instantSubject);
        TreeSet<Student> listOfStudent = new TreeSet<>(new ComparatorClass());
        listOfStudent.addAll(getListOfStudent);
        return listOfStudent;
    }
}

class ComparatorClass implements Comparator<Student> {

    @Override
    public int compare(Student student, Student student2) {
        double value1 = student.getSubjectMarks();
        double value2 = student2.getSubjectMarks();
        if (value1 < value2) {
            return 1;
        } else if (value1 > value2) {
            return -1;
        }
        return 0;
    }
}
