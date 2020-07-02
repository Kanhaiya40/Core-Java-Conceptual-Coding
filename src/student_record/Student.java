package student_record;

import java.util.Map;

public class Student {

    private final int id;
    private final String name;
    private final String studentClass;
    private final Map<String, Double> subjectWithMarks;
    private String subject;
    private double subjectMarks;

    public Student(int studentId, String studentName, String studentClass, Map<String, Double> subjectWithMarks) {
        this.id = studentId;
        this.name = studentName;
        this.studentClass = studentClass;
        this.subjectWithMarks = subjectWithMarks;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public double getSubjectMarks() {
        return subjectMarks;
    }

    public void setSubjectMarks(double subjectMarks) {
        this.subjectMarks = subjectMarks;
    }

    public Map<String, Double> getSubjectWithMarks() {
        return subjectWithMarks;
    }


    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "" + id + ":" + studentClass + ":" + subject + ":" + name + ":" + subjectMarks;
    }
}
