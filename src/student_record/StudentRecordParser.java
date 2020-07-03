package student_record;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class StudentRecordParser {

    final Set<String> subjects = new HashSet<>();

    public List<Student> parse(String filePath) throws IOException {
        List<Student> listOfStudentRecord = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
        String eachLine = bufferedReader.readLine();
        Student student;
        while (eachLine != null) {
            Map<String, Double> subjectWithMarks = new HashMap<>();
            String[] splitEachLine = eachLine.split(",");
            for (int j = 3; j < splitEachLine.length; j++) {
                String[] splitSubjectWithMarks = splitEachLine[j].split("=");
                subjectWithMarks.put(splitSubjectWithMarks[0], Double.parseDouble(splitSubjectWithMarks[1]));
                subjects.add(splitSubjectWithMarks[0]);
            }
            student = new Student(Integer.parseInt(splitEachLine[0]), splitEachLine[1], splitEachLine[2], subjectWithMarks);
            listOfStudentRecord.add(student);
            eachLine = bufferedReader.readLine();
        }
        return listOfStudentRecord;
    }
}
