import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class dictionary {

    public static void main(String[] args) {
        // Sample input data (replace with your actual data)
        List<Student> students = new ArrayList<>();
        students.add(new Student("XX", 10, "xyz", "+917878787878",
                new HashMap<>() {{ put("English", 1); put("Science", 128); put("Maths", 27); }}));
        students.add(new Student("YY", 10, "xyz", "+917878787879",
                new HashMap<>() {{ put("English", 1); put("Science", 128); }}));

        // Process data and generate output
        Map<String, List<String>> output = processStudentData(students);

        // Print the output
        System.out.println(output);
    }

    public static Map<String, List<String>> processStudentData(List<Student> students) {
        Map<String, List<String>> output = new HashMap<>();

        for (Student student : students) {
            output.put(student.getName(), new ArrayList<>(student.getSubjects().keySet()));
        }

        return output;
    }
}

class Student {
    private String name;
    private int classNumber;
    private String address;
    private String phone;
    private Map<String, Integer> subjects;

    public Student(String name, int classNumber, String address, String phone, Map<String, Integer> subjects) {
        this.name = name;
        this.classNumber = classNumber;
        this.address = address;
        this.phone = phone;
        this.subjects = subjects;
    }

    public String getName() {
        return name;
    }

    public Map<String, Integer> getSubjects() {
        return subjects;
    }
}