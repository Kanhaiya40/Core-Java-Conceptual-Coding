package student_record;

import java.io.IOException;
import java.util.*;

public class StudentRanks {

    final Set<String> subjects;
    private final List<Student> studentRecord;

    StudentRanks(String filePath) throws IOException {
        StudentRecordParser studentRecordClass = new StudentRecordParser();
        studentRecord = studentRecordClass.parse(filePath);
        subjects = studentRecordClass.subjects;
    }

    public List<Student> getListOfSortedStudents(String instantSubject) {
        List<Student> sortedListOfStudent = new ArrayList<>();
        List<Map.Entry<Student, Double>> list = new ArrayList<>(getListOfStudentWithParticularSubjectMarks(instantSubject).entrySet());
        list.sort((o1, o2) -> o2.getValue().compareTo(o1.getValue()));
        for (Map.Entry<Student, Double> entry : list) {
            sortedListOfStudent.add(entry.getKey());
        }
        return sortedListOfStudent;
    }

    private Map<Student, Double> getListOfStudentWithParticularSubjectMarks(String instantSubject) {
        double subjectMarks;
        Map<Student, Double> studentWithTheirMarks = new HashMap<>();
        for (Student student : studentRecord) {
            Map<String, Double> subjectWithMarks = student.getSubjectWithMarks();
            if (subjectWithMarks.containsKey(instantSubject)) {
                subjectMarks = subjectWithMarks.get(instantSubject);
                studentWithTheirMarks.put(student, subjectMarks);
            }
        }
        return studentWithTheirMarks;
    }
}

