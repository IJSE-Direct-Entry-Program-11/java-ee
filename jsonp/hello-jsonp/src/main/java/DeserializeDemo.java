import jakarta.json.Json;
import jakarta.json.JsonObject;
import jakarta.json.JsonReader;

import java.io.StringReader;

public class DeserializeDemo {

    public static void main(String[] args) {
        String json = "{\"id\":1,\"name\":\"Kasun\",\"marks\":100}";
        JsonReader reader = Json.createReader(new StringReader(json));
        JsonObject jsonObject = reader.readObject();
        int id = jsonObject.getInt("id");
        String name = jsonObject.getString("name");
        int marks = jsonObject.getInt("marks");
        Student student = new Student(id, name, marks);
        System.out.println(student);
    }
}
