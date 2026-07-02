import java.util.HashMap;
import java.util.Map;

public class New2 {
    public static void main(String[] args) {
        Map<String,String> student = new HashMap<>();
        student.put("Name", "Subhakar");
        student.put("City", "Hyderabad");
        student.put("Course", "Selenium");
        System.out.println(student);
        System.out.println(student.get("Name"));
        student.put("Name", "Sai");
        System.out.println(student);
        student.remove("Name");
        System.out.println(student);
        System.out.println(student.containsKey("City"));
        System.out.println(student.containsValue("Hyderabad"));


    }
}
