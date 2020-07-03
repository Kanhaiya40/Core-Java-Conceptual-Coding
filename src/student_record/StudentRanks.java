package student_record;

import java.io.IOException;
import java.util.*;

public class StudentRanks {

    private final Set<String> subjects;
    private final List<Student> studentRecord;

    StudentRanks(String filePath) throws IOException {
        StudentRecordParser studentsRecord = new StudentRecordParser();
        studentsRecord.parse(filePath);
        studentRecord = studentsRecord.getStudentRecords();
        subjects = studentsRecord.getSubjects();
    }

    public Set<String> getSubjects() {
        return subjects;
    }

    public List<Student> sortedStudentsRecord(String currentSubject) {
        List<Student> sortedStudentsRecord = new ArrayList<>();
        List<Map.Entry<Student, Double>> list = new ArrayList<>(studentsWithCurrentSubject(currentSubject).entrySet());
        list.sort((o1, o2) -> o2.getValue().compareTo(o1.getValue()));
        for (Map.Entry<Student, Double> entry : list) {
            sortedStudentsRecord.add(entry.getKey());
        }
        return sortedStudentsRecord;
    }

    private Map<Student, Double> studentsWithCurrentSubject(String currentSubject) {
        double currentSubjectMarks;
        Map<Student, Double> studentsRecord = new HashMap<>();
        for (Student student : studentRecord) {
            Map<String, Double> subjectWithMarks = student.getSubjectWithMarks();
            if (subjectWithMarks.containsKey(currentSubject)) {
                currentSubjectMarks = subjectWithMarks.get(currentSubject);
                studentsRecord.put(student, currentSubjectMarks);
            }
        }
        return studentsRecord;
    }
}

