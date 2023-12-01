import jakarta.json.bind.Jsonb;
import jakarta.json.bind.JsonbBuilder;

import java.util.List;

public class SerializeDemo {

    public static void main(String[] args) {
        Student kasun = new Student(1, "Kasun", 75);
        Student nuwan = new Student(2, "Nuwan", 80);
        Jsonb jsonb = JsonbBuilder.create();
        String json1 = jsonb.toJson(kasun);
        String json2 = jsonb.toJson(nuwan);
        List<Student> studentList = List.of(kasun, nuwan);
        String json3 = jsonb.toJson(studentList);
        System.out.println(json1);
        System.out.println(json2);
        System.out.println(json3);
    }
}
