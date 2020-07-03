package student_record;

import java.util.Map;

public class Student {

    private final int id;
    private final String name;
    private final String studentClass;
    private final Map<String, Double> subjectWithMarks;

    public Student(int studentId, String studentName, String studentClass, Map<String, Double> subjectWithMarks) {
        this.id = studentId;
        this.name = studentName;
        this.studentClass = studentClass;
        this.subjectWithMarks = subjectWithMarks;
    }

    public Map<String, Double> getSubjectWithMarks() {
        return subjectWithMarks;
    }


    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "" + id + ":" + subjectWithMarks + ":" + studentClass + ":" + name;
    }
}
