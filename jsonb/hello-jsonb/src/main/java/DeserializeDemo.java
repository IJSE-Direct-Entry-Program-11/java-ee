import jakarta.json.bind.Jsonb;
import jakarta.json.bind.JsonbBuilder;

import java.util.ArrayList;

public class DeserializeDemo {

    public static void main(String[] args) {
        String json = "[{\"id\":1,\"marks\":75,\"name\":\"Kasun\"},{\"id\":2,\"marks\":80,\"name\":\"Nuwan\"}]";
        Jsonb jsonb = JsonbBuilder.create();
        ArrayList<Student> studentList = jsonb.fromJson(json, ArrayList.class);
        System.out.println(studentList);
    }
}
